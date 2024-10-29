package e01_class;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		// new -> 메모리 할당, 생성된 Employee 객체(instance)

		emp1.init("22101000", "홍길동", true, "부장", "인사과", 3500);
		emp2.init("22101000", "마이콜", true, "사원", "인사과", 1500);
		emp1.pringEmployeeInfo();
		emp2.pringEmployeeInfo();
		
		System.out.println(emp1.updateSalary(3500));
		System.out.println(emp2.updateSalary(1500));
	}

}
