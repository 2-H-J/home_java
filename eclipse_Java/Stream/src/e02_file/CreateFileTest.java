package e02_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileTest {

    public static void main(String[] args) {
        // 1. 파일이 저장될 기본 경로를 설정
        // File 객체를 생성하고, 파일이 저장될 경로로 "c:\\test\\temp"를 설정함
        // File.separator는 OS에 맞는 경로 구분자를 사용하게 함 (Windows는 '\\', Unix는 '/')
        File root = new File("c:\\test" + File.separator + "temp");

        // 2. 사용자로부터 파일명을 입력 받음
        // Scanner를 이용해 콘솔에서 입력을 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("파일명 입력 하세요 : ");
        String fileName = sc.nextLine(); // 사용자가 입력한 파일명을 받음

        // 3. 경로와 파일명을 합쳐서 새 파일 경로를 생성
        // root.getAbsolutePath()는 "c:\\test\\temp"의 절대 경로를 가져옴
        // 입력받은 파일명을 절대 경로에 붙여 새로운 파일 경로를 만듦
        File newFile = new File(root.getAbsolutePath() + "\\" + fileName);
        // 결과 예시: "c:\\test\\temp\\입력된파일명"

        try {
            // 4. 경로가 존재하는지 확인하고, 없으면 폴더를 생성
            // root.exists()가 false이면 해당 폴더가 존재하지 않음
            if (!root.exists()) { // 해당 폴더가 존재하지 않는다면
                // mkdirs()는 전체 경로를 따라 폴더가 없으면 모두 생성함
                root.mkdirs(); 
                // mkdir()은 상위 경로가 모두 존재하는 경우에만 폴더를 하나 생성함
                System.out.println("해당 경로 생성 완료");
            }

            // 5. 파일 생성 또는 업로드
            // createNewFile()은 파일을 새로 생성, 이미 존재하는 파일이면 false를 반환함
            boolean result = newFile.createNewFile();
            if (result) { // 파일이 정상적으로 생성된 경우
                System.out.println("파일 업로드 완료");
            } else { // 파일이 이미 존재하거나 생성이 실패한 경우
                System.out.println("파일 업로드 실패");
            }

        } catch (IOException e) {
            // 파일 생성 중 문제가 발생했을 때, 예외를 처리함
            e.printStackTrace();
        }

        // 파일이나 폴더를 삭제하거나 이름을 변경하는 기능도 사용할 수 있음 (주석 처리된 부분)
        // root.delete(); // 파일 또는 디렉토리를 삭제할 수 있음
        // root.renameTo(); // 파일이나 디렉토리 이름을 변경할 수 있음
    }
}
