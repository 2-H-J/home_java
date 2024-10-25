package e03_file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextWriteMain {
    // 쓰기용 : 실행 할 때마다 매번 파일을 새로 만든다. 기존 파일은 사라짐
    public static void main(String[] args) {

        // 1. 노드스트림, 프로세스 스트림 생성 및 초기화
        // FileWriter: 파일에 문자를 쓰는 노드 스트림
        // PrintWriter: 텍스트 출력을 더 쉽게 하기 위한 보조 스트림
        // true -> 추가모드(기존 파일 삭제 X 이어서 쓰기)
        // false -> 새파일(기존 파일 삭제 후 새로운 파일 생성)
//		try(FileWriter fw = new FileWriter("c:\\test\\write.txt", true); : , true로 할경우 기존 내용을 남기고 추가 내용을 쓴다.
        try (FileWriter fw = new FileWriter("d:\\test\\write.txt");
             // PrintWriter는 FileWriter에 연결된 보조 스트림
             PrintWriter pw = new PrintWriter(fw)) { //try() 끝부분

            // 2. 텍스트 쓰기
            // println() 메서드는 줄 단위로 데이터를 작성하고 줄바꿈을 자동으로 추가
            pw.println("안녕하세요"); // 한 줄 텍스트 출력
            pw.println("1234567890"); // 숫자 문자열 출력
            pw.println("Hello World!"); // 영어 텍스트 출력

            // 3. pw.flush() : 버퍼에 있는 데이터를 강제로 파일에 기록
            // flush()를 호출하지 않으면 버퍼에 남아 있을 수 있으므로 데이터를 파일에 즉시 기록
            pw.flush(); // 버퍼 비우기 (파일에 강제로 쓰기)

            // 4. flush() 이후에도 추가로 데이터를 쓸 수 있음
            pw.println("하이"); // 추가 텍스트 출력

        } catch (IOException e) {
            // IOException이 발생할 경우 처리 (예: 파일이 없거나 쓰기 권한이 없는 경우)
            e.printStackTrace(); // 예외 내용을 출력
        }

    }
}