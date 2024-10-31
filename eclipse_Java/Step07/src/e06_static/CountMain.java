package e06_static;

public class CountMain {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		Count c5 = new Count();
		
//		System.out.println(c1.totalCount); private 선언해서 사용 불가
		System.out.println("-------");
		
		c1.addStaticCount();
		c2.addStaticCount();
		c3.addStaticCount();
		c4.addStaticCount();
		c5.addStaticCount();
		
		
	}
}
 