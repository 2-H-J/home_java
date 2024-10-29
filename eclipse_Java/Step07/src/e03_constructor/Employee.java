package e03_constructor;

public class Employee {

	String empNo; // 사번
	String empName; // 사원명
	String posn; // 직급
	String deptName; // 부서
	int sal; // 급여

	// 모든 필드 초기화하는 생성자
	public Employee(String empNo, String empName, String posn, String deptName, int sal) {
		this.empNo = empNo;
		this.empName = empName;
		this.posn = posn;
		this.deptName = deptName;
		this.sal = sal;
	}
	
	// 사원정보 출력하는 메서드
	void EmployeeInfo() {
		System.out.printf("%s / %s / %s / %s / %d \n",empNo, empName, posn, deptName, sal);
	}
	// EmployeeMain 클래스 작성해서 작성한 Employee 클래스 생성해서 테스트

	public Employee() {
	}
}
