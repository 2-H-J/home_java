package dto;

public class Student {
    // 학번
    protected String studentNo;
    // 이름
    protected String studentName;
    // 학과
    protected String majorName;
    // 평점
    protected double score;

    public Student(String studentNo, String studentName, String majorName, double score) {
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

    @Override
    public String toString() {
        return "Student { " + "학번 : '" + studentNo + '\'' + ", 이름 : '" + studentName + '\'' + ", 학과 : '" + majorName + '\'' + ", 평점 : " + score + '}';
    }
}
