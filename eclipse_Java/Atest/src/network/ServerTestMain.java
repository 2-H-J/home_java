package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTestMain {

	public static void main(String[] args) {
		
		System.out.println("서버가 5555포트에서 연결을 기다리는중....");
		// 서버 연결 순서
		//1. 서버를 오픈(포트번호) 생성
		//ServerSocket server = new ServerSocket(포트번호);
		try  // 예외처리 없이 //ServerSocket server = new ServerSocket(포트번호); 를 생성할 수 없음
			(ServerSocket server = new ServerSocket(5555);
			
		//2. 클라이언트의 접속 요청을 대기 : Server가 Client 연결 요청을 받기 위한 코드
			// server.accept() : 서버 소켓은 accept()<-블로킹 메서드를 호출한 후, 
			//클라이언트가 연결 요청을 보낼 때까지 블록(blocking) 상태로 대기
			// 즉 클라이언트 접속이 있을때까지 이 코드 줄에서 실행이 멈춤
			Socket client = server.accept()){
			System.out.println("클라이언트가 연결 되었습니다.");
			
		//3. 클라이언트와 통신할 수 있는 입력(PrintWriter),출력(BufferedReader) 스트림 초기화
			// client.getOutputStream() : 클라이언트로 데이터 보내기 위한 출력 스트림
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			pw.println("어서와~ 난 서버야"); // 연결된 클라이언트에게 메세지 전송
			pw.flush();// 데이터를 전송하려 할 때 마다 버퍼에 있는 데이터를 강제로 전송하는 메서드
			// 명시적으로 flush을 선언 또는 autoflsh인 true를 적용 할 수 있다.
			// PrintWriter(client.getOutputStream(), true)
			
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// InputStreamReader : 바이트 스트림을 문자 스트림으로 변환하는 클래스
			// client.getInputStream() : 소켓을 통해 상대방(서버 또는 클라이언트)으로부터 들어오는 데이터를 처리하는 데 사용
			String msg = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지 : " +msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
