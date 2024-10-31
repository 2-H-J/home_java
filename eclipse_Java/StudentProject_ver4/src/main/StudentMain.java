package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {
	/*
	 * 	학적 관리 프로그램 버전 - 1
	 * 	1. 학생 데이터 등록
	 * 	2. 학생 데이터 검색
	 * 	3. 학생 데이터 삭제
	 * 	4. 학생 데이터 수정
	 * 	5. 학생 데이터 전체 출력
	 * 	0. 프로그램 종료
	 * 
	 * 	원하시는 번호를 입력 하세요 : 
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentService service = StudentService.getInstance();
		
		// 프로그램 타이틀과 메뉴
		System.out.println("\n=== 학적 관리 프로그램 버전 - 1 ===");
		System.out.println("+-------------------------------+");
		System.out.println("|   1. 학생 데이터 등록         |");
		System.out.println("|   2. 학생 데이터 검색         |");
		System.out.println("|   3. 학생 데이터 삭제         |");
		System.out.println("|   4. 학생 데이터 수정         |");
		System.out.println("|   5. 학생 데이터 전체 출력    |");
		System.out.println("|   6. 학생 데이터 이름 검색    |");
		System.out.println("|   0. 프로그램 종료            |");
		System.out.println("+-------------------------------+");
		while(true) {
            
            // 메뉴 번호 입력 받음
            System.out.print("진행할 번호 입력 : ");
            int no = sc.nextInt();
			
			// 0 반복문 종료
            if(no == 0 ) {
            	System.out.println("[ 프로그램 종료. ]");
            	return;
            }
            
            // Controller 받아옴
            Controller controller = HandlerMapping.getInstance().createController(no);
            
            // 작업 시작
            if(controller != null) 
            	controller.execute();

			
		}
	}

}
