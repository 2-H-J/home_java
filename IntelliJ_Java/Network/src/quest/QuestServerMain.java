package quest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestServerMain {
	/*
	서버 프로그램
		1. 포트 번호 3333에서 서버 오픈
		2. 클라이언트의 접속을 대기하고, 접속 후 데이터를 송수신
		3. 클라이언트로부터 받은 숫자의 제곱을 계산하여 클라이언트에게 전송 후 종료
		주의: 주고받는 데이터는 문자열로 처리
	*/

    public static void main(String[] args) {
        try (
                // 1. 서버 소켓을 생성하여 3333번 포트에서 클라이언트의 접속을 대기
                ServerSocket server = new ServerSocket(3333);
                // 2. 클라이언트가 접속할 때까지 대기
                Socket client = server.accept()) {

            // 3. 입출력 스트림 초기화
            // 클라이언트에게 데이터를 보내기 위한 출력 스트림
            PrintWriter pw = new PrintWriter(client.getOutputStream());
            // 클라이언트로부터 데이터를 읽기 위한 입력 스트림
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            // 4. 클라이언트로부터 데이터를 수신
            System.out.println("사용자로부터 데이터를 기다리는 중");
            String data = br.readLine(); // 데이터를 문자열로 읽음

            // 5. 받은 데이터를 숫자로 변환 후 제곱 계산
            int n = Integer.parseInt(data); // 문자열을 정수로 변환
            n *= n; // 숫자를 제곱

            // 6. 계산된 결과를 클라이언트에게 전송
            pw.println(String.valueOf(n)); // 계산된 숫자를 문자열로 변환하여 클라이언트로 전송
            pw.flush(); // 버퍼에 있는 데이터를 즉시 클라이언트로 전송

        } catch (IOException e) {
            // 예외 처리
            e.printStackTrace();
        }
    }
}