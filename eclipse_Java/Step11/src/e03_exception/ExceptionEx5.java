package e03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5  {
	// static 메서드
	// 숫자 두개를 받아서 나눈 결과를 리턴하는 메서드
	public static int div(int n1 , int n2) throws IllegalStateException {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		
		try {
		// 숫자 두개 입력 받아서 위에 만든 메서드를 실행 후에 결과를 출력
		Scanner sc = new Scanner(System.in);
//		sc.close(); // java.lang.IllegalStateException: Scanner closed
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		System.out.println(div(n1, n2));
		
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage()+"숫자를 입력해야 합니다.");
		}
		
		
		
		//----------------------------------------
		System.out.println("프로그램 정상 종료");
	}

}
