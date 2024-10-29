import java.util.Scanner;

public class E06_Quest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수형 데이터 두개 입력을 받아서
		//입력 받은 두개의 숫자들을 이용해서 사칙연산 결과를 출력
		//1. 숫자 입력, 두번
		System.out.print("숫자 입력 > ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();
		
		//2. 계산
		//3. 결과 출력
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
	}
}




