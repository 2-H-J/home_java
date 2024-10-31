package e08_is_a;

public class IsAMain {

	public static void main(String[] args) {
		
		Person p = new Person();
		Dog d = new Dog();

		// Person
		Animal a = p;
		a.eat();
		
//		Person e = a; // 작은 개념이 큰개념으로 자동 형변환이 안되니 에러 아래와 같이 강제로 해줘야 한다
		Person e = (Person) a;
		e.eat();
		
		// p , a, e 는 동일한 객체(Person)이다
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(e));
		
		//Dog
		d.eat();
		Animal b = d;
		b.eat();
		Dog g = (Dog) b;
		g.eat();
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(g));
		
		//Dog -> Person
		Animal al = d; // Dog -> Animal
		// Animal에 Dog 인스턴스 이기 때문에 Dog는 Person으로 변경X
		// Dog와 Person은 관계가 없다.
		Person pr = (Person) al; // Animal -> Person
		pr.eat(); // 에러 : Dog cannot be cast to class e08_is_a.Person Dog는 Person으로 강제 형변환 할 수 없다
		
		// 
		
	}

}
