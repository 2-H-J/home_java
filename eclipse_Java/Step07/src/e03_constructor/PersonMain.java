package e03_constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동"); 
		Person p3 = new Person("이형준",30);
		
		System.out.println("------------------------------------------");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("------------------------------------------");
		
		p1.printPersonInfo();
		p2.printPersonInfo();
		p3.printPersonInfo();
		
	}

}
