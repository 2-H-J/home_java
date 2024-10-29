package e01_object;

import java.util.Arrays;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(10, 7), 5);
		Circle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		
		System.out.println("-------------------------------------------------------");
		
		c1.setR(10);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-------------------------------------------------------");
		
		c1.getPos().setX(50);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(c1.getClass()); // 풀네임
		System.out.println(c1.getClass().getPackageName());// 패키지 이름
		System.out.println(c1.getClass().getName()); // 패키지.클래스 이름
		System.out.println(c1.getClass().getSimpleName()); // 클래스 이름
		System.out.println(c1.getClass().getTypeName());
		// public 공개된 필드명 목록을 배열로 리턴
		System.out.println(Arrays.toString(c1.getClass().getFields()));
		// public 으로 공개된 메서드 목록을 배열로 리턴
		System.out.println(Arrays.toString(c1.getClass().getMethods()));
		
		
	}

}
