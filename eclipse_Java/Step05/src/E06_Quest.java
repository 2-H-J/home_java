import java.util.Scanner;

public class E06_Quest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int line = sc.nextInt();
//		String star = "*";
		
		

		for(int i = 1; i <= line; i++) { 
//		줄 바꿈 : 내부 *만드는 반복문 한번 끝날때 마다 줄 바꿈
//					1부터 입력한 수 까지
			
			for(int j=1; j<=line-i; j++) {
//			공백 : *찍기전 공백을 추가
//					1부터 입력한 수 - 줄개수 만큼
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
//			별 : 공백 후 * 찍기
//				1부터 입력한 줄 개수 만큼( 줄개수를 라인수까지 반복하니 별또한 i변수 입력)
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i < line; i++) { // 줄 바꿈
				for(int j = 0; j < line; j++) { // 별 : 
					if(j < line - i - 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	}

}
