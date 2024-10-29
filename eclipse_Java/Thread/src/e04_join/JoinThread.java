package e04_join;

public class JoinThread extends Thread{

	public JoinThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println(getName() + " " + i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " - 스레드 종료");
	}
	
}

