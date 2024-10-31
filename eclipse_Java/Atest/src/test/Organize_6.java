package test;

import java.util.Scanner;

public class Organize_6 {
	/*
	숫자 하나 입력 받아서 해당 숫자의 팩토리얼? 값 출력
	
	예>
	숫자 입력 > 5
	120
	
	팩토리얼 : 한 숫자의 1부터 자기 자신까지의 숫자를 곱한 결과
	
	5 -> 1 * 2 * 3 * 4 * 5
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int fac = 1;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 > ");
		n = sc.nextInt();
		
//		while(i <= n) {
//			fac *= i;
//			i++;
//		}
//		System.out.println("총 팩토리얼 값 : "+fac);
		for(; i <= n; i++) {
			fac *= i;
		}
		System.out.println("총 팩토리얼 값 : "+ fac);
		
	}

}
