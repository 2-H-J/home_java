package e08_is_a;

public class Person extends Animal{

	@Override
	public void eat() {
		System.out.println("사람이 밥을 먹습니다.");
	}
	
	public void study() {
		System.out.println("사람이 공부를 합니다.");
	}

	
	
}
