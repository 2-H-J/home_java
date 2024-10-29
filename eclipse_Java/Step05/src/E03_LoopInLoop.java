
public class E03_LoopInLoop {

	public static void main(String[] args) {
/*
		구구단 2x1 ~ 9x9 반복
*/

//		for문
//		for(int dan = 2; dan < 10; dan++) {
//			System.out.println("---"+ dan +"단 ---");
//			for(int i = 1; i < 10; i++) {
//				System.out.printf("%d x %d = %d \n", dan, i, dan*i);
//			}
//		}
		
//		while문 중첩 반복문
		
		int dan2 = 2;
		int n = 1;
		while(dan2 < 10) {
			System.out.println("---"+ dan2 +"단 ---");
			while(n < 10) { // 1~9 까지 
				System.out.printf("%d x %d = %d \n", dan2, n, dan2*n);
				n++;
			}
			n = 1; // 중첩된 반복문 초기화
			dan2++; // 단 반복
		}
		
//		while + for
		
//		int dan3 = 2;
//		while(dan3 < 10) {
//			System.out.println("---"+ dan3 +"단 ---");
//			for(int j=1; j<10; j++) {
//				System.out.printf("%d x %d = %d \n", dan3, j, dan3*j);
//			}
//			dan3++;
//		}
		
	}

}
