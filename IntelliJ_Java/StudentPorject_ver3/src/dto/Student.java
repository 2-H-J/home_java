package dto;

import java.util.Objects;

public class Student {
    // 학번
    String studentNo;
    // 이름
    String studentName;
    //학과
    String majorName;
    //평점
    double score;

    // 생성자 : 학생 객체를 생성할 때 모든 필드를 초기화
    public Student(String studentNo, String studentName, String majorName, double score) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.majorName = majorName;
        this.score = score;
    }

    // 학번Getter
    public String getStudentNo() {
        return studentNo;
    }
    // 학번Setter
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    // 이름Getter
    public String getStudentName() {
        return studentName;
    }
    // 이름Setter
    public void setStudentName(String sutdentName) {
        this.studentName = sutdentName;
    }
    // 학과Getter
    public String getMajorName() {
        return majorName;
    }
    // 학과Setter
    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
    // 평점Getter
    public double getScore() {
        return score;
    }
    // 평점Setter
    public void setScore(double score) {
        this.score = score;
    }

    // 학생 객체를 출력할 때 보기 쉽게 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return " 학생 정보 { " +
                " 학번 : '" + studentNo + '\'' +
                ", 이름 : '" + studentName + '\'' +
                ", 학과 : '" + majorName + '\'' +
                ", 평점 : " + score +
                " } ";
    }

    // 객체를 비교할 equals, hashCode
    // 객체의 내용을 비교할 때 학번만 이용
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Objects.equals(studentNo, student.studentNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentNo);
    }


}
