package e05_anonymous;

public class AnimalMain {

	public static void eat(Animal animal) {
		animal.eat();
	}
	
	public static void main(String[] args) {
		
		Animal animal = new Animal() { // 일회성 클래스 선언과 동시에 객체를 생성
			
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		}; // animal 인스턴스
		animal.eat();
		
		
		Animal person = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		}; // person 인스턴스
		person.eat();
		
		
		eat(animal);
		eat(person);
		eat(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("개가 사료를 먹습니다.");
			}
		});
		
		
		
	}// main

}// class AnimalMain
