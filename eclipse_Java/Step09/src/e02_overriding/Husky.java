package e02_overriding;

public class Husky extends Dog{

	@Override
	public void eat() {
		System.out.println("허스키는 고기를 먹습니다.");
	}
	
	public void run() {
		System.out.println("허스키가 달립니다.");
	}
	
	

}
