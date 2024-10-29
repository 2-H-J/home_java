package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		
		try (
			// 클라이언트 연결 순서
			// 1. 서버에 접속 (서버의 IP 주소와 포트 번호가 필요)
			// IP 주소: 127.0.0.1은 로컬 컴퓨터(자기 자신)를 의미하며, 
			// 포트 번호: 5234는 서버가 대기 중인 포트 번호입니다.
			Socket server = new Socket("127.0.0.1", 5234)) { 
				// 실제 IP 주소를 사용할 경우에는 해당 서버의 IP 주소를 사용해야 합니다.
				// 예: 192.168.20.11과 같이 로컬 네트워크 상의 IP를 입력하면 다른 서버에 접속 가능합니다.
			
				// 2. 입출력 스트림 초기화
				// PrintWriter는 클라이언트가 서버로 데이터를 보내기 위한 출력 스트림입니다.
				// 두 번째 인자인 true는 auto-flush를 설정하는 것으로, 매번 데이터를 보내는 즉시 서버로 전송됩니다.
				PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
				
				// BufferedReader는 서버로부터 데이터를 읽기 위한 입력 스트림입니다.
				// InputStreamReader를 통해 바이트 스트림을 문자 스트림으로 변환하여 데이터를 읽을 수 있습니다.
				BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				
				// 3. 입출력 처리
				// 클라이언트는 먼저 서버로 데이터를 보냅니다. 여기서는 "클라이언트가 보낸 메세지"를 서버로 전송.
				// 서버는 이 메시지를 수신하고, 그에 대한 응답을 보내게 됩니다.
				pw.println("클라이언트가 보내는 메시지"); // 서버로 메시지를 전송
				
				// pw.flush(); // auto-flush가 설정되어 있기 때문에, flush()를 명시적으로 호출할 필요는 없음
				
				// 서버가 보낸 데이터를 받아서 출력합니다.
				// 서버는 클라이언트의 메시지를 수신하고 응답을 보내게 됩니다.
				System.out.println(br.readLine()); // 서버 응답을 콘솔에 출력
				
		} catch (IOException e) {
			// IOException이 발생하면 오류 메시지를 출력합니다.
			e.printStackTrace();
		}
		
	}
}
