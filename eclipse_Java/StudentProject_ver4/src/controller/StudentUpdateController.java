package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;

public class StudentUpdateController implements Controller {

	@Override
	public void execute() {
		
		//1. 수정할 학번을 받음
		Scanner sc = new Scanner(System.in);
		String studentNo = null;
		//학번 입력 받음
		System.out.println("학생 정보 수정을 시작합니다.....");
		System.out.print("수정할 학번 입력 : ");
		studentNo = sc.nextLine();
		
		//2. 서비스에 해당 학생정보 검색 결과를 받음
		Student student = StudentService.getInstance().searchStudent(studentNo);
		
		//3-1. 검색 결과가 없으면 작업 중단, 메세지
		if(student == null) {
			System.out.println("[ 수정할 학생 정보가 없습니다. ]");
			return;
		}
		//3-2. 이름, 학과명, 평점 받아서 저장
		System.out.print("수정할 이름 입력 : ");
		student.setStudentName(sc.nextLine());
		System.out.print("수정할 학과명 입력 : ");
		student.setMajorName(sc.nextLine());
		System.out.print("수정할 학생 평점 입력 : ");
		student.setScore(sc.nextDouble());
		
		System.out.println("[ 학생 정보 수정 완료. ]");
		System.out.println("수정된 "+student);
	}

}
