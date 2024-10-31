package e04_example;

public class ForeignWorker extends Employee{

	private int rist; 
	// 1등급 - 기존 급여에 2배, 2등급 - 기존 급여에 1.5배 , 3등급 - 기존 급여 1.2배

	public ForeignWorker(String name, int salary, int rist) {
		super(name, salary);
		this.rist = rist;
	}

	@Override
	public int getPay() {
		// TODO Auto-generated method stub
		int result = salary / 12;
			switch (rist) {
			case 3 : 
				result *= 1.2;
				break;
			case 2 :
				result *= 1.5;
				break;
			case 1 :
				result *= 2;
				break;
			}
			
			return result;
			
	}
	
	
	
}
