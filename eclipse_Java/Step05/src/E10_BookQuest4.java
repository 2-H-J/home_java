import java.util.Scanner;

public class E10_BookQuest4 {

	public static void main(String[] args) {
		/*
		 * Q4. 반복문을 사용하여 다음 모양 출력 프로그램 만들기
		 			*
		 		   ***
		 		  *****
		 		 *******
		*/

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 > ");
		int line = sc.nextInt();

//		for(int i = 1; i <= line; i++) { 
////			줄 바꿈 : 내부 *만드는 반복문 한번 끝날때 마다 줄 바꿈
////					  1부터 입력한 수 까지
//				
//			for(int j=1; j<=line-i; j++) {
////			공백 : *찍기전 공백을 추가
////					1부터 입력한 수 - 줄개수 만큼
//				System.out.print(" ");
//			}
//				
//			for(int j = 1; j <= i; j++) {
////			별 : 공백 후 * 찍기
////				1부터 입력한 줄 개수 만큼( 줄개수를 라인수까지 반복하니 별또한 i변수 입력)
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("----------------------------------------------------------");
		
//		for(int i = 1; i<=line; i++) {
////			줄 바꿈 : 내부 *만드는 반복문 한번 끝날때 마다 줄 바꿈
////			  1부터 입력한 수 까지
//			for(int j=1; j<=line-i; j++) {
////				공백 : *찍기 전 공백을 추가
////				1부터 입력한 수 - 줄개수 만큼
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= i; j++) { // i*2+1
////				별 : 공백 후 * 찍기
//				System.out.print("*");
//			}
//			for(int k=1; k<=i-1; k++) {
////				별 : * 찍기
//				System.out.print("*");
//			}
////			for(int k=1; k<=line-i; k++) {
//////				공백 : *찍은 후 공백을 추가 안해도 됨
//////				1부터 입력한 수 - 줄개수 만큼
////				System.out.print(" ");
////			}
//			System.out.println();
//		}
		
//		System.out.println("-----------------------------------------");
		
		for(int i = 0; i<line; i++) {
//			줄 바꿈 : 내부 *만드는 반복문 한번 끝날때 마다 줄 바꿈
//			  1부터 입력한 수 까지
			for(int j=0; j<line-i; j++) {
//				공백 : *찍기 전 공백을 추가
//				1부터 입력한 수 - 줄개수 만큼
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) { // i*2+1 (0*2)+1 , (1*2)+1, (2*2)+1, ........... i : 0부터 입력 한 수 전까지 - 5 -> 0 1 2 3 4
//				별 : 공백 후 * 찍기
				System.out.print("*");
			}
			System.out.println();
		}
	}
}