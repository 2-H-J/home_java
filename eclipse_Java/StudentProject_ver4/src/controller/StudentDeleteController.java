package controller;

import java.util.Scanner;

import service.StudentService;

public class StudentDeleteController implements Controller {

	@Override
	public void execute() {
		System.out.println("[ 학생 정보 삭제를 시작합니다 ]");
		
		//1. 삭제할 학번 입력 받음
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.print("삭제할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		// 결과를 받고
		boolean result = StudentService.getInstance().deleteStudent(studentNo);
		
		//3. 삭제 결과를 출력
		if (result) {
			System.out.println("[ 학생정보 삭제 완료 ]");
		} else {
			System.out.println("[ 삭제할 정보가 없습니다. ]");
		}
	}

}
