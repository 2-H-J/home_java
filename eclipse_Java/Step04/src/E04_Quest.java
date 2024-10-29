import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
//		숫자 하나 입력 받아서
//		입력 한 숫자의 구구단을 출력
		
//		숫자 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 입력 > ");
		int dan = sc.nextInt(); // 구구단 숫자 입력
		
		
//		예시 : 2단을 입력 하면 2 x 1~9까지 나와야 한다..
		
		int i = 0; // 1~9 까지 반복할 변수

		while(i < 9 ) { // 1 ~ 9 까지 반복할 조건
			i++; // 증감식
//			System.out.println(dan +" x "+ i +" = "+ dan * i);
			System.out.printf("%d x %d = %d \n",dan,i,dan*i);
		}
		
		System.out.println("------------------");
		
		char a = 'A';
		while(a <= 'Z') {
			
			System.out.println(a++);
		}
		
		System.out.println("------------------");
		
		/*		
		 문제) 정수 변수 num을 선언하여 1을 대입한 후
		1씩 증가시키면서 10까지의 누적 합을 구하는 프로그램
		while문을 이용하여 작성하고
		1부터 10까지의 합과 while문이 끝난 후의 num의 값을 출력
		*/
		
		int num = 1, sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
			System.out.println(sum);
		}
		
		System.out.println("------------------");
		
		
		
		}
		
	}


