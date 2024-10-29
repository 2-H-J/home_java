package e04_example;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		permanentWorker pworker = new permanentWorker("홍길",4000);
//		pworker.printEmployeeInfo();
		
		PartTimeWorker ptworker = new PartTimeWorker("둘리", 5, 11000);
//		ptworker.printEmployeeInfo();
		
		ForeignWorker fworker = new ForeignWorker("철수", 4500, 3);
//		fworker.printEmployeeInfo();
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(pworker);
		list.add(ptworker);
		list.add(fworker);
		list.add(new ForeignWorker("석열", 5000, 1));
		
		// 반복문 - 모든 직원의 정보를 출력
		for(Employee e : list) {
			e.printEmployeeInfo();
		}
		
		//전체 지출되는 급여 금액 출력
		int totalPay = 0;
		for(Employee e : list) {
			totalPay += e.getPay();
		}
		System.out.println("이번 전체 지출되는 전체 월 급여 : "+totalPay+" 만원");
		
	}

}
