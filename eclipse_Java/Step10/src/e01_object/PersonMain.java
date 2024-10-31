package e01_object;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		Person p3 = p1;
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(null));
		System.out.println(p1.equals(p3));
		
	}
}
