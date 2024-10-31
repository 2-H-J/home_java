package e01_object;
/*
		-Object 클래스-
				자바에서 모든 클래스들의 최상위 클래스. 
				클래스가 기본적으로 가져야될 메서드를 제공하는 클래스가 Object클래스
				
				1. toString() : 객체의 내용을 문자열로 표현하는 메서드
				2. hashCode() : 객체의 해시 코드(정수) 값을 반환합니다. 객체를 식별하는 사용되는 정수값.
				3. equals(Object) : 두 객체가 내부 내용이 동일한지 비교하는 메서드
				
				4. clone() : 객체를 복제하는 메서드
				5. getClass() : 객체의 클래스를 나타내는 메서드
				6. fanalize() : 객체가 GC(가비지컬렉터)에 수거되기 전에 호출되는 메서드
				7. wait(), notify(), notifyAll() : 스레드 간에 동기화를 위해서 사용하는 메서드
				
		-GPT 설명-		
		최상위 부모 클래스: 자바의 모든 클래스는 명시적으로 상속받지 않아도 기본적으로 Object 클래스를 상속받습니다. 
							즉, 모든 객체는 Object 클래스의 인스턴스입니다.
							
		기본적인 메서드 제공: Object 클래스는 자바에서 가장 중요한 몇 가지 메서드를 제공합니다. 모든 객체는 이 메서드들을 사용할 수 있으며, 
							필요에 따라 **오버라이딩(Overriding)**하여 특정 클래스에 맞게 수정할 수 있습니다.
							
		다형성(Polymorphism): Object는 모든 객체의 상위 타입이므로, 다양한 객체를 Object 타입으로 처리할 수 있습니다.
				
*/
public class Person {
	// 이름
	private String name;
	
	// 나이
	private int age;
	
	// 전체필드 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString : 객체 내용을 문자열로 만들어서 리턴
	// 필드, 메서드에 리턴 값이 있는 경우 --> 외부에다가 알려줄 내용만 선택해서 사용
	@Override
	public String toString() {
		return "Person [ name = " + name + ", age = " + age + " ]";
	}
	
	// 객체가 동일한지 비교하는 메서드
	@Override
	public boolean equals(Object obj) { 
		// Person 객체가 Object로 형변환 되서 받아옴
		
		// 비교할때 제일 먼저 비교해야 할일
		// 1. 메모리 주소(해시값)이 같으면 같은 객체
		if(this == obj) {
			return true;
		}
		
		// 2. null인지 체크 : 값이 비어있는 null이면 에러가 발생
		if(obj == null) {
			return false;
		}
		
		// 3. 받아온 obj가 현재 객체랑 비교할 수 있는 타입인지 확인
		// 이때 사용하는 키워드 instanceof, getClass()를 활용함. 보통 getClass()를 활용
		if(obj instanceof Person) {
			// 1. obj를 형변환
			Person temp = (Person) obj;
			// 2. 내용 비교를 해서 결과값 리턴
			return name.equals(temp.name) && age == temp.age;
		}
		
		// 4. 3번이 거짓이면 타입이 다르기 때문에 거짓으로 처리
		return false;
	}






}
	
	
	

