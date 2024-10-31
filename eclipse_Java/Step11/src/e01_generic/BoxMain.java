package e01_generic;

public class BoxMain {

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(200);
		System.out.println(box.getObj());
//		System.out.println(box.getObj() * 3);
		
		box.setObj(new Apple());
//		box.getObj().printApple();
		Apple apple = (Apple) box.getObj();
		apple.printApple();
		
		box.setObj(new Orange());
		((Orange) box.getObj()).printOrange();
		
	}

}
