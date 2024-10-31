package e02_overriding;

public class Bulldog extends Dog{

	@Override // 오버라이딩 단축어 Alt + Shift + s -> v
	public void eat() {
		System.out.println("불독은 핫도그를 먹습니다.");
	}
	
}
