package dto;


import java.util.Objects;

public class Student {
    // 학번
    String studentNo;
    // 이름
    String studentName;
    // 학과
    String majorName;
    // 평점
    double score;

    // 생성자: 학생 객체를 생성할 때 모든 필드를 초기화
    public Student(String studentNo, String studentName, String majorName, double score) {
        super();
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.majorName = majorName;
        this.score = score;
    }

    // 학번 Getter
    public String getStudentNo() {
        return studentNo;
    }

    // 학번 Setter
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    // 이름 Getter
    public String getStudentName() {
        return studentName;
    }

    // 이름 Setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // 학과명 Getter
    public String getMajorName() {
        return majorName;
    }

    // 학과명 Setter
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    // 평점 Getter
    public double getScore() {
        return score;
    }

    // 평점 Setter
    public void setScore(double score) {
        this.score = score;
    }

    // 학생 객체를 출력할 때 보기 쉽게 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return "학생정보 = [ 학번 : " + studentNo + " / 이름 : " + studentName + " / 학과 : " + majorName + " / 평점 : "
                + score + " ]";
    }

    // 객체를 비교할 equals, hashCode
    // 객체의 내용을 비교할 때 학번만 이용
	@Override
	public int hashCode() {
		return Objects.hash(studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNo, other.studentNo);
	}
    
    
    
}
