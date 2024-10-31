
public class E08_BookQuset2 {

	public static void main(String[] args) {
		/*
		 * Q2. 구구단을 짝수 단만 출력하도록 프로그램을 만들기 continue 제외하고 작성 해보고 
		 * continue 책 예제 보면서 문제 풀고 작성적용
		 */

//		continue 제외
//		for(int i = 2; i<=9; i++) { // i : 단   // i+=2 를 사용하면 if문 사용안해도 된다.
//			System.out.println("--"+i+"단--");
//			if(i % 2 == 0) { // 짝수만 출력 조건
//				for(int j = 1; j<=9; j++) { // j : 1 ~ 9
//					System.out.printf("%d x %d = %d\n",i,j,i*j);
//				}
//			}
//		}

		System.out.println("-------------------------------------------------");

//		for문 continue 적용
		for (int i = 2; i <= 9; i++) { // i : 단
			System.out.println("--" + i + "단--");
			if (i % 2 == 1)
				continue; // continue를 만나면 이후 문장을 수행하지 않고 for문 처음으로 돌아가 증감식 시작
//				if로 홀수를 구했지만 실행하지 않고 for문 증감식으로 간다
//				반복문 안에 홀수를 제외하고 짝수만 출력 하게 continue를 지우면 홀수만 출력
			for (int j = 1; j <= 9; j++) { // j : 1 ~ 9
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		
		System.out.println("-------------------------------------------------");
		
//		while문 continue 적용
		
		int dan = 2;
		int n = 1;
		while(dan <=9) {
			System.out.println("--" + dan + "단--");
			dan++;
			
			if(dan % 2 == 1) {
				dan++;
				for (int j = 1; j <= 9; j++) { // j : 1 ~ 9
					System.out.printf("%d x %d = %d\n", dan, j, dan * j);
				}
				continue;
			}
		}
	}
}
