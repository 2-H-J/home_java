package e03_super;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public void printAge() {
		
		System.out.println("이 동물의 나이 : "+age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
