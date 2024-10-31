package e06_static;

public class Student {
	/*
	 * this -> 사용방법 : 매개변수와 필드, 다른 생성자 호출

		접근 제어자
		set / get, toString, 생성자(단축키, intellij)
		참조형, 클래스 배열, static

		Q1. 기존 학생 클래스 this , 접근제어자 set/get, toString 
		배열로 생성 해보기
	 */
	private int studentNo; // 학번
	private String studentName; // 이름
	private String majorName; // 학과
	private double score; // 평점
//	static 값을 받을때마다 +1씩 증가하는걸 저장	
	private static int studenNunber = 2024091100; // 학번 증감 저장할 static 변수

	
//	this
	public Student(String studentName, String majorName, double score) {
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
		
		studentNo = studenNunber++;
	}


//	------------------- get / set -------------------
//	---------이름
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
//	--------학과
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
//	--------평점
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
//	------------------------------------------------

//	toString 
	@Override
	public String toString() {
		return "Student [ 학번 : " + studentNo + " 학생 이름 : " + studentName + " / 학과 이름 : " + majorName + " / 평점 : " + score + " ] ";
	}
	
	
	
	
	
	
	
	
	
	
}
