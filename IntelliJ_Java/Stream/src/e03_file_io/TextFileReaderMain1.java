package e03_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReaderMain1 { // Reader 글자단위
    // 읽기용 프로그램
    public static void main(String[] args) {
        FileReader fr = null; // FileReader 변수 선언 (노드 스트림)
        BufferedReader br = null; // BufferedReader 변수 선언 (보조 스트림)
        try {
            // 1. 노드 스트림(Node Stream) 연결 (물리적인 파일과 프로그램을 연결)
            // FileReader는 파일로부터 데이터를 읽기 위한 노드 스트림으로, 파일을 읽는 스트림을 생성
            fr = new FileReader("d:\\test\\notice.txt"); // 읽고자 하는 파일의 경로 지정

            // 2. 보조 스트림(프로세스 스트림) 연결
            // BufferedReader는 FileReader와 연결되어 버퍼를 사용해 데이터를 효율적으로 읽을 수 있도록 도와줌
            // 프로세스 스트림(보조 스트림)은 반드시 노드 스트림(FileReader)이 먼저 연결되어야 함
            br = new BufferedReader(fr); // FileReader에 BufferedReader를 연결하여 더 효율적으로 읽기

            // 3. 데이터를 읽어오기
            // 파일의 내용을 한 줄씩 읽어서 출력하는 반복문
            // readLine()은 한 줄 단위로 문자열을 읽어오는 메서드이며, 더 이상 읽을 줄이 없으면 null을 반환
            String str = null; // 읽은 데이터를 저장할 문자열 변수
            while ((str = br.readLine()) != null) { // 파일의 끝까지 읽을 때까지 반복
                System.out.println(str); // 읽어온 한 줄의 내용을 출력
            }

        } catch (FileNotFoundException e) {
            // 예외 처리: 파일이 존재하지 않을 때 발생
            // FileReader가 지정된 파일을 찾을 수 없으면 FileNotFoundException 발생
            e.printStackTrace(); // 오류 내용을 출력 (경로 오류나 파일이 없을 경우 확인)
        } catch (IOException e) {
            // 예외 처리: 입출력 오류가 발생할 때 발생 (readLine, close 등의 메서드에서 발생할 수 있음)
            e.printStackTrace(); // IOException의 상세 정보를 출력
        } finally {
            // 자원을 해제하는 블록
            // 자원을 사용한 후에는 반드시 닫아줘야 메모리 누수나 파일 손상이 발생하지 않음
            try {
                // FileReader와 BufferedReader가 null이 아닌지 확인한 후, 닫기 작업 수행
                if (fr != null) fr.close(); // FileReader 닫기
                if (br != null) br.close(); // BufferedReader 닫기
            } catch (IOException e) {
                // 자원을 닫는 도중 발생할 수 있는 IOException을 처리
                e.printStackTrace(); // 오류가 발생하면 출력
            }
        } // finally 블록 끝
    } // main 메서드 끝
} // TextFileReaderMain1 클래스 끝