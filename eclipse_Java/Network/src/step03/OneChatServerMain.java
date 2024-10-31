package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneChatServerMain {

	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(3333);
				Scanner sc = new Scanner(System.in)){
			System.out.println("서버가 오픈되었습니다. 포트번호 - 3333");
			Socket client = server.accept();
			System.out.println(client.getInetAddress()
					+ " 클라이언트가 접속하였습니다.");
			//--------------------------------------------
			//1. 상대방이 보낸 메세지를 받아서 출력할 스레드 생성
			Thread t = new Thread(() -> {
				try(BufferedReader br = 
						new BufferedReader(
								new InputStreamReader(client.getInputStream()))){
					while(true) {
						String str = br.readLine();
						if(str.equals("exit")) break;
						System.out.println(client.getInetAddress() + "님의 메세지 : " + str);
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			t.start();
			//2. 출력 스트림 생성해서, 사용자로부터 메세지 받아서 전송
			PrintWriter pw = new PrintWriter(client.getOutputStream());
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






