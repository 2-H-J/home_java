package e02_file;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RenameFileTest {

    public static void main(String[] args) {
        // 1. 파일이 위치한 부모 디렉터리 경로를 지정
        // "c:\\test\\temp" 디렉토리를 가리키는 File 객체를 생성
        File parentPath = new File("d:\\test\\temp");

        // 2. 사용자 입력을 받기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 3. 지정된 경로에 있는 모든 파일 및 디렉토리 목록을 리스트로 변환하여 출력
        // parentPath.listFiles()는 해당 경로에 있는 모든 파일과 디렉터리를 File 배열로 반환
        List<File> list = Arrays.asList(parentPath.listFiles());

        // 4. 파일 및 디렉터리 이름을 출력 (forEach 메서드로 모든 파일 이름을 출력)
        list.forEach(item -> System.out.println(item.getName())); // 각 파일의 이름을 출력

        // 5. 사용자로부터 변경할 기존 파일명을 입력받음
        System.out.print("변경할 기존 파일명 입력 : ");
        String fileName = sc.nextLine(); // 사용자로부터 기존 파일명을 입력받음

        // 6. 사용자로부터 변경할 새 파일명을 입력받음
        System.out.print("변경할 새 파일명 입력 : ");
        String fileNewName = sc.nextLine(); // 사용자로부터 새 파일명을 입력받음

        // 7. 기존 파일 객체 생성
        // 기존 파일의 경로와 입력받은 파일명을 합쳐서 File 객체를 생성
        File file = new File(parentPath, fileName);

        // 8. renameTo() 메서드를 사용하여 파일명을 변경
        // file.renameTo(new File(parentPath, fileNewName))는 기존 파일명을 새 파일명으로 변경
        boolean result = file.renameTo(new File(parentPath, fileNewName));

        // 9. 파일명 변경 성공 여부에 따른 출력
        // 변경이 성공하면 true, 실패하면 false를 반환
        if(result) {
            System.out.println("파일명 변경 완료");
        } else {
            System.out.println("파일명 변경 실패");
        }
    }
}