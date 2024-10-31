import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int line = sc.nextInt();
		String star = "*";
		
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println(); // 안 쪽 for문이 끝나고 줄 바꿈
		}
		

		
		
		
		
	}

}
