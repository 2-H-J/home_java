package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	// 접속한 클라이언트 관리
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();

	public static void main(String[] args) {
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(2222)) {
			System.out.println("서버 오픈 - 포트번호 2222");
			while (true) {
				// 2. 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속함....");
				// 3. 클라이언트를 담당할 스레드 생성 후 실행
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);// 스레드를 리스트에 추가
				System.out.println("현재 접속 인원 : " + list.size());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private static class ServerWorker extends Thread {
		private Socket client;
		private PrintWriter pw;
		
		// ServerMain으로부터 접속한 클라이언트 정보를 받아옴
		public ServerWorker(Socket client) {
			this.client = client;
			
			try {
				pw = new PrintWriter(client.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//클라이언트에게 메세지를 보내는 메서드
		public void sendMessage(String msg) {
			pw.println(msg);
			pw.flush();
		}
		
		@Override
		public void run() {
			// br 생성
			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream()));
				 ) {
				while(true) {
				// 사용자로부터 데이터 받음
					String str = br.readLine();
				// 사용자가 보낸 데이터가 exit으면 종료
					if(str.equals("exit")) break;
				// 모든 클라이언트에게 메세지를 전송하는 메서드
					String msg = client.getInetAddress() + "님의 메세지 : " + str;
					list.forEach(t -> t.sendMessage(msg));

				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				list.remove(this);
			}

		}
	}
	
}





