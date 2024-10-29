package e03_syncronized;

public class Bank {
	private static Bank instance = new Bank();
	private int money;
	
	private Bank() {
		money = 2000;
	}
	
	public static Bank getInstance() {
		if(instance == null)
			instance = new Bank();
		
		return instance;
	}
	
	public synchronized int withdraw(int m) { // 동기화 : synchronized
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		money -= m;
		return money;
	}
}
