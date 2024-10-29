package e03_exception;

public class ExceptionEx1 {
	/*
	 * 에러 타입
	 * 컴파일 에러 : 문법에러
	 * 런타입 에러 : 프로그램 실행중 중간에 발생하는 에러
	*/
	public static void main(String[] args) {
		try {
			// 작업 영역
			// 에러가 발생할 수 있는 영역
		System.out.println(1);
		System.out.println("나누기 결과 : " + 5 / 0); // 런타입 에러
		// 에러가 발생하면 다음 실행을 catch영역을 실행하러 간다
		System.out.println(2);
		
		}catch(Exception e) {
			// try영역에서 Exception(런타입 에러)이 발생했을 때 처리하는 영역
			// Exception이 발생하지 않으면 실행되지 않는 영역
			System.out.println("에러발생 "+3);
			System.out.println(e.getMessage());
		}
		System.out.println(4);
		
		System.out.println("------------------------------");
		
		try {
			System.out.println(1);
			System.out.println("나누기 결과 : " + 5 / 2);
			System.out.println(2);
		}catch(Exception e) {
			// 에러가 발생했을 때 처리하는 영역
			// 에러가 발생하지 않으면 실행되지 않는 영역
			System.out.println("에러발생 "+3);
		}
		System.out.println(4);
		
		/*
		 * Exception
		 * 프로그램이 실행 중에 에러가 발생하면 아무런 처리도 없이 강제 종료됨,
		 * 프로그램을 강제로 종료가 되지 않게끔 처리하기 위해서,
		 * Exception을 이용해서 실행하는 도중에 에러가 발생하면 해당 에러를 잡아서 처리하고
		 * 코드를 계속 이어서 작업하게끔 처리하는 방법
		 * 
		 * try : 작업 영역, 이 영역에서는 Exception이 발생 할 수 있다.
		 * catch : try영역에서 Exception이 발생 했을 때, 해당 Exception을 처리하는 영역
		 * finally : Exception이 발생을 하든 안하든 반드시 실행되는 다음 영역
		 * throw : 원하는 부분에서 Exception을 강제로 발생 시키는 행위
		 * throws : 발생한 Exception을 외부로 던지는 행위(메서드를 호출한 대상에서 Exception을 전달)
		*/
	}

}
