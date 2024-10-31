package e03_abstract;

// 추상 클래스를 상속 받으면 해야할 두가지중 선택
// 1. 추상 메서드를 오버라이딩 재정의
// 2. 상속 받고 자식클래스도 추상 클래스로 지정 한다.
public class Person extends Animal{

	
	
	public Person() {
		System.out.println("Person 생성자");
	}

	@Override
	public void run() {
		System.out.println("사람이 달립니다.");
	}
}
