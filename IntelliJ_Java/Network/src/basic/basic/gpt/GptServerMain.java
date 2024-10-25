package basic.basic.gpt;

import java.io.*;  // 입출력 관련 클래스들 가져오기
import java.net.ServerSocket;  // 서버 소켓 관련 클래스
import java.net.Socket;  // 네트워크 소켓 관련 클래스

/**
 * 이 코드는 서버-클라이언트 통신을 위한 간단한 서버 프로그램입니다.
 * - 이 서버는 포트 5214에서 클라이언트의 연결을 대기합니다.
 * - 클라이언트가 연결되면, 메시지를 주고받고, 응답을 전송한 후 종료됩니다.
 *
 * 작동 방식:
 * 1. **서버 소켓(ServerSocket)**을 열어 5214번 포트에서 연결을 대기합니다.
 * 2. **클라이언트의 연결 요청**을 수락합니다.
 * 3. **데이터 송수신**:
 *    - 클라이언트로부터 데이터를 받고 이를 처리한 후, 응답을 보냅니다.
 * 4. **통신 종료**:
 *    - 클라이언트와의 통신이 완료되면 연결을 종료하고, 계속해서 새로운 클라이언트의 요청을 대기합니다.
 *
 * **try-with-resources**: 자원 관리를 자동으로 처리하기 위해 사용됩니다.
 * 소켓, 입출력 스트림 등을 명시적으로 닫지 않아도 자원이 적절히 해제됩니다.
 */

public class GptServerMain {

    public static void main(String[] args) {

        // 서버가 실행되었음을 알리는 메시지 출력
        System.out.println("서버 프로그램을 실행합니다.");

        // 서버 소켓을 5214번 포트에서 생성하고, 클라이언트의 연결을 대기
        try (ServerSocket serverSocket = new ServerSocket(5214)) {
            System.out.println("서버가 포트 5214에서 클라이언트 접속을 대기 중입니다...");

            // 클라이언트의 연결 요청을 무한히 대기 (반복적인 클라이언트 연결 수락)
            while (true) {
                // 클라이언트 연결을 수락하고, 해당 클라이언트와 데이터를 주고받기 위한 스트림을 설정
                try (Socket clientSocket = serverSocket.accept();  // 클라이언트 접속을 대기
                     PrintStream pw = new PrintStream(clientSocket.getOutputStream(), true);  // 서버에서 클라이언트로 데이터를 전송하는 스트림
                     BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {  // 클라이언트로부터 데이터를 받는 스트림

                    // 클라이언트가 접속한 경우 IP 주소를 출력 (누가 접속했는지 확인)
                    System.out.println(clientSocket.getInetAddress() + " 클라이언트가 접속했습니다.");

                    // 클라이언트가 보낸 메시지를 읽고 처리
                    String clientMsg = br.readLine();  // 클라이언트로부터 메시지를 읽음
                    if (clientMsg != null) {
                        // 받은 메시지를 서버 콘솔에 출력 (클라이언트가 보낸 메시지를 확인)
                        System.out.println("클라이언트로부터 받은 메시지: " + clientMsg);

                        // 클라이언트에게 보낼 응답 메시지를 생성
                        String serverMsg = "안녕하세요, 클라이언트님!";
                        // 서버의 응답 메시지를 클라이언트에게 전송
                        pw.println("서버에서 보낸 데이터: " + serverMsg);  // 응답 전송
                    }

                    // 클라이언트와의 통신이 끝났음을 알리는 로그 메시지 출력
                    System.out.println("클라이언트와의 통신이 종료되었습니다.");

                } catch (IOException clientError) {
                    // 클라이언트와의 통신 중 발생한 예외 처리
                    System.err.println("클라이언트 통신 오류 발생: " + clientError.getMessage());
                }
            }

        } catch (IOException e) {
            // 서버 소켓을 생성하거나 통신 중 문제가 발생했을 때 처리하는 예외
            System.err.println("서버 소켓 오류 발생: " + e.getMessage());
        }

        // 이 코드는 실행되지 않음 (서버는 무한히 클라이언트의 연결을 대기)
        System.out.println("서버 프로그램을 종료합니다.");
    }
}
