package e03_exception;

import java.util.Scanner;

public class ExceptionEx6  {
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int n2 = sc.nextInt();
		
		if(n2 == 0)
			throw new Exception("0으로 나누면 안됩니다."); // throw new Exception(객체)를 만들면 에러를 발생 시킬 수 있다.
		
		System.out.println(n1 / n2);
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		//----------------------------------------
		System.out.println("프로그램 정상 종료");
	}

}
