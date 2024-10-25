package quest.quest.gpt;

import java.io.BufferedReader;  // 클라이언트로부터 데이터를 읽기 위한 BufferedReader 클래스
import java.io.IOException;  // 입출력 예외 처리를 위한 IOException 클래스
import java.io.InputStreamReader;  // InputStreamReader 클래스 (입력 스트림을 문자로 변환)
import java.io.PrintWriter;  // 클라이언트에게 데이터를 보내기 위한 PrintWriter 클래스
import java.net.ServerSocket;  // 서버 소켓을 생성하고 클라이언트 연결을 처리하기 위한 ServerSocket 클래스
import java.net.Socket;  // 네트워크 소켓을 이용해 클라이언트와 통신하기 위한 Socket 클래스

/**
 * 이 프로그램은 서버-클라이언트 통신을 구현한 서버 프로그램입니다.
 * - 서버는 포트 3333에서 실행되며 클라이언트의 접속을 대기합니다.
 * - 클라이언트가 접속하면, 클라이언트로부터 숫자를 받아 그 숫자의 제곱을 계산한 후 클라이언트에게 전송합니다.
 * - 클라이언트와의 통신은 문자열로 이루어지며, 숫자가 아닌 데이터를 받으면 오류 메시지를 반환합니다.
 *
 * 주요 동작:
 * 1. **ServerSocket**을 이용하여 3333 포트에서 클라이언트의 연결을 대기합니다.
 * 2. 클라이언트가 접속하면 **Socket** 객체를 통해 통신을 시작합니다.
 * 3. **BufferedReader**와 **PrintWriter**를 사용하여 클라이언트와 메시지를 주고받습니다.
 * 4. 클라이언트로부터 받은 데이터를 **정수**로 변환하여 **제곱**을 계산하고, 결과를 클라이언트로 다시 전송합니다.
 * 5. 만약 클라이언트가 보낸 데이터가 숫자가 아니라면, **NumberFormatException**을 처리하여 오류 메시지를 전송합니다.
 */

public class GptQuestServerMain {

    public static void main(String[] args) {
        // 서버 소켓을 3333번 포트에서 열고 클라이언트의 접속을 기다림
        try (ServerSocket serverSocket = new ServerSocket(3333)) {
            System.out.println("서버가 포트 3333에서 클라이언트 접속을 대기 중입니다.");

            // 클라이언트가 접속할 때까지 대기하는 무한 루프
            while (true) {
                // 클라이언트의 연결을 수락하고 통신을 위한 소켓을 생성
                try (Socket clientSocket = serverSocket.accept();  // 클라이언트의 연결을 수락
                     PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);  // 클라이언트에게 데이터를 보낼 스트림 (자동 flush)
                     BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {  // 클라이언트로부터 데이터를 읽을 스트림

                    // 클라이언트의 IP 주소를 출력하여 어느 클라이언트가 접속했는지 확인
                    System.out.println("클라이언트가 접속했습니다: " + clientSocket.getInetAddress());

                    // 클라이언트로부터 데이터를 한 줄 읽어옴 (이 데이터는 문자열로 처리됨)
                    String data = br.readLine();
                    System.out.println("클라이언트로부터 받은 데이터: " + data);

                    // 받은 데이터를 정수로 변환하여 제곱 계산
                    try {
                        int number = Integer.parseInt(data);  // 문자열을 정수로 변환
                        int squaredNumber = number * number;  // 정수를 제곱하여 계산

                        // 계산된 결과를 클라이언트에게 전송
                        pw.println(String.valueOf(squaredNumber));  // 제곱된 결과를 문자열로 변환하여 클라이언트에게 전송
                        System.out.println("클라이언트로 전송한 제곱 값: " + squaredNumber);

                    } catch (NumberFormatException e) {
                        // 만약 숫자가 아닌 데이터를 받은 경우 오류 메시지를 클라이언트로 전송
                        pw.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                        System.err.println("잘못된 입력: " + data);  // 서버 콘솔에 잘못된 입력을 로그로 남김
                    }

                } catch (IOException clientError) {
                    // 클라이언트와의 통신 중 발생한 예외를 처리하고 오류 메시지를 출력
                    System.err.println("클라이언트 통신 중 오류 발생: " + clientError.getMessage());
                }
            }

        } catch (IOException e) {
            // 서버 소켓 생성 또는 통신 중 문제가 발생했을 때 예외 처리
            System.err.println("서버 소켓 오류 발생: " + e.getMessage());
        }
    }
}
