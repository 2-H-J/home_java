package test1;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student(24092401); // Student 클래스 생성
		// new 예약어로 클래스 생성하기
		// 클래스형 변수이름 = new 생성자();
		// Student(클래스 자료형) studentAhn(변수) = new Student() -> 새로운 Student 클래스 생성 하여 studentAhn에 대입 : studentAhn - 참조 변수
		// 클래스 생성을 하면 클래스 사용을 위해 메모리공간(힙 메모리)을 할당 받는다
		// 이렇게 생성된 클래스를 인스턴스(객체)라고 함 인스턴스를 가리키는 클래스형 변수를 '참조 변수'라고 함
		
		studentAhn.studentName = "홍길동";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		Student student1 = new Student(24092402); // 두 번째 학생 생성
		student1.studentName = "김철수";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student(); // 세 번째 학생 생성
		student2.studentName = "이로한";
		System.out.println(student2.getStudentName());
		
		// 참조 변수 값 출력
		System.out.println(student1);
		System.out.println(student2);
	}

}
