import java.util.Scanner;

public class E11_For {

	public static void main(String[] args) {
//		숫자 하나 입력 받아서
//		입력 한 숫자의 구구단을 출력
		
//		숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 입력 > ");
		int dan = sc.nextInt(); // 구구단 숫자 입력
		
		
//		예시 : 2단을 입력 하면 2 x 1~9까지 나와야 한다..
		
		System.out.println("--------------while문--------------");
		int n = 0; // 1~9 까지 반복할 변수

		while(n < 9 ) { // 1 ~ 9 까지 반복할 조건
			n++; // 증감식
			System.out.println(dan +" x "+ n +" = "+ dan * n);
			System.out.printf("%d x %d = %d \n",dan,n,dan*n);
		}
		
		
		System.out.println("--------------for문--------------");
		for(int i=1; i <= 9; i++) {
			System.out.printf("%d x %d = %d \n", dan, i, dan*i);
		}
		
	}

}
