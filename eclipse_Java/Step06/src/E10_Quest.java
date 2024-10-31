import java.util.Scanner;

public class E10_Quest {

	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int i;

		for (i = 2; i < n; i++) {

			if (n % i == 0) {
				break;
			}
		}
		if (i == n) {
			System.out.println(n + " 숫자는 소수입니다.");
		}else {
			System.out.println(n + " 숫자는 소수가 아닙니다.");
		}
//-------------------------------------------------------------------------------------
		System.out.println("----------------------------------------");

		boolean flag = n < 2 ? true : false; // 입력수 n이 2보다 작으면 true : 아니면 false
		
		for (int j = 2; j <= n / 2; j++) {
			if (n % j == 0) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(n + " 숫자는 소수가 아닙니다.");
		else
			System.out.println(n + " 숫자는 소수입니다.");

	}

}
