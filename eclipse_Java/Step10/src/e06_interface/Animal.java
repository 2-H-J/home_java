package e06_interface;

public class Animal implements Eat{ // Animal 클래스 - Eat (Interface)

	@Override
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
	
	
}
