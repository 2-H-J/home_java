package test;

import java.util.Scanner;

public class Organize_4 {

	public static void main(String[] args) {
		/*
		Q1. 숫자 하나를 입력 받아서, 
			입력 받은 숫자가 완전수 인지 판단하는 코드를 작성

			실행 예시 >
			숫자 입력 : 6
			입력하신 숫자는 완전수 입니다.
			
			숫자 입력 : 5
			입력하신 숫자는 완전수가 아닙니다.
			
			완전수 : 퍼팩트넘버 ( 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 경우)
			0, 6, 28, 496, 8128, 33550336
	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 > ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		if (sum == n) {
			System.out.println(sum + " : O");
		} else {
			System.out.println(sum + " : X");
		}
	}

}
