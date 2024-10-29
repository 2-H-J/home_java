package e01_object;

import java.util.Objects;

/*
 * Q1. 학생정보 저장하는 클래스를 작성
	학생정보 클래스에 equals 메서드 재정의 한 후 테스트
*/
public class Q1_Student {
	
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;
	
	public Q1_Student(String studentNo, String studentName, String majorName, double socre) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = socre;
	}
		
	@Override
	public String toString() {
		return "Q1_Student [ 학번 : " + studentNo + " / 이름 : " + studentName + " / 전공 : " + majorName
				+ " / 평점 : " + score + " ]";
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(studentName, studentNo);
	}
	@Override
		public boolean equals(Object obj) {
			
		// 1. 메모리 주소 값이 같으면 같은 객체
		if(this == obj) {
			return true;
		}
		// 2. null인지 체크
		if(obj == null) {
			return false;
		}
		// 3. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		if(obj != obj.getClass()) {
			Q1_Student temp = (Q1_Student) obj;
			return studentNo.equals(temp.studentNo);
		}
		
		// 4. 
			return false;
		}
	
	public static void main(String[] args) {
		
		Q1_Student st1 = new Q1_Student("213567", "홍길동", "컴공", 3.5);
		Q1_Student st2 = new Q1_Student("213567", "홍길동", "컴공", 3.5);
		Q1_Student st3 = new Q1_Student("214555", "둘리", "방송", 3);
		Q1_Student st4 = st2;
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(null));
		System.out.println(st2.equals(st4));
		
	}
}
