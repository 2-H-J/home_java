import java.util.Scanner;

public class E16_Quset {

	public static void main(String[] args) {
	/*
		정수 하나를 입력 받아
		해당 정수의 약수 개수를 출력
		
		실행 예시 >
		숫자 입력 : 6
		약수의 개수 : 4
	*/
		Scanner sc = new Scanner(System.in);
		
//		변수 선언
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("약수의 개수 : "+count);
		
	}

}
