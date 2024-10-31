package e03_abstract;

public class Dog extends Animal {

	@Override
	public void run() {
		System.out.println("개가 달립니다.");
	}

	public void eat() {
		System.out.println("개가 사료를 먹습니다.");
	}
	
	

}
