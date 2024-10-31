package e06_interface;

import java.util.ArrayList;

public class EatMain {

	public static void eat(Eat e) {
		e.eat();
	}
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Student s = new Student();
		HighStudent h = new HighStudent();
		
		eat(a);
		eat(d);
//		eat(s);
		eat(h);
		
		System.out.println("----------");
		
		ArrayList<Eat> list = new ArrayList<Eat>();
		list.add(a);
		list.add(d);
		list.add(h);
		
		for(Eat e : list) {
			e.eat();
		}
		
	}

}
