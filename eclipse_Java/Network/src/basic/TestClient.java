package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) {
		// 
		try (Socket client = new Socket("127.0.0.1",3030);){
			
			// 서버로 데이터 보내기
			PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
			
			// 서버로부터 받은 데이터 읽기
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 서버가 보낸 데이터 읽기
			System.out.println(br.readLine());
			
			pw.println("클라이언트가 보낸다~~");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
