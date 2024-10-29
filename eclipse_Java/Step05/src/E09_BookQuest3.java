
public class E09_BookQuest3 {

	public static void main(String[] args) {
	/*
		Q3.
		구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램 만들기
		break 제외 하고 작성
		break 책 예제 보면서 문제 풀고 적용 풀이
	*/
		
//		break 제외 for문 
//		for(int i = 2; i<=9; i++) { // i : 단
//		System.out.println("--"+i+"단--");
//			for(int j = 1; j<=i; j++) { // j : 1 ~ 9
//				System.out.printf("%d x %d = %d\n",i,j,i*j);
//			}
//		}
		
		
//		break포함
		for(int i = 2; i<=9; i++) { // i : 단
			System.out.println("--"+i+"단--");
			for(int j = 1; j<=i; j++) { // j : 1 ~ 9
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				if(i == j) {
				break;
				}	
			}
		}

	}

}
