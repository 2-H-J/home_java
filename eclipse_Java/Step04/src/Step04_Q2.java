import java.util.Scanner;

public class Step04_Q2 {

	public static void main(String[] args) {
/*
	Q2.	정수 두개를 입력 받은 후에 
	작은 숫자부터 큰 숫자까지 합
*/	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		int sum = 0;
		
		if(n1 < n2) {
		for(; n1 <= n2; n1++) {
			sum += n1;
		}
		}else {
			for(; n2 <= n1; n2++) {
			sum += n2;
			}
		}
		System.out.println(sum);
	
	}
}
