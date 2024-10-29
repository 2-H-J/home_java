package e01_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOTest {
	public String readline() {
	    InputStreamReader isr = new InputStreamReader(System.in); // System.in : 콘솔 키보드 입력을 읽어들임
	    char buffer[] = new char[10]; // 입력을 임시로 저장하는 10개의 문자 배열을 생성
	    String message = null; // 최종적으로 반환할 문자열을 저장하는 변수
	    int idx = 0; // 현재까지 입력받은 문자의 개수를 추적하는 변수

	    try {
	        do {
	            // 배열이 가득 차면 배열의 크기를 두 배로 늘림
	            if (idx == buffer.length - 1) {
	                buffer = reallocBuffer(buffer);
	            }

	            // 사용자가 입력한 문자를 하나씩 읽어서 배열에 저장 (char로 형 변환)
	            buffer[idx] = (char) isr.read(); 
	            idx++;
	        } while (buffer[idx - 1] != '\n'); // Enter(새 줄) 입력 시 루프 종료
			// System.out.println(Arrays.toString(buffer));

	        for (int i = 0; i < idx; i++) {
	            System.out.print((int) buffer[i] + " "); // 입력된 각 문자의 아스키 코드를 출력 (디버깅용)
	        }

	        System.out.println();
	        message = String.copyValueOf(buffer, 0, idx - 2); // 배열을 문자열로 변환하여 메시지로 저장

	    } catch (IOException e) {
	        e.printStackTrace(); // 입력 도중 발생할 수 있는 예외를 처리
	    } finally {
	        try {
	            if (isr != null) {
	                isr.close(); // InputStreamReader 닫기
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    return message; // 최종적으로 입력된 문자열을 반환
	}

//	private char[] reallocBuffer(char[] buffer) {
//		char[] temp = buffer;// 임시 배열에 기존 배열을 저장
//
//		buffer = new char[temp.length * 2]; // 기존 배열에다가 2배 길이만큼 배열을 새로 생성
//
//		for (int i = 0; i < temp.length; i++)
//			buffer[i] = temp[i];// 임시 저장된 내용을 새로 생성된 배열에 저장
//
//		return buffer;
//	}
	
		private char[] reallocBuffer(char[] buffer) {
    		// 새로운 크기의 배열 생성 (현재 배열의 두 배 크기)
    		char[] newBuffer = new char[buffer.length * 2];
    
    		// System.arraycopy를 사용하여 기존 배열을 새 배열로 복사
    		System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
    
    		return newBuffer;
		}
	

		public void println(String msg) {
		    char[] buffer = msg.toCharArray(); // 문자열을 문자 배열로 변환
		    OutputStreamWriter osw = new OutputStreamWriter(System.out); // 출력 스트림 생성
		    try {
		        osw.write(buffer); // 문자 배열을 출력 스트림에 쓰기
		        osw.flush(); // 출력 버퍼 비우기 (즉시 출력)
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (osw != null)
		                osw.close(); // 스트림 닫기
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}

}
