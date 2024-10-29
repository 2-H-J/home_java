package test1;

public class Person {
	//멤버변수
	String name; // 이름
	int height; // 키
	double weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼여부
	
	public Person() { // 디폴트 생성자
		// 사람 이름을 매개변수로 입력받는 생성자를 만들어서 디폴트 생성자가 없으면 main Person()생성자에서 에러 발생 그래서 디폴트 생성자를 선언해 둔다.
		// 아래 생성자와 이 디폴트 생성자 둘다 main에서 사용가능
	}  
	
	//생성자 만들기
	/*
	 * 필요한 경우 프로그래머가 직접 생성자를 구현
	 * - 어떠한 경우에 생성자를 구현 하는지
	 * 		생성자는 주로 멤버 변수에 대한 값들을 매개변수로 받아서 인스턴스(객체)가 새로 생성될 때 멤버 변수 값들을 초기화 하는 역활을 함
	 * 		즉, 인스턴스가 생성됨과 동시에 멤버 변수의 값을 지정하고 인스턴스(객체)를 초기화하기 위해 생성자를 직접 구현하여 사용
	*/
	public Person(String pname) { // 사람 이름을 매개변수로 입력 받아서 Person클래스를 생성하는 생성자
		name = pname; 
	}

	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", gender=" + gender
				+ ", married=" + married + "]";
	}
	
	
	
}
