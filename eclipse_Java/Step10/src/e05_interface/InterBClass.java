package e05_interface;

public class InterBClass implements InterA, InterB{

	// 동일한 추상메서드가 여러개 있어도 한번만 재정의 하면 된다.
	@Override
	public void interA() {
		System.out.println("InterA Class B");
	}

	@Override
	public void interB() {
		System.out.println("InterB Class B");
	}

}
