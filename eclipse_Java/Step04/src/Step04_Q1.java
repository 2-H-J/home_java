import java.util.Scanner;

public class Step04_Q1 {

	public static void main(String[] args) {
	/*
		Q1. 숫자 하나를 입력 받아서, 
			입력 받은 숫자가 완전수 인지 판단하는 코드를 작성

			실행 예시 >
			숫자 입력 : 6
			입력하신 숫자는 완전수 입니다.
			
			숫자 입력 : 5
			입력하신 숫자는 완전수가 아닙니다.
			
			완전수 : 퍼팩트넘버
			
			0, 6, 28, 496, 8128, 33550336
	*/
		Scanner sc = new Scanner(System.in);
		
//		변수 입력		
		int sum = 0; // 입력 수 총 합 변수
		 // 
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt(); // 입력 변수
		for(int i = 1; i < n; i++) { // i:1 부터 입력수 n 까지 증가
			if(n % i == 0) { // 입력수 나머지 증가된 i 나머지가 0인 수 조건
//				System.out.println(i);
				sum += i; // 조건수에 맞는 수 sum에 저장
			}
		}
		if(sum == n) { //
			System.out.println("완전");
		}else{
			System.out.println("완전x");
		}
		
		
	}
}

