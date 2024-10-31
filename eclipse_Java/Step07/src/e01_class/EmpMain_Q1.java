package e01_class;

public class EmpMain_Q1 {

	public static void main(String[] args) {
		/*
		Q2. 사원정보 하나 저장할 클래스 작성해서
		사원정보 한건 저장후 출력
		저장할 정보
			사원번호, 이름 , 직급명, 부서명, 연봉, 성별

		출력형태
			20101111 김철수 (남) 부장 총무부 7800 
			
		empNo = no;
		empName = name;
		gender = gen;
		posn = pos;
		deptName = dept;
		sal = sl;
		*/
		Emp_Q1 emp1 = new Emp_Q1();
		emp1.einit("20101111", "김철수", true, "부장", "총무부", 7800);
		
		emp1.printEmpInfo();
		
	}

}
