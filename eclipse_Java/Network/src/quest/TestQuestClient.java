package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TestQuestClient {

	public static void main(String[] args) {
		// 1.서버 연결
		try (Socket server = new Socket("127.0.0.1", 3040);
				Scanner sc = new Scanner(System.in);){
			
		// 2. 입출력
			// 입력
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
			// 출력
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			
			pw.println("안녕 서버~");
			
			System.out.print("계산할 데이터 입력 : ");
			int n = sc.nextInt();
			
			pw.println(String.valueOf(n));// 입력받은 숫자를 문자열로 변환 전송
			
			String msg = br.readLine();
			System.out.println("서버가 보낸 메시지 : "+msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
