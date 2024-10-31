package e02_overriding;

public class Retriever extends Dog{
	
	@Override
	public void eat() {
		System.out.println("리트리버는 닭가슴살 사료를 먹습니다.");
	}
	// 부모 클래스 eat메서드가 있지만 자식클래스에서도 eat메서드를 만들면 자식 클래스 메서드를 사용한다.
	
}
