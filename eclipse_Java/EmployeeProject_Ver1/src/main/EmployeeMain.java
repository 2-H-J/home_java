package main;

import java.util.Scanner;

import service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println();
		/*
		 * 	사원 관리 프로그램 버전 - 1
		 * 	1. 사원 데이터 검색
		 * 	2. 사원 데이터 추가
		 * 	3. 사원 데이터 수정
		 * 	4. 사원 데이터 삭제
		 * 	5. 사원 데이터 전체 출력
		 * 	0. 프로그램 종료
		 * 
		 * 	원하시는 번호를 입력 하세요 : 
		*/
		// 1. 검색
		// 2. 추가
		// 3. 수정
		// 4. 삭제
		// 5. 전체 출력
		
		// 번호 입력 받기
		Scanner sc = new Scanner(System.in);
		
		EmployeeService employee = EmployeeService.getInstance();
		
        System.out.println("\n= 사원 관리 프로그램 버전 - 1 =");
        System.out.println("+---------------------------+");
        System.out.println("|  1. 사원 데이터 추가	    |");
        System.out.println("|  2. 사원 데이터 검색	    |");
        System.out.println("|  3. 사원 데이터 삭제      |");
        System.out.println("|  4. 사원 데이터 수정      |");
        System.out.println("|  5. 사원 데이터 전체 출력 |");
        System.out.println("|  6. 사원 데이터 이름 검색 |");
        System.out.println("|  0. 프로그램 종료         |");
        System.out.println("+---------------------------+");
        
        while(true) {
        	
        
        System.out.print("진행할 번호 입력 : ");
		int no = sc.nextInt();
		
			switch(no) { // 프로그램 종료
			case 0: 
				System.out.println("프로그램을 종료 합니다.");
				return;
				
			case 1: // 추가
				employee.insertEmployee();
				break;
				
			case 2: // 검색
				employee.searchEmployee();
				break;
				
			case 3: // 삭제
				employee.deleteEmployee();
				break;
				
			case 4: // 수정
//				employee.updateEmployee();
				break;
				
			case 5: // 전체 출력
				employee.PrintAll();// 사원 전체 출력
				break;
			case 6: // 부서 검색
//				service.searchEmployeeName();
				break;
		
			}
		
        }

	}
}