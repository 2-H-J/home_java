package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientMain {

	public static void main(String[] args) {
		//1. 서버 접속
		try(Socket server = new Socket("127.0.0.1",2222);){
			System.out.println("서버 접속 완료.");
			//2. 스트림 초기화
			PrintWriter pw = new PrintWriter(server.getOutputStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(server.getInputStream()));
			Scanner sc = new Scanner(System.in);
			//3. 입출력
			while(true) {
				System.out.print("서버로 보낼 데이터 : ");
				String str = sc.nextLine();
				pw.println(str);
				pw.flush();
				if(str.equals("exit"))
					break;
				System.out.println(br.readLine());
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
