package step02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiEchoServerMain {
	//접속한 클라이언트 관리
	private static ArrayList<ServerWorker> list = new ArrayList<ServerWorker>();
	
	//종료된 스레드를 제거하는 메서드
	public static void removeClient(ServerWorker worker) {
		list.remove(worker);
	}
	
	
	public static void main(String[] args) {
		// 1. 서버 오픈
		try (ServerSocket server = new ServerSocket(2222)) {
			System.out.println("서버 오픈 - 포트번호 2222");
			while(true) {
				// 2. 클라이언트 접속
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + "에서 접속함....");
				// 3. 클라이언트를 담당할 스레드 생성 후 실행
				ServerWorker worker = new ServerWorker(client);
				worker.start();
				list.add(worker);//스레드를 리스트에 추가
				System.out.println("현재 접속 인원 : " + list.size());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
