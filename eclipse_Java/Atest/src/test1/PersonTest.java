package test1;

public class PersonTest {

	public static void main(String[] args) {
		/*
		 * 클래스의 멤버 변수는 메서드에 의해 값이 변경될 수도 있지만, 처음 클래스를 생성할 때 값을 정해야 하는 경우도 있다.
		 * 생성자가 하는 일은 클래스를 처음 만들 때 멤버 변수나 상수를 초기화 하는 것
		 * 
		 * 디폴트생성자
		 * 생성자는 클래스를 생성할 때만 호출
		 * 생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다.
		 * 생성자가 없는 클래스는 클래스 파일을 컴파일 할 때 자바 컴파일러에서 자동으로 생성자를 만들어 준다.
		 */
		Person p1 = new Person();// 클래스를 생성할 때 사용하는 Person(); 같은 함수를 생성자 라고 함
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		p1.name = "홍길동";
		p1.height = 180;
		p1.weight = 69.1;
		p1.gender = 'M';
		p1.married = false;
		
		Person p2 = new Person("이순신",175,60.5); // 인스턴스 변수 초기화와 동시에 클래스 생성
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
	
}
