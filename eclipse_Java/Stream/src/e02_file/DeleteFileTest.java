package e02_file;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteFileTest {

	public static void main(String[] args) {
		// 1. 삭제할 파일이 있는 부모 디렉토리 경로를 지정
		// "c:\\test\\temp" 폴더를 가리키는 File 객체를 생성함
		File parentPath = new File("c:\\test\\temp");
		
		// 2. 사용자로부터 삭제할 파일명을 입력받기 위해 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// 3. 해당 폴더에 있는 모든 파일 목록을 출력
		// parentPath.listFiles()는 해당 경로에 있는 모든 파일과 디렉터리들을 File 배열로 반환
		File[] fileList = parentPath.listFiles(); // 폴더 내 파일 및 디렉토리 리스트 가져옴
		
		// 4. 배열을 List로 변환한 후 forEach를 사용해 파일명을 출력
		// Arrays.asList()로 File 배열을 List로 변환하여 간편하게 다룸
		List<File> list = Arrays.asList(fileList);
		list.forEach(item -> System.out.println(item.getName())); // 각 파일의 이름을 출력

		// 5. 사용자에게 삭제할 파일명을 입력받음
		System.out.print("삭제할 파일명 입력 : ");
		String fileName = sc.nextLine(); // 사용자가 입력한 파일명을 받음
		
		// 6. 삭제할 파일의 경로를 지정
		// File(parentPath, fileName)는 parentPath 디렉터리 아래의 입력한 파일명을 가진 파일을 가리킴
		File file = new File(parentPath, fileName);

		// 7. 파일 삭제 시도
		// 파일 존재 여부 확인: 파일이 존재하지 않는 경우도 처리할 수 있도록 file.exists()로 
		// 파일 존재 여부를 먼저 확인하는 방법
		// file.delete()는 파일을 삭제하고, 성공하면 true를 반환하며, 실패하면 false를 반환
		if (file.exists()) { // 파일 존재 여부 확인
		    if(file.delete()) { // 파일 삭제 성공
		        System.out.println("파일 삭제 성공");
		    } else { // 파일 삭제 실패
		        System.out.println("파일 삭제 실패");
		    }
		} else { // 파일 존재 없으면 실행
		    System.out.println("해당 파일이 존재하지 않습니다.");
		}
	}
}
