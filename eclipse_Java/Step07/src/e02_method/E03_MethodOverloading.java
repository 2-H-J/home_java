package e02_method;

public class E03_MethodOverloading {
//		메서드 중복해서 사용 : 메서드 오버로딩
//		c++ 부터 사용 / 객체지향이 생긴 후
//		메서드 이름은 같지만 들어오는 데이터에 따라 다른 기능을 할 수 있게 한다.
//		메서드명은 같지만 주는값(매개변수)은 다르게 줘야 한다.
	
	/*
	 * 메서드 오버로딩
	 * 		메서드 이름을 중복되서 사용이 가능하게끔 하는 문법
	 * 		이름이 같으면 구분해서 호출하는게 불가능하므로
	 * 		인자값을 받을 매개변수에 차이점을 두어서 구분을 시킨다.
	 * 		
	 * 		1. 매개변수 개수를 다르게 지정
	 * 		2. 매개변수 개수가 같다면, 매개변수 타입이 서로 일치하지 않으면 된다.
	 * 		
	*/
	static int plus(int a, int b) { // int
		System.out.println("int+int");
		return a + b;
	}
	static int plus(short a, short b) { // short
		System.out.println("short+short");
		return a + b;
	}
	static int plus(int a, int b, int c) { // int
		return a + b + c;
	}

	static double plus(double a, double b) { // double
		System.out.println("double+double");
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(plus(10, 20));		// 하나만 들어가면 int가 인식된다
		System.out.println(plus((short)2, 20)); // 타입 두개가 다를때 만족하는 타입으로 나온다 short a, int b 로 하면 지정한 메서드로 맞게 나온다
		System.out.println(plus((short)2, (short)20)); 
		System.out.println(plus(10, 20, 25));
		System.out.println(plus(1, 23.3));

	}
}
