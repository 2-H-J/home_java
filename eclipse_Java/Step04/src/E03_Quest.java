import java.util.Scanner;

public class E03_Quest {

	public static void main(String[] args) {
		
//		숫자 하나 입력 받고 입력 받은 갯수 만큼 Hello World 출력
		
//		숫자 입력 받기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int i = sc.nextInt(); // 입력 받는 변수 선언
		
		int y = 0; // 반복할 변수 선언
		
		while(i > y++) { // i 만큼 y 반복
			System.out.println(y+" Hello World");
		}
	
		System.out.println("--------------------------------");
		
		while(i-- > 0) {
			System.out.println(i+" Hello World");
//			i--;
		}
		
	}

}
