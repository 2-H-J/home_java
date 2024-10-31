package e01_object;


public class CloneMain {

	public static void main(String[] args) {
		Point p1 = new Point(10, 7);
//		Point p2 = p1.clone();
		Point p2 = p1;
		Point p3 = p1.clone();
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
		
		System.out.println("------------------------------------");
		
		System.out.println("p1 : "+System.identityHashCode(p1));
		System.out.println("p2 : "+System.identityHashCode(p2));
		System.out.println("p3 : "+System.identityHashCode(p3));
		
		System.out.println("-----------------------------------");
		
		p1.setX(50);
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
	}

}
