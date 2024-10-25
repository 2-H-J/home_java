package main;

import java.util.Scanner;
import service.StudentService;

public class StudentMain {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = StudentService.getInstance();

        // 프로그램 타이틀 메뉴
        System.out.println("= 학적 관리 프로그램 버전 - 1 =");
        System.out.println("+---------------------------+");
        System.out.println("   1. 학생 데이터 등록       ");
        System.out.println("   2. 학생 데이터 검색       ");
        System.out.println("   3. 학생 데이터 삭제       ");
        System.out.println("   4. 학생 데이터 수정       ");
        System.out.println("   5. 학생 데이터 전체출력    ");
        System.out.println("   6. 학생 데이터 이름검색   ");
        System.out.println("   0. 프로그램 종료          ");
        System.out.println("+---------------------------+");

        while(true){
            System.out.print("진행할 번호 입력 : ");

            int no = sc.nextInt();

            //반복문 종료 조건
            if(no == 0){
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            // 1 ~ 5 학생 데이터 관리 번호
            switch (no){
                case 0:
                    System.out.println("프로그램을 종료 합니다.");
                    return;
                case 1: // 추가
                    service.insertStudent();
                    break;

                case 2: // 검색
                    service.searchStudent();
                    break;

                case 3: // 삭제
                    service.deleteStudent();
                    break;

                case 4: // 수정
                    service.updateStudent();
                    break;

                case 5: // 전체 출력
                    service.printAllStudent();
                    break;
                case 6: // 이름 검색
                    service.searchStudentName();
                    break;
            }
        }
    }

}
