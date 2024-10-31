package e04_example;

// 정규직
public class permanentWorker extends Employee{

	public permanentWorker(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getPay() {
		return salary / 12;
	}

	
	
}
