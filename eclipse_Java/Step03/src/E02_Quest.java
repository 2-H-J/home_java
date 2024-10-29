import java.util.Scanner;

public class E02_Quest {
	public static void main(String[] args) {
		/*
		 * 숫자 하나 입력 받아서
		 * 해당 숫자가 짝수인지, 홀수 인지, 0인지 구분해서 출력
		 * 
		 * 실행 예시 >
		 * 숫자입력 >	숫자입력 >	숫자입력 >
		 * 5			0			10
		 * 홀수			0입니다.	짝수
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.println("홀수.");
		}else if(n == 0) {
			System.out.println("0 입니다.");
		}else {
			System.out.println("짝수.");
		}
		System.out.println("종료");
		
		System.out.println("------------------------");

		if(n != 0 && n % 2 == 0) {
			System.out.println("짝수입니다.");
		}else if(n % 2 == 1) {
			System.out.println("홀수입니다.");
		}else {
			System.out.println("0 입니다.");
		}
		
		System.out.println("------------------------");
		if(n % 2 == 1) {
			System.out.println("홀수");
		}
		if(n != 0 && n % 2 == 0) {
			System.out.println("짝수");
		}
		if(n == 0) {
			System.out.println("0");
		}
		System.out.println("종료");
		
		System.out.println("------------------------");
		
		if(n >= 0 && n <= 100) {
			System.out.println(" 0 ~ 100 ");
		}else if(n >= 101 && n <= 200) {
			System.out.println(" 101 ~ 200 ");
		}else {
			System.out.println("그 외");
		}
		
	}
}
