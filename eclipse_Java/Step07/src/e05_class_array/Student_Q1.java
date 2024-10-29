package e05_class_array;

public class Student_Q1 {
	/*
	 * this -> 사용방법 : 매개변수와 필드, 다른 생성자 호출

		접근 제어자
		set / get, toString, 생성자(단축키, intellij)
		참조형, 클래스 배열, static

		Q1. 기존 학생 클래스 this , 접근제어자 set/get, toString 
		배열로 생성 해보기
	 */
	
	private String studentNo;
	private String sudentName;
	private String majorName;
	private double socre;
	
	public Student_Q1(String studentNo, String sudentName, String majorName, double socre) {
		super();
		this.studentNo = studentNo;
		this.sudentName = sudentName;
		this.majorName = majorName;
		this.socre = socre;
		
//		this("2302102","이씨","법학",2.5);
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getSudentName() {
		return sudentName;
	}

	public void setSudentName(String sudentName) {
		this.sudentName = sudentName;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getSocre() {
		return socre;
	}

	public void setSocre(double socre) {
		this.socre = socre;
	}
	
	// 점수에 따른 등급 메서드
	public void socreRank() {
		
	}

	// 학번 / 이름 / 학과명 / 점수
	@Override
	public String toString() {
		return "Student_Q1 [ studentNo = " + studentNo + " / sudentName = " + sudentName + " / majorName = " + majorName
				+ " / socre = " + socre + " ]";
	}
	
	
	
}
