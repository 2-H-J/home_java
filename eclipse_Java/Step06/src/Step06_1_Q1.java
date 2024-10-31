import java.util.Scanner;

public class Step06_1_Q1 {

	public static void main(String[] args) {
/*
	Q1.
	숫자 하나를 입력 받아서 
	입력 받은 숫자가 소수인지 아닌지 출력
	*소수는 1과 자기 자신의 약수만 존재하는 숫자
*/
		
//		숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 2; i < n/2; i++) {
			
			if(n%i == 0) {
				System.out.println(n +"숫자는 소수가 아닙니다.");
				break;
			}
		}
		System.out.println(n +"숫자는 소수 입니다.");
	}

}
