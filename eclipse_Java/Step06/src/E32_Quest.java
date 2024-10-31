import java.util.Scanner;

public class E32_Quest {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 숫자1 : ");
		int cl1 = sc.nextInt();
		System.out.print("열 숫자2 : ");
		int cl2 = sc.nextInt();
		int[][] arr = new int[cl1][cl2]; // 2차원배열 int[][] arr = new int[][]; 

		int row = 0; //
		int col = -1; //
		int sw = 1; // 방향 변수 1 : 오른쪽 or 아래 , -1 : 왼쪽 or 위
		int n = 1; //
//		int k = 5; //

		while (true) { // 반복
			// 가로 방향 채움
			for (int i = 0; i < cl2; i++) {
				col += sw;
				arr[row][col] = n++;
			}

			// 채우는 개수 감소
			cl1--;
			cl2--;
			if(cl1 == 0) break;

			// 세로 방향 채움 
			for (int i = 0; i < cl1; i++) {
				row += sw;
				arr[row][col] = n++;
			}
			sw = -sw;
		}
		// 배열 내용 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
