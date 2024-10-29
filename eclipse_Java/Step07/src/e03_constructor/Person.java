package e03_constructor;
// 이름, 나이 저장하는 클래스
// 이름 나이 출력하는 기능
public class Person {

	// 생성자 : 제일 먼저 실행되는 메서드 / return이 없다.
	// 메서드명은 클래스명과 같다. 기본생성자는 안만들어도 아무일도 하지 않는 생성자를 만든다.
	
	String name;
	int age;
	/*
	 * 생성자(Constructor)
	 * 		생성자는 객체를 하나 생성 할 때 제일 먼저 실행되는 메서드
	 * 		만약에 생성자를 직접 장성하지 않으면,
	 * 		자바 컴파일러가 자동으로 아무런 일도 안하는 기본 생성자를 추가
	 * 		Person(){ } : 생성자명(){ } - 생성자명은 클래스 명과 같다.
	 * 		1. 리턴(return)타입 없음
	 * 		2. 메서드 이름이 클래스 이름과 같다.
	*/
	
	Person(){
		System.out.println("Person 기본 생성자");
	}
	Person(String n){ // 메서드 명이 같아도 된다. / 매개변수로 구분 / 외부에서 데이터를 넣어 세팅 Main에 Person p2 = new Person("홍길동");
		System.out.println("Person(String) 생성자");
		name = n;
	}
	
//	이름이랑 나이 받아서 초기화 하는 생성자
	Person(String n, int a){
		System.out.println("Person(String), Person(int) 생성자");
		name = n;
		age = a;
	}
		
	
	void printPersonInfo() {
		System.out.println("이름 : "+ name + " / 나이 : " + age);
	}
	/*
	 * Stack : 메서드 호출, 지역변수 관리
	 *  
	 * Heap : 프로그램 실행 했을때 동적으로 필요한 메모리를 할당.
	 * 
	 * Meta : 정적인 메모리로 프로그램 시작부터 종료가 될때까지 메모리에 남아있음
	 * 		static, 생성자... 같은 것이 Meta에 저장됨
	*/
}
