import java.util.Scanner;

public class E12_Quest {

	public static void main(String[] args) {
		/*
		숫자 하나 입력 받아서 해당 숫자의 팩토리얼? 값 출력
		
		예>
		숫자 입력 > 5
		120
		
		팩토리얼 : 한 숫자의 1부터 자기 자신까지의 숫자를 곱한 결과
		
		5 -> 1 * 2 * 3 * 4 * 5
	*/
		
//		입력 스캐너
		Scanner sc = new Scanner(System.in);
//		숫자 입력
//		System.out.print("팩토리얼 구할 숫자 입력 : ");
//		int n = sc.nextInt();
		
		
//		-------while문-------
//		1. 숫자 입력, 팩토리얼 저장할 변수, 1 ~ 입력한 숫자까지 제어할 변수
//		int n = 0, fac = 1, i = 1;
//		
//		2. 숫자 입력
//		System.out.print("팩토리얼 구할 숫자 입력 : ");
//		int n = sc.nextInt();
//		4. 반복할 일 : 팩토리얼에 1 ~ 입력한 숫자를 1개씩 곱해서 저장
//		while(i <= n) {
//			fac *= i;
//			i++;
//			System.out.println("--");
//			System.out.println("입력숫자n : "+n+" / 증가i : "+i+ " / 곱해진 fac : "+fac);
//		}		
//		5. 결과 출력
//		System.out.println("결과 합 : "+fac);
		
//	----------------------------------------------------------------------------------	
		
//		-------for문-------
//		숫자 입력
		System.out.print("팩토리얼 구할 숫자 입력 : ");
		int n = sc.nextInt();
		
//		팩토리얼 저장할 변수
		int fac = 1;
		
//		for 반복문 + 제어할 변수(지역 변수)
		for(int i=1; i<=n; i++) { // 입력한 수(n) 반복문(i) : 1부터(i) 입력한 수(n) 까지 반복
			System.out.println(fac+" x "+i);
			fac *= i; // fac변수에 입력한 수(n)만큼 1부터 1개씩증가(i) 곱
			System.out.println("입력숫자n : "+n+" / 증가i : "+i+ " / 곱해진 fac : "+fac);
		}
		System.out.println("결과 합 : "+fac);
	}

}
