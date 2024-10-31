package basic;  // 패키지 선언

import java.io.BufferedReader;  // BufferedReader 클래스 import (입력 스트림을 효율적으로 처리하기 위함)
import java.io.IOException;  // 입출력 예외 처리 관련 클래스
import java.io.InputStreamReader;  // 입력 스트림을 문자로 변환하기 위한 InputStreamReader import
import java.io.PrintStream;  // PrintStream 클래스 import (출력 스트림을 효율적으로 처리하기 위함)
import java.net.Socket;  // 네트워크 소켓 연결을 위한 Socket 클래스 import

public class ClientMain {  // 클라이언트 메인 클래스 정의
    public static void main(String[] args) {

        // 1. try-with-resources 구문을 사용하여 서버와의 연결을 설정 및 리소스 관리
        try (Socket server = new Socket("127.0.0.1", 5214);
             // 서버에 연결할 소켓 생성 (IP: 127.0.0.1, Port: 5214)
             PrintStream pw = new PrintStream(server.getOutputStream(), true);
             // 서버로 메시지를 보낼 출력 스트림 생성 (자동 flush)
             BufferedReader br = new BufferedReader(new InputStreamReader(server.getInputStream()))) {
            // 서버로부터 메시지를 읽을 입력 스트림 생성

            // 2. 클라이언트에서 서버로 보낼 메시지 작성
            String msg = "서버야 안녕~?";  // 전송할 메시지 정의
            // 3. 서버로 메시지 전송
            pw.println("클라이언트가 보내는 메시지 : " + msg);
            // PrintStream을 사용해 서버로 메시지 전송

            // 4. 서버로부터 응답 메시지를 읽어와 출력
            System.out.println(br.readLine());  // BufferedReader를 사용해 서버로부터 받은 메시지를 출력

            // 5. 입출력 예외 처리
        } catch (IOException e) {
            // 6. 예외 발생 시 런타임 예외로 변환하여 프로그램을 종료
            throw new RuntimeException(e);
        }

    }
}
