package basic;  // 패키지 선언

import java.io.*;  // 입출력 관련 클래스들 가져오기
import java.net.ServerSocket;  // ServerSocket 클래스 가져오기
import java.net.Socket;  // Socket 클래스 가져오기

public class ServerMain {  // 서버 메인 클래스 선언

    public static void main(String[] args) {

        // 1. 서버 프로그램 실행 시작을 알리는 메시지 출력
        System.out.println("서버 프로그램 실행합니다.");

        // 2. try-with-resources 구문을 사용하여 ServerSocket을 생성
        // - ServerSocket은 클라이언트의 연결을 대기하기 위해 포트 번호 5214에서 소켓을 엽니다.
        try (ServerSocket server = new ServerSocket(5214)) {

            // 3. 클라이언트가 접속할 때까지 대기하는 accept() 메서드 호출
            // - 클라이언트가 접속하면 해당 클라이언트와 통신할 수 있는 Socket 객체가 반환됩니다.
            Socket client = server.accept();
            // - 클라이언트가 접속하면 클라이언트의 IP 주소를 출력합니다.
            System.out.println(client.getInetAddress() + " 클라이언트가 접속 했습니다.");

            // 4. 클라이언트에게 데이터를 전송할 스트림 생성
            // - 클라이언트로 데이터를 보내기 위해 PrintStream을 사용
            PrintStream pw = new PrintStream(client.getOutputStream(), true);

            // 5. 클라이언트로부터 데이터를 받을 입력 스트림 생성
            // - BufferedReader를 사용해 클라이언트로부터 문자열 데이터를 읽어들임
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

            // 6. 클라이언트로부터 전송된 메시지를 읽음
            String msg = br.readLine();
            // - 클라이언트에서 받은 메시지를 출력
            System.out.println("클라이언트로 부터 받은 메시지: " + msg);

            // 7. 서버에서 클라이언트로 보낼 메시지 작성
            String serverMsg = "안녕하세요, 클라이언트님!";
            // - 클라이언트에게 메시지를 전송하고, 출력 버퍼를 비웁니다(flush)
            pw.println("서버에서 보낸 데이터: " + serverMsg);
//            pw.flush();  // 스트림을 강제로 비워서 데이터를 전송함

            // 8. IOException 예외 처리
            // - 입출력 과정에서 발생할 수 있는 오류를 처리합니다.
        } catch (IOException e) {
            // - 예외 발생 시 런타임 예외로 변환하여 프로그램을 종료
            throw new RuntimeException(e);
        }

    }
}
