package quest.quest.gpt;

import java.io.BufferedReader;  // 서버로부터 데이터를 읽기 위한 BufferedReader 클래스
import java.io.IOException;  // 입출력 예외 처리를 위한 IOException 클래스
import java.io.InputStreamReader;  // InputStreamReader 클래스 (입력 스트림을 문자로 변환)
import java.io.PrintWriter;  // 서버로 데이터를 보내기 위한 PrintWriter 클래스
import java.net.Socket;  // 네트워크 소켓을 이용해 서버와 통신하기 위한 Socket 클래스
import java.util.InputMismatchException;  // 잘못된 입력을 처리하기 위한 예외 클래스
import java.util.Scanner;  // 사용자로부터 입력을 받기 위한 Scanner 클래스

/**
 * 이 프로그램은 서버-클라이언트 통신을 구현한 클라이언트 프로그램입니다.
 * - 클라이언트는 로컬 IP(127.0.0.1)와 포트 번호 3333을 사용하여 서버에 접속합니다.
 * - 사용자는 숫자를 입력하고, 이 숫자는 서버로 전송됩니다.
 * - 서버는 클라이언트가 보낸 숫자의 제곱을 계산하여 클라이언트에게 그 결과를 반환합니다.
 *
 * 주요 동작:
 * 1. **Socket**을 이용해 지정된 IP와 포트 번호로 서버에 연결합니다.
 * 2. **Scanner**를 이용해 사용자가 입력한 숫자를 읽어옵니다.
 * 3. 입력받은 숫자를 **PrintWriter**를 통해 서버로 전송합니다.
 * 4. 서버로부터 제곱된 결과를 **BufferedReader**로 받아 출력합니다.
 * 5. 잘못된 입력(숫자가 아닌 값)이 들어왔을 때 예외 처리를 통해 올바른 숫자가 입력될 때까지 반복 요청합니다.
 */

public class GptQuestClientMain {

    public static void main(String[] args) {
        // 서버에 연결하고 자원 관리를 위한 try-with-resources 구문
        try (Socket serverSocket = new Socket("127.0.0.1", 3333);  // 서버에 연결 (IP: 127.0.0.1, Port: 3333)
             PrintWriter pw = new PrintWriter(serverSocket.getOutputStream(), true);  // 서버로 데이터를 전송할 스트림
             BufferedReader br = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));  // 서버로부터 응답을 받을 스트림
             Scanner sc = new Scanner(System.in)) {  // 사용자로부터 숫자를 입력받기 위한 Scanner

            // 사용자로부터 유효한 숫자가 입력될 때까지 반복
            int number = 0;  // 사용자가 입력할 숫자를 저장할 변수
            while (true) {
                try {
                    System.out.print("서버로 보낼 숫자 입력: ");  // 사용자에게 숫자 입력을 요청
                    number = sc.nextInt();  // 숫자 입력 받기
                    break;  // 유효한 숫자가 입력되면 루프를 빠져나감
                } catch (InputMismatchException e) {
                    // 잘못된 입력이 들어왔을 경우 처리
                    System.out.println("유효한 숫자를 입력해주세요.");  // 에러 메시지 출력
                    sc.next();  // 잘못된 입력을 버퍼에서 제거하여 다음 입력을 받을 준비
                }
            }

            // 입력된 숫자를 서버로 전송
            pw.println(String.valueOf(number));  // 입력된 숫자를 문자열로 변환하여 서버로 전송

            // 서버로부터 제곱 계산된 결과를 수신
            String serverResponse = br.readLine();  // 서버로부터 결과를 한 줄 읽어옴
            System.out.println("서버에서 보내준 결과: " + serverResponse);  // 서버에서 보내온 결과를 출력

        } catch (IOException e) {
            // 서버와 통신 중 발생한 예외 처리
            System.err.println("서버와의 통신 중 오류 발생: " + e.getMessage());  // 예외 메시지 출력
            e.printStackTrace();  // 오류 발생 위치를 디버깅하기 위해 스택 트레이스 출력
        }
    }
}
