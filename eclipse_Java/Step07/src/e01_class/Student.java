package e01_class; // 클래스 패키지 폴더

public class Student { // { }학생 클래스 영역 (필드)
//	클래스 안에 선언된 변수는 해당 객체가 일을 할때 사용되는 변수인데
//	이것을 field(필드)라고 한다.
	
//	멤버변수 : 해당 클래스의 구성요소
//	학번
	String studentNo;
//	이름
	String studentName;
//	학과
	String majorName;
//	평점
	double score;
////	성별
//	boolean age;


	
/* 
 * 메서드(method)(기능)
 * 		특정 기능에 해당하는 코드를 묶어서 나타내는 것을 메서드라고 한다.
 * 		클래스가 수행할 특정 기능 1개를 표현
 * 		메서드를 만들때는 반드시 하나의 기능만 담당하게끔 만들어야 한다.
 * 
 * 		리턴타입 메서드명([매개변수...]){
 * 			실행문...
 * 			[return [값];]
 * 		}  []대괄호 안 값은 있을수 있고 없을수도 있다.(매개변수, return)
*/
	
	// 학생정보 출력 기능을 등록해서 앞으로 기능을 등록하여 편하게 부를수 있다.
	// 메서드 이름은 알아보기 쉽게
	// 리턴X, 매개변수X
	void printStudentInfo() { 
		System.out.println(studentNo + " / " + studentName + " / " + majorName + " / " + score);
	}
	
	// 리턴X, 매개변수O(데이터가 필요할때)
	void init(String no, String name, String major, double s) { // (String no, String name, String major, double s) : 매개변수(parameter)
		// 학생데이터 초기화
		studentNo = no;
		studentName = name;
		majorName = major;
			if(s >= 0 && s <= 4.5) { //값을 넣을때 잘못 넣지 못하도록 조건을 달아둘수 있다.
				score = s;
		}
	}
	
}
