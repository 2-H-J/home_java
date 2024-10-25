package e03_file_io;

import java.io.BufferedReader;  // 파일에서 문자열을 읽을 때 사용
import java.io.FileNotFoundException; // 파일을 찾지 못했을 때 발생하는 예외
import java.io.FileReader;  // 파일을 문자 단위로 읽는 노드 스트림
import java.io.IOException;  // 입출력 도중 발생하는 예외 처리

public class TextFileReaderMain2 { // 파일을 문자 단위로 읽는 프로그램
    public static void main(String[] args) {

        // try-with-resources: 자원을 자동으로 해제하는 구조 (Java 1.7부터 사용 가능)
        // try() 내부에 선언된 자원들은 자동으로 close()가 호출되어 자원이 해제됩니다.
        // FileReader와 BufferedReader 객체를 사용하여 파일을 읽음.
        try (
                FileReader fr = new FileReader("d:\\test\\notice.txt");
                // FileReader: 파일을 문자 단위로 읽기 위한 노드 스트림 (파일과 연결)
                BufferedReader br = new BufferedReader(fr)
                // BufferedReader: FileReader와 연결된 보조 스트림 (효율적으로 파일을 읽기 위해 사용)
        ) {

            String str = null; // str: 파일에서 읽은 한 줄을 저장할 변수, null로 초기화
            // readLine()을 사용하여 파일의 끝까지 한 줄씩 읽음
            while((str = br.readLine()) != null) {
                // readLine()은 파일에서 한 줄을 읽어 문자열로 반환하며, 더 이상 읽을 줄이 없으면 null을 반환
                System.out.println(str); // 읽어온 문자열을 출력
            }

        } catch (FileNotFoundException e) {
            // FileNotFoundException: 파일을 찾을 수 없을 때 발생하는 예외
            e.printStackTrace(); // 예외의 스택 트레이스를 출력하여 어디에서 발생했는지 알 수 있음
        } catch (IOException e) {
            // IOException: 입출력 도중 발생하는 예외 처리 (파일 읽기나 자원 닫기 중 발생 가능)
            e.printStackTrace(); // 예외의 스택 트레이스를 출력하여 자세한 오류 정보를 알 수 있음
        }

    } // main 메서드 끝
} // TextFileReaderMain2 클래스 끝