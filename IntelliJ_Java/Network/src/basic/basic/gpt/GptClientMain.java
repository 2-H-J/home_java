package basic.basic.gpt;

import java.io.BufferedReader;  // 서버로부터 데이터를 읽기 위한 BufferedReader 클래스
import java.io.IOException;  // 입출력 예외 처리를 위한 IOException 클래스
import java.io.InputStreamReader;  // InputStreamReader 클래스 (입력 스트림을 문자로 변환)
import java.io.PrintStream;  // 서버로 데이터를 보내기 위한 PrintStream 클래스
import java.net.Socket;  // 네트워크 소켓 연결을 위한 Socket 클래스
import java.util.Scanner;  // 사용자로부터 입력을 받기 위한 Scanner 클래스

/**
 * 이 코드는 서버와 통신을 하는 간단한 클라이언트 프로그램입니다.
 * - 클라이언트는 로컬 IP 주소(127.0.0.1)와 포트 번호 5214번에 있는 서버에 접속합니다.
 * - 사용자로부터 메시지를 입력받고, 서버로 전송한 후, 서버의 응답을 출력합니다.
 *
 * 작동 방식:
 * 1. **소켓 생성**: 서버 IP와 포트 번호를 이용해 소켓을 생성하고 서버에 연결을 시도합니다.
 * 2. **사용자 입력**: Scanner를 이용해 사용자가 입력한 메시지를 읽습니다.
 * 3. **서버로 메시지 전송**: 입력받은 메시지를 서버로 전송합니다.
 * 4. **서버 응답**: 서버가 보낸 응답을 읽어와 출력합니다.
 *
 * **try-with-resources**: 자원 관리를 위해 사용됩니다.
 * ->네트워크 소켓과 입출력 스트림은 자동으로 닫히게 됩니다.
 */

public class GptClientMain {
    public static void main(String[] args) {

        // 서버와 연결을 설정하고, 자원 관리를 위한 try-with-resources 구문
        try (Socket server = new Socket("127.0.0.1", 5214);  // 서버에 연결할 소켓을 생성 (IP: 127.0.0.1, Port: 5214)
             PrintStream pw = new PrintStream(server.getOutputStream(), true);  // 서버로 메시지를 보낼 출력 스트림
             BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()));  // 서버로부터 메시지를 읽을 입력 스트림
             Scanner sc = new Scanner(System.in)) {  // 사용자로부터 메시지를 입력받기 위한 Scanner

            // 사용자로부터 서버로 보낼 메시지 입력 받기
            System.out.print("서버로 보낼 메시지를 입력하세요: ");
            String msg = sc.nextLine();  // 입력받은 메시지를 변수에 저장

            // 서버로 메시지 전송
            pw.println("클라이언트가 보내는 메시지 : " + msg);  // PrintStream을 이용해 서버로 메시지 전송

            // 서버로부터 응답을 받음
            String serverResponse = br.readLine();  // 서버의 응답을 한 줄 읽어옴
            System.out.println("서버의 응답: " + serverResponse);  // 서버의 응답을 출력

        } catch (IOException e) {
            // 서버와 통신 중 예외가 발생한 경우 처리
            System.err.println("서버와의 통신 중 오류가 발생했습니다: " + e.getMessage());  // 오류 메시지 출력
            e.printStackTrace();  // 예외의 상세 정보를 출력 (디버깅 용도)
        }
    }
}
