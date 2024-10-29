package e08_is_a;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
	
	public void run() {
		System.out.println("개가 달립니다.");
	}

}
