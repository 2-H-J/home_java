import java.util.Scanner;

public class E15_Quest_Step04_Q2 {

	public static void main(String[] args) {
		
	/*
		Q2.	정수 두개를 입력 받은 후에 
		입력한 두 숫자중 작은 숫자부터 큰 숫자까지 합
	*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		
		int sum = 0;
//		if(n1 < n2) {
//			for(; n1 <= n2; n1++) {
//				sum += n1;
//			}
//		}else {
//			for(; n2 <= n1; n2++) {
//				sum += n2;
//			}
//		}
//		System.out.println(sum);
		
		if(n1 > n2) { // 조건식 n1이 n2보다 크면
			int temp = n1; // temp에 n1을 넣고
			n1 = n2; // n1에 n2을 넣고
			n2 = temp; // n2에 temp값을 넣는다
		}
		for(; n1 <= n2; n1++) {
			sum += n1;
		}
		System.out.println(sum);
		
	
	}

}
