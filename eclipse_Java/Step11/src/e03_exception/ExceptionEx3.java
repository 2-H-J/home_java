package e03_exception;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			// 작업 영역
			// 에러가 발생할 수 있는 영역
		System.out.println(1);
		System.out.println("나누기 결과 : " + 5 / 0);
		System.out.println(2); // 위에 에러가 발생하면 그 뒤에 코드부터는 무조건 실행이 안됨
		
		}catch(Exception e) {
			System.out.println(3);
			System.out.println(e.getMessage());
		}finally {
			// try영역에 작업이 정상적으로 끝나든, 또는 Exception 발생이 되든
			// 무조건 실행되는 영역
			System.out.println(4);
		}
		System.out.println(5);
		
		/*
		 * try영역에서 에러 발생시 catch Exception 영역 실행 후 finally 영역부터 순서대로 실행
		 * try영역에서 에러 발생이 없으면 catch Exception 영역은 건너 띄고 finally 영역부터 순서대로 실행
		*/
	}

}
