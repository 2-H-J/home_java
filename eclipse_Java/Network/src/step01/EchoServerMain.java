package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerMain {

	public static void main(String[] args) {
		//1. 서버 오픈
		try(ServerSocket server = new ServerSocket(12345);){
			System.out.println("에코 서버 오픈 완료 - 포트번호 12345");
			System.out.println("클라이언트 접속 대기중.....");
			//2. 클라이언트 접속 받음
			Socket client = server.accept();
			//3. 스트림 초기화
			PrintWriter pw = new PrintWriter(client.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
			//4. 입출력 처리
			//	exit 메시지를 받을때 까지 진행
			String str = null;
			while(!(str = br.readLine()).equals("exit")) {
				pw.println(str);
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
