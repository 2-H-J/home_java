package e04_access;

public class Square_Q1_Main {

	public static void main(String[] args) {
		Square_Q1 s = new Square_Q1(0,0);
		
		s.setWidth(5);
		s.setHeight(5);
		
		System.out.println(s);
		
		System.out.println("사각형 넓이 : "+s.squarArea());
	}
	


}
 