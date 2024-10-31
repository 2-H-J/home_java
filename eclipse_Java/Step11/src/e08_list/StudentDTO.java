package e08_list;

import java.util.Objects;

public class StudentDTO {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;

	public StudentDTO(String studentNo, String studentName, String majorName, double score) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public void printInfo() {
		System.out.println(studentNo + " / " + studentName
				+ " / " + majorName + " / " + score);
	}

	@Override
	public int hashCode() {
//		System.out.println("hashCode");
		return Objects.hash(studentNo);
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals");
		if (this == obj)
			return true;
		if (!(obj instanceof StudentDTO))
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(studentNo, other.studentNo);
	}

	@Override
	public String toString() {
		return "[ 학번 : " + studentNo + " / 이름 : " + studentName + " / 학과 : " + majorName
				+ " / 평점 : " + score + " ]";
	}

	
	
}




