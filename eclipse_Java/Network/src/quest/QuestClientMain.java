package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuestClientMain {
	/*
		클라이언트 프로그램
			1. IP는 127.0.0.1 (로컬 컴퓨터), 포트 번호는 3333인 서버에 접속
			2. 사용자로부터 숫자를 입력받고, 해당 숫자를 서버로 전송
			3. 서버로부터 받은 결과를 출력
	*/

	public static void main(String[] args) {
		try (
			// 1. 서버에 연결 (IP 주소: 127.0.0.1, 포트 번호: 3333)
			Socket server = new Socket("127.0.0.1", 3333);
			// 사용자 입력을 받기 위한 Scanner 객체 생성
			Scanner sc = new Scanner(System.in);) {

			// 2. 입출력 스트림 초기화
			// 서버로 데이터를 보내기 위한 출력 스트림 생성
			PrintWriter pw = new PrintWriter(server.getOutputStream(), true);
			// 서버로부터 데이터를 읽기 위한 입력 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));

			// 3. 사용자로부터 숫자를 입력받아 서버로 전송
			System.out.print("서버로 보낼 숫자 입력: ");
			int n = sc.nextInt(); // 사용자로부터 정수 입력 받기
			pw.println(String.valueOf(n)); // 입력된 숫자를 문자열로 변환하여 서버로 전송
//			pw.flush(); // 버퍼에 남아있는 데이터를 즉시 서버로 전송

			// 4. 서버로부터 받은 결과를 출력
			String msg = br.readLine(); // 서버로부터 응답 메시지를 한 줄씩 읽음
			System.out.println("서버에서 보내준 결과: " + msg); // 서버의 응답 출력

		} catch (IOException e) {
			// 예외 발생 시 처리
			e.printStackTrace();
		}
	}
}
