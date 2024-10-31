package test;

import java.util.Scanner;

public class Organize_3 {
	/*
	Q1. 사용자로부터 연도를 입력 받음
		입력받은 연도가 윤년인지 아닌지 출력
		
		4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
		
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 > ");
		int n = sc.nextInt();
		
		if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
			System.out.println(n+ " 윤");
		}else {
			System.out.println(n+ " 평");
		}
		
		if(n > 90) {
			System.out.println("A");
		}else if(n > 80) {
			System.out.println("B");
		}else if(n > 70) {
			System.out.println("C");
		}else if(n > 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
