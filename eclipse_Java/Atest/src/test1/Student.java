package test1;
/*
 * 패키지(클래스 파일 묶음)
 * 패키지는 계층 구조를 가질 수 있음
*/
public class Student { // public(접근제어자) class ( 클래스 예약어) Student(클래스 이름, 객체)
	
	// 멤버변수
	// 학생객체가 가지는 속성(학번,이름,학년,주소)를 변수로 선언
	
	int studentId; // 학번
	String studentName; //학생이름
	int grade; // 학년
	String address; // 사는 곳	
	
	
	
	// 교재 129 페이지 문제. 1. class / 2. Person / 3. int
	
	// 클래스 이름 짓는 규칙 : 클래스 이름은 대문자로 시작
	
	// 클래스 기능 : 메서드(method)
	
	public Student() { // 디폴트 생성자
		
	}

	// 학생 이름과 주소 출력 메서드
	public void showStudentInfo() { // 반환값이 없으면 void
		System.out.println(studentName + " / " + address); // 이름 / 주소
	}
	
	// 학생 이름을 반환하는 메서드
	// 반환값 학생 이름 자료형 String 이므로 반환형 String
	public String getStudentName() { 
		return studentName; 
	}
	// 메서드 이름은 해당 클래스를 사용하는 코드의 입장에서 짓는 것이 좋다.
	
	// 학생 이름을 부여하는 메서드
	public void setStudnetName(String name) { // set 전달 받는 기능 학생 이름을 전달 받아야 하기 때문에 매개변수 name 필요
		studentName = name; // 학생 이름을 매개변수로 전달
	}

	public Student(int studentId) {
		this.studentId = studentId;
	}
	
	
	

}
