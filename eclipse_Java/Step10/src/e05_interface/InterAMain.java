package e05_interface;

public class InterAMain {
	
	public static void run(InterA inA) {
		inA.interA();
	}
	
	public static void main(String[] args) {
		InterAClass aClass = new InterAClass();
		InterBClass bClass = new InterBClass();
		aClass.interA();
		bClass.interA();
		
		run(aClass);
		run(bClass);
		
		
		System.out.println(aClass.circleArea(1.7));
		System.out.println(bClass.circleArea(0.5));
		
		bClass.interB();
		
		InterCClass cClass = new InterCClass();
		cClass.interA();
		aClass = cClass;
		aClass.interA();
		
		
		
	}

}
