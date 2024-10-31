package main;

import java.util.Scanner;
import service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		while(true) {
			System.out.println("----사원관리 프로그램----");
			System.out.println("1. 사원정보 추가");
			System.out.println("2. 전체 사원정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();//엔터를 메모리에서 비움
			if(no == 0) break;

			switch (no) {
			case 1:
				service.insertEmployee();
				break;
			case 2:
				service.printAllEmployee();
				break;
			default:
				System.out.println("잘못된 번호입니다.");
				break;
			}

		}		
	}

}
