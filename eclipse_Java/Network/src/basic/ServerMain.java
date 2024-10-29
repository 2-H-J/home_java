package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
	ServerSocket : 서버에서 클라이언트의 연결 요청을 수락하기 위한 소켓
	Socket : 서버와 클라이언트 간의 실제 연결을 나타냄. 클라이언트 정보를 포함
	PrintWriter : 서버에서 클라이언트로 데이터를 보내기 위한 출력 스트림
	BufferedReader : 클라이언트가 보낸 데이터를 읽어들이기 위한 입력 스트림
	InputStreamReader : 바이트 단위 데이터를 문자로 변환하여 읽기 위해 BufferedReader와 함께 사용
*/
public class ServerMain {
	public static void main(String[] args) {
		// 서버 프로그램이 시작됨을 알리는 메시지 출력
		System.out.println("서버 프로그램을 실행합니다.....");

		// 서버 연결 순서
		// 1. 서버를 오픈(포트 번호 1234) - ServerSocket 객체 생성
		// try-with-resources 구문을 사용하여 ServerSocket과 Socket 자원을 자동으로 닫음
		try (ServerSocket server = new ServerSocket(5234);
				// 2. 클라이언트의 접속 요청을 대기
				// 클라이언트가 접속하면 서버는 Socket 객체를 반환하여 클라이언트와의 연결을 나타냄
				Socket client = server.accept()) { // 클라이언트가 접속할 때까지 대기

			// client.getInetAddress()는 접속한 클라이언트의 IP 주소를 반환
			System.out.println(client.getInetAddress() + " 클라이언트가 접속했습니다.");

			// 3. 클라이언트와 통신할 수 있는 입출력 스트림을 초기화
			// client.getOutputStream() : 클라이언트로 데이터를 보내기 위한 출력 스트림
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			// client.getInputStream() : 클라이언트가 보낸 데이터를 읽기 위한 입력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

			// 4. 데이터 입출력 처리
			// 4-1. 클라이언트로부터 데이터를 받음 (readLine은 줄 단위로 데이터를 읽음)
			String msg = br.readLine();
			System.out.println("클라이언트로부터 받은 메시지: " + msg); // 받은 메시지를 서버에 출력

			// 4-2. 서버에서 클라이언트에게 데이터를 전송 (PrintWriter의 println()을 사용하여 전송)
			pw.println("서버에서 보낸 데이터: 안녕하세요, 클라이언트님!");
			
			// flush()는 버퍼에 있는 데이터를 즉시 클라이언트로 전송하는 메서드
//			pw.flush(); // flush 호출로 인해 메시지가 클라이언트에게 전송됨
			//PrintWriter pw = new PrintWriter(client.getOutputStream(), true); 으로 하면 flush는 없어도 됨

			// 5. 클라이언트와의 연결 종료 (try-with-resources로 인해 자동으로 소켓이 닫힘)
			// 소켓을 명시적으로 닫지 않아도 됨 (try-with-resources가 자원을 자동으로 해제함)
		} catch (IOException e) {
			// 입출력 예외가 발생했을 때의 처리
			e.printStackTrace(); // 예외가 발생하면 오류 메시지를 출력
		}
		
		// Address already in use: bind : 서버 두번 실행해서 발생한 에러
	}
}
