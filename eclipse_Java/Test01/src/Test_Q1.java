import java.util.Scanner;

public class Test_Q1 {

	public static void main(String[] args) {
	/*
		문제:
		사용자가 숫자를 입력하면 그 숫자가 짝수인지 홀수인지 판단하고, 
		짝수의 경우 "짝수입니다."를 출력하고, 홀수의 경우 "홀수입니다."를 출력하세요. 
		사용자가 0을 입력하면 프로그램을 종료하고, 
		지금까지 입력한 모든 숫자 중 짝수의 개수와 홀수의 개수를 각각 출력하는 프로그램을 작성하세요.

		조건:
		반복문을 사용하여 숫자를 입력받습니다.
		0을 입력하면 반복문을 종료합니다.
		짝수와 홀수의 개수를 각각 세기 위해 두 개의 변수를 사용하세요.		
	*/
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum1 = 0;
		int sum2 = 0;
		do {
			System.out.print("숫자 입력 (0을 입력하면 종료) > ");
			n = sc.nextInt();
			if(n % 2 == 0 && n != 0) {
				System.out.println("짝");
				sum1++;
			}else if(n % 1 == 0 && n != 0){
				System.out.println("홀");
				sum2++;
			}else {
				System.out.println("프로그램 종료");
				System.out.println("지금까지 입력한 짝수 개수 : "+sum1+" 개");
				System.out.println("지금까지 입력한 홀수 개수 : "+sum2+" 개");
			}
			
		}while(n != 0);
			
	}
		
}