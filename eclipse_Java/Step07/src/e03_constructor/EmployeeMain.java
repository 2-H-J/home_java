package e03_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("2025030500", "이형준","사원","인사과",5000);
		Employee emp2 = new Employee("2023020102", "김철수","부장","인사과",7000);
		
		
		emp1.EmployeeInfo();
		emp2.EmployeeInfo();
		

	} 

}
