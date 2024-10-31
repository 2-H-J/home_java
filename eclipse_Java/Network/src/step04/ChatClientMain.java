package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientMain {
 
	private static class Worker extends Thread{
		private Socket server;

		public Worker(Socket server) {
			this.server = server;
		}
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()))){
				while(true) {
					String str = br.readLine();
					if(str.equals("exit")) break;
					System.out.println(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try(Socket server = new Socket("192.168.20.123",2222);
				Scanner sc = new Scanner(System.in)){
			System.out.println("서버에 접속했습니다.");
			//상대방이 보낸 메세지를 받아서 출력하는 스레드 실행
			Worker worker = new Worker(server);
			worker.start();
			//사용자가 메세지 입력 후 서버로 전송하는 부분
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			while(true) {
				System.out.println("보낼 메세지 작성");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit")) break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
