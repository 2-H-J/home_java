package e04_example;

public class PartTimeWorker extends Employee{
	
	// 일한 시간, 시급
	
	private int workTime;
	private int payPerHour;
	
	public PartTimeWorker(String name, int workTime, int payPerHour) {
		super(name, 0);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	@Override
	public int getPay() {
		return workTime * payPerHour / 10000;
	}
	
	
	
	

}
