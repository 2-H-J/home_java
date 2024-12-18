package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	public static void main(String[] args) {
		// new ServerSocket(3030) : 서버 오픈 객체생성 포트 3030
		try (ServerSocket server = new ServerSocket(3030);
				
				// server.accept() : 클라이언트 접속 대기
				Socket client = server.accept();){
			
			// getInetAddress() : 접속한 클라이언트 IP주소 확인
			System.out.println(client.getInetAddress()+"-> 클라이언트 접속 ");
			
			// client.getOutputStream : 클라이언트로 데이터 보내는 출력
			// , true : 보내기 완료후 버퍼에 있는 데이터 즉시 전송 없을시 pw.flush();
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			
			// client.getInputStream : 클라이언트가 보낸 데이터 읽기위한 입력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 클라이언트에게 전송
			pw.println("서버가 보낸다! 받거라~~~");
			
			//클라이언트로 입력받은 데이터 
			String msg = br.readLine();
			System.out.println("클라이언트 메시지 : "+msg);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
