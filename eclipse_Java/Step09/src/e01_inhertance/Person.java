package e01_inhertance;

public class Person extends Animal {
	
	public Person() {
		System.out.println("Person 생성자");
	}
	
	//나이 출력하는 메서드
	public void printAge() {
		System.out.println("내 나이는" +age+ "입니다.");
		// 그냥 age를 사용 하면 The field Animal.age is not visible 에러
		// 부모클래스 Animal에서 변수(필드) 접근제어자를 protected로 지정하면 자식(Person)도 사용 할 수 있다.
	}
}
