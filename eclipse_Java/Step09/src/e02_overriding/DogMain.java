package e02_overriding;

public class DogMain {
	
	public static void dogEat(Dog dog) {
		dog.eat();
		// dog.run(); husky 에만 있는 기능 호출 x
		
		
	}// 부모와 자식클래스 관계로 있으면 부모클래스로 형변환이 가능하다

	public static void main(String[] args) {
		// 부모 클래스 eat메서드가 있지만 자식클래스에서도 같은 eat메서드를 만들면 자식 클래스 메서드를 사용한다.
		Retriever retriever = new Retriever();
		retriever.eat();
		
		Bulldog bull = new Bulldog();
		bull.eat();
		
		Husky husky = new Husky();
		husky.eat();
		System.out.println("--------------");
		
		dogEat(retriever);
		dogEat(bull);
		dogEat(husky);
		
	}

}
