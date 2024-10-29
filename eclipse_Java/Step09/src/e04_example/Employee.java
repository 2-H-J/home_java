package e04_example;

public class Employee {
	
	// 사원(직종) 종류에 따라 급여 계산 다르게
	
	// 이름
	protected String name;

	// 연봉 변수
	protected int salary;
	
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// 연봉 계산해서 리턴하는 메서드
	public int getPay() {
		return salary;
	}
	
	// 이름 + 연봉정보 출력
	public void printEmployeeInfo() {
		System.out.println(" [ 이름 : " + name + " / 급여 : " + getPay() + " 만원 ]"); 
	}
	
	
	// 직원이 할 일
	public void work() {
		System.out.println("직원이 일을 합니다.");
	}

}
