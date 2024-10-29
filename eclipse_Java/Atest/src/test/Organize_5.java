package test;

import java.util.Scanner;

public class Organize_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫1 > ");
		int n1 = sc.nextInt();
		System.out.print("숫2 > ");
		int n2 = sc.nextInt();
		
		int sum = 0;
		if(n1 < n2) {
			for(int i = n1; i <= n2; i++) {
				sum += i;
			}
		}else {
			for(int i = n2; i <= n1; i++) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
	}

}
