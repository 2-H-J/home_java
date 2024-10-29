package test;

import java.util.Scanner;

public class Organize_7 {
	/*
	 * Q4. 반복문을 사용하여 다음 모양 출력 프로그램 만들기
	 			*
	 		   ***
	 		  *****
	 		 *******
	*/
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 > ");
		int line = sc.nextInt();

		// 줄바꿈
		for (int i = 0; i < line; i++) {

			// 공백
			for (int j = 0; j < line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
