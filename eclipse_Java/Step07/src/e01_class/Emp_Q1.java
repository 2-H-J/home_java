package e01_class;

public class Emp_Q1 {
	/*
	Q2. 사원정보 하나 저장할 클래스 작성해서
	사원정보 한건 저장후 출력
	저장할 정보
		사원번호, 이름 , 직급명, 부서명, 연봉, 성별

	출력형태
		20101111 김철수 (남) 부장 총무부 7800 
	*/
	String empNo;
	String empName;
	String posn;
	String deptName;
	int sal;
	boolean empGender;
	
	void printEmpInfo() { 
		String gender = empGender ? "남" : "여";
		System.out.println(empNo + " / " + empName + " / " + gender + " / " + posn + " / " + deptName + " / " + sal);
	}
	
	void einit(String no, String name, boolean gen, String pos, String dept, int sl) { 
		empNo = no;
		empName = name;
		empGender = gen;
		posn = pos;
		deptName = dept;
		sal = sl;

	}
	
}
