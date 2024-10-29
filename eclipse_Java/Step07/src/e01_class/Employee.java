package e01_class;

public class Employee {
	/*
	Q2. 사원정보 하나 저장할 클래스 작성해서
	사원정보 한건 저장후 출력
	저장할 정보
		사원번호, 이름 , 직급명, 부서명, 연봉, 성별

	출력형태
		20101111 김철수 (남) 부장 총무부 7800 
	*/
	
	//필드
	//사번 - String
	String employeeNo;
	//이름 - String
	String employeeName;
	//성별 - Char / int / boolean
	boolean employeeGender;
	//직급 - String
	String positonName;
	//부서 - String
	String departmentName;
	//연봉 - int
	int employeeSalary;
	
	//메서드
	//사원정보 출력
	void pringEmployeeInfo() {
//		String checkGender = employeeGender ? "남" : "여";
		
		// 사번, 이름, (성별), 직급, 부서, 연봉
		
//		if(checkSalary() < 2400) {
//			System.out.println("연봉입력 오류 2400 이상 입력");
//		}else {
			System.out.printf("%s / %s / (%s) / %s / %s / %d\n", 
					employeeNo, employeeName, checkGender(), positonName, departmentName, employeeSalary);
//		}
	}
	
	//사원정보 초기화
	void init(String no, String name, boolean gender, String position, String department, int salary) {
		employeeNo = no;
		employeeName = name;
		employeeGender = gender;
		positonName = position;
		departmentName = department;
		employeeSalary = salary;
	}
	
	//성별 구하는 메서드
	String checkGender() {
		String result = "여";
		if(employeeGender)
			result = "남";
		return result;
	}
	
	// 연봉정보 수정하는 메서드
	// 연봉값은 2400이상인 값이 들어와야합니다.
//	int checkSalary() {
//		int sal = employeeSalary;
//		if(employeeSalary < 2400)
//			System.out.print(employeeNo +" / "+employeeName+ " : ");
//		return sal;
//	}
	
	boolean updateSalary(int salary) {
		if(salary >= 2400) {
			employeeSalary = salary;
			return true;
		}
		return false;
	}
}
