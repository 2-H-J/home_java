package dto;
/*
 * DTO(Data Transfer Object) : 데이터 전송 객체 [ 데이터를 운반하기 위한 객체, 불필요한 부분은 최소화 ]
 * 
 * VO (Value Object) : 값을 표현하는 객체 [ getter만 존재 ]
 * VO는 생성된 후 상태가 변경되지 않는 불변 객체로 설계됩니다.
 * 필드 값이 한번 설정되면 변경할 수 없도록 final 키워드를 사용하여 필드를 정의하며, 
 * 모든 필드는 생성자를 통해 초기화됩니다.
 * 
 * Service : 비지니스 로직을 처리하는 클래스(프로그램이 수행해야되는 일, 그 일을 처리해주는 클래스)(사용자 일을 수행 해주려는 클래스)
 * 사용자가보는 View(Main)에서 요청이 들어오면 Service에서 확인 처리하고 
 * DAO(DB) 클래스에서 DB값 확인 후 요청값을 다시 Service로 보내고 다시 Main으로 간다.
 * 
 * Main : 사용자로부터 요청을 받고 해당 결과를 보여주는 클래스
*/

/*
 * DTO(Data Transfer Object): 데이터 전송 객체로 데이터를 운반하기 위한 객체
 * 이 클래스는 학생의 정보를 담고 있으며, 각 필드에 대한 접근을 제공하는 Getter와 Setter가 존재
 */
public class Student {
	
	//---필드
    // 학번
    String studentNo;
    // 이름
    String studentName;
    // 학과
    String majorName;
    // 평점
    double score;

    // public Student() - 생성자: 학생 객체를 생성할 때 모든 필드를 초기화
    public Student(String studentNo, String studentName, String majorName, double score) {
        super();
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.majorName = majorName;
        this.score = score;
    }

    
    // get/set method
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

    
    // toString() : 학생 객체를 출력할 때 보기 쉽게 문자열로 반환하는 메서드
    @Override
    public String toString() {
        return "학생정보 = [ 학번 : " + studentNo + " / 이름 : " + studentName + " / 학과 : " + majorName + " / 평점 : "
                + score + " ]";
    }
}
