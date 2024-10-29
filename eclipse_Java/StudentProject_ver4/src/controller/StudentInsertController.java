package controller;

import java.util.Scanner;

import dto.Student;
import service.StudentService;
// 추가 Controller
public class StudentInsertController implements Controller {

	@Override
	public void execute() {
		
		System.out.println("[ 학생정보 추가 기능 실행 ] ");
		StudentService service = StudentService.getInstance();
		
		// 사용자로부터 데이터 입력 을 받는다---------------------------------------------------
		Scanner sc = new Scanner(System.in);
		String studentNo = "";
		while (true) {
			System.out.print("등록할 학번 입력 : ");
			studentNo = sc.nextLine();
			// 학번 중복 체크
			// list에서 contains, indexOf에서 실행되는 equals는
			// 리스트 요소의 equals가 아니라
			// 비교할 대상의 equals를 쓰기 때문에 String으로 검색할 수 없다.
			if (service.getList().contains(new Student(studentNo, null, null, 0))) {
				System.out.println("[ 학번이 중복되었습니다. 다시 입력해 주세요 ]");
				continue;
			}
			break;
		}
		
		System.out.print("등록할 학생이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();

		// 서비스 클래스로 입력받은 데이터를 전달
		boolean result = service.insertStudent((new Student(studentNo, studentName, majorName, score)));

		// 서비스 클래스가 일한 결과를 받아서 출력한다.
		if (result) {
			System.out.println("[ 학생정보 추가 완료! ]");
		} else {
			System.out.println("[ 학생정보 추가 실패! ]");
		}
	}

}
