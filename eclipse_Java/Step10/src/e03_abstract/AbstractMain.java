package e03_abstract;

public class AbstractMain {
	/*
		
	*/
	public static void main(String[] args) {
//		Animal animal = new Animal();
		Person p = new Person();
		
		p.eat();
		p.run();
		System.out.println("--");
		
		
		// 추상 클래스도 데이터 타입, 자식 클래스를 형변환 시켜서 저장시켜 리턴
		Animal a = p;
		a.eat();
		a.run();
		
		System.out.println("--");
		Dog d = new Dog();
		d.eat();
		d.run();
	}

}
