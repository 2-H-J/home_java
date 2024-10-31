package e02_method;

import e04_access.Square_Q1; // package가 다르면 다른 package에 있는 클래스를 import 시켜줘야 그 class를 사용 가능하다

public class E04_CallRefVal {
//----------------------------------------------------------------------------------------------------
	public static int addNumber(int n) {
		n = n+1;
		return n;
	}
	/*
	 * Call by Value - 값에 의한 호출 --> 값을 복사해서 보냄
	 * 매개변수와 호출하는 변수와는 별개, 메서드에서 수정 작업을 해도 원본에는 영향을 미치지 않는다.
	 * 주로 기본형 변수 타입에서 발생한다.(int, float, char, double....)
	*/
//----------------------------------------------------------------------------------------------------
	public static void initSquare(Square_Q1 s) {
		s.setWidth(10);
		s.setHeight(5);
	} 
	/*
	 * Call by Reference - 참조에 의한 호출 --> 메모리 주소값이 전달
	 * 메모리 주소가 전달되기 때문에 다른 메서드에서 수정작업을 하면 원본에 내용이 바뀐다.
	 * 주로 참조형 변수타입에서 발생한다. (String, 클래스 타입...)
	*/
//----------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		// Call by Value
		int n = 10;
		addNumber(n);
		System.out.println(n); // 
		
		// Call by Refaerence
		Square_Q1 s = new Square_Q1(40, 20);
		initSquare(s);
		System.out.println(s);
		
	}
}
