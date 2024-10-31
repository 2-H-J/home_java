package e04_access;
/*
 * 접근제어자
 * 		변수와 메서드를 접근할 수 있는 범위를 설정하는 옵션
 * 
 * 		★public : 누구든지 접근이 가능(공개)
 * 		★private : 해당 클래스 내에서만 접근이 가능한(외부에서 접근X)(비공개)
 * 		★protected : 해당 클래스를 상속 받는 자식(자손들까지 가능) 클래스들까지 접근이 가능(상속을 고려한 제한)
 * 		default : 접근제어자를 사용 안했을때 자동으로 붙음, 같은 패키지 내에 있는 클래스들 까지 접근 가능(패키지 접근, 아무것도 명시하지 않은 경우)
*/

public class Person {
//	이름, 나이
	private String personName;
	private int age; // 접근제어자 : 값을 사용클래스만 변경 할 수 있도록
	
	
	public Person(String personName, int age) {
		this.personName = personName;
		this.age = age;
		
		personName = "정수";
		age = 20;
	}
//	get , set 단축키 : 알트 + 쉬프트 + S + R
	
	// 나이 저장 메서드
	public void setAge(int age) { // 외부에서 데이터를 받는 메서드
		this.age = age;
	}
	// 나이를 외부로 반환 메서드
	public int getAge() { // 외부로 값을 반환 
		return age;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonName() {
		return personName;
	}

	
	@Override
	public String toString() {
		return "Person [personName = " + personName + ", Age = " + age + "]";
	}

}
