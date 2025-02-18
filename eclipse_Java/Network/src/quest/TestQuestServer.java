package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TestQuestServer {

	public static void main(String[] args) {
		// 1. 서버 생성
		try (ServerSocket server = new ServerSocket(3040);
				// 2. 클라이언트 접속 대기
				Socket client = server.accept();){
			// 2-1. 연결 클라이언트 주소 확인
			System.out.println(client.getInetAddress()+" - 클라언트 연결");
			// 3. 입출력 스트림
			// 입력
			PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
			// 출력
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			pw.println("안녕 클라이언트~");
			String msg = br.readLine();
			System.out.println("클라이언트가 보낸 메시지 : "+msg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
