package test;

import java.util.Scanner;

public class Organize_2 {
// 홀 짝 구분
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 > ");
		int n = sc.nextInt();
		boolean b = false;
		if(n % 2 == 1) {
			System.out.println(b);
		}else {
			b = true;
			System.out.println(b);
		}
		
		if(n % 2 == 1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		int age = sc.nextInt();
		System.out.println("-------");
		// 20이상 이면 성인, 아니면 미성년
		if(age > 20) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
	}

}
