package e03_constructor;

public class Animal {
	// 동물
	String speies; // 종
	int age; // 나이
	 
//	단축키(자동) 생성자 필드 생성
//	우클릭 -> Soruce -> Constructor using Fields... / 단축키 -> 알트 + 쉬프트 + S + O
	public Animal(String speies, int age) {
		this.speies = speies;
		this.age = age;
	}

	public Animal(int age) {
		this.age = age;
	}

	public Animal(String speies) {
		this.speies = speies;
	}

//	단축키(자동) 기본생성자
//	우클릭 -> Soruce -> Constructor from Superclass.... / 단축키 -> 알트 + 쉬프트 + S + C
	public Animal() {
		
	}
	
	
	
	
}
