package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.Student;
import exception.StudentException;
import service.StudentService;
// 추가 Controller
public class StudentInsertController implements Controller {

	@Override
	public void execute() {
		
		System.out.println("[ 학생정보 추가 기능 실행 ] ");
		StudentService service = StudentService.getInstance();
		
		// 사용자로부터 데이터 입력 을 받는다---------------------------------------------------
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 학생 학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학생 이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		// 서비스 클래스로 입력받은 데이터를 전달
		boolean result = service.insertStudent((new Student(studentNo, studentName, majorName, score)));
		System.out.println("[ 학생정보 추가 완료! ]");
		
		} catch (StudentException e) {
			System.out.println(e.getMessage());
			
		} catch (InputMismatchException e) {
			System.out.println("평점은 숫자로 입력해 주세요!");
		}

		// 서비스 클래스가 일한 결과를 받아서 출력한다.
	}

}
