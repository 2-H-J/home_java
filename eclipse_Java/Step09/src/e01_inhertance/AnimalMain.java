package e01_inhertance;

public class AnimalMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat(); // Animal 클래스에 만든 eat메서드를 Dog 클래스가 상속받아 사용할 수 있다.
		
		Person person = new Person();
		person.eat();
		person.printAge();
	}

}
