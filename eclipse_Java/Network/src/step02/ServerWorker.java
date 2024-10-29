package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerWorker extends Thread {
	private Socket client;

	// ServerMain으로부터 접속한 클라이언트 정보를 받아옴
	public ServerWorker(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		// br, pw 생성
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
			 PrintWriter pw = new PrintWriter(client.getOutputStream())) {
			while(true) {
			// 사용자로부터 데이터 받음
				String str = br.readLine();
			// 사용자가 보낸 데이터가 exit으면 종료
				if(str.equals("exit")) break;
			// 사용자에게 그대로 데이터 전송
				pw.println(str);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			MultiEchoServerMain.removeClient(this);
		}

	}
}
