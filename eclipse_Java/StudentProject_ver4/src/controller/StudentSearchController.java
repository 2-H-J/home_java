package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentSearchController implements Controller {

	@Override
	public void execute() {
		//1. 검색할 학번 입력 받음
		System.out.println("[ 학생 정보 검색 기능 실행 ]");
		StudentService service = StudentService.getInstance();
		
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		//2. 서비스 클래스로 학번을 보내서 해당 학생 객체를 받음
		Student student = service.searchStudent(studentNo);
		
		//3. 검색 결과를 출력
		if(student == null) {
			System.out.println("학생 검색 결과가 없습니다.");
		}else {
			System.out.println(student);
		}
		
	}

}
