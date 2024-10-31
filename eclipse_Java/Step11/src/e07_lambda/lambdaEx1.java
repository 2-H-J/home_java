package e07_lambda;


public class lambdaEx1 {
	/*
		람다식(Lambda)
			함수형 프로그래밍 스타일을 지원하는 방법을 JDK8버전 부터 도입된 기능
			익명 함수의 한 형태로 메서드를 간단하게 표현할 수 있다.
			
			단, 단점은 인터페이스 내에 추상메서드가 한개여야만 한다
			
			-작성방법-
			(매개변수) -> 실행할 코드 한줄;
			
			(매개변수) -> {
				실행할 코드 1;
				실행할 코드 2;
				실행할 코드 3;
				...
			}
			----------------------------------------------------------------------
			// 매개변수가 없을 때
			() -> System.out.println("Hello, Lambda!");

			// 매개변수가 있을 때
			(x) -> System.out.println(x);

			// 두 개 이상의 매개변수가 있을 때
			(x, y) -> System.out.println(x + y);
			
			// 리턴 값이 있을 때
			(x) -> x * x;
			
	*/
	public static void main(String[] args) {
		
		//Calcurator 익명클래스로 만들어서 덧셈하는 기능
		Calcirator sum = new Calcirator() {
			
			@Override
			public int calc(int x, int y) {
				int sum = x + y;
				return sum;
			}
			
		};
		System.out.println(sum.calc(19, 29));
		
		// + lamda
		Calcirator calc1 = (a, b) -> a + b;
		System.out.println(calc1.calc(10, 20));
		
		// -
		Calcirator calc2 = (a, b) -> a - b;
		System.out.println(calc2.calc(20, 10));
		
		// 두 숫자중 큰숫자 리턴
		Calcirator calc3 = (a, b) -> a > b ? a : b;
		System.out.println(calc3.calc(20, 40));
		
		Calcirator total = (x, y) -> {
			//x부터 y까지 합 리턴
			int s = 0;
			if(x > y) {
				for(int i = y; i <= x; i++) {
					s += i;
				}
			}
			return s;
		};
		System.out.println(total.calc(1, 2));
		
		CalciratorExPrint print = () -> System.out.println("하이");
		print.print();
		
		
	}//main
	
}//class lamdaEx1
