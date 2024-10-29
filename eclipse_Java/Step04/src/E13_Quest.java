import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
/*
	숫자 하나 입력 받아서
	입력한 숫자의 모든 약수를 출력
	
	실행 예 >
	
		숫자 입력 > 6
		1 2 3 6
				
*/		
		Scanner sc = new Scanner(System.in);
		
//		숫자 입력
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
//		
		for(int i=1; i<=n; i++) { // 지역변수i 선언 1로 초기화; 1(i)부터 입력숫자(n)까지; 증가(i++)
			if(n % i == 0) { // n 부터 입력숫자 n까지 반복하여 나눠 == 0인 수 저장
				System.out.print(i+ " "); // 결과 출력
			}
			
		}
		
	}

}
