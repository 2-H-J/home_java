package e03_syncronized;

public class Player extends Thread{
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" : "+Bank.getInstance().withdraw(1000));
	}
}
