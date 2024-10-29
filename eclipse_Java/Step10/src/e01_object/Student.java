package e01_object;

import java.util.Objects;

public class Student {
	private String studentNo;
	private String studentName;
	private String majorName;
	private double score;
	
	public Student(String studentNo, String studentName, String majorName, double score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [ studentNo = " + studentNo + " / studentName = " + studentName + " / majorName = " + majorName
				+ " / score=" + score + " ]";
	}


//	@Override
//	public boolean equals(Object obj) {
//		if(obj == this) return true;
//		
//		if(obj == null) return false;
//		
//		if(obj instanceof Student) {
//			Student temp = (Student)obj;
//			return 	temp.studentNo.equals(studentNo) &&
//					temp.studentName.equals(studentName) &&
//					temp.majorName.equals(majorName) &&
//					score == temp.score;
//		}
//		return false;
//	}
	@Override
	public int hashCode() {
		
		return Objects.hash(majorName, score, studentName, studentNo);
	}
	
	@Override // 자동완성
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return Objects.equals(majorName, other.majorName) // Objects. 1.7버전 이상만 가능
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score)
				&& Objects.equals(studentName, other.studentName) 
				&& Objects.equals(studentNo, other.studentNo);
	}
	
	
	
	
	
	
	
	
	
}
