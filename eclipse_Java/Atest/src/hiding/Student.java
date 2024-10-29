package hiding;
// 접근 제어자
// public 외부 접근 가능 
// private 외부 접근 불가
public class Student {
	int studentId;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() { // 값을 얻는 getter
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	
}
