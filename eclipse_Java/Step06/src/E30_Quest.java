
public class E30_Quest {

	public static void main(String[] args) {
/*	(행i)
		1	2	3	4	5  (0열j)
		10	9	8	7	6  (1)
		11	12	13	14	15 (2)
		20	19	18	17	16 (3)
		21	22	23	24	25 (4)
*/
		int[][] arr = new int[5][5];
		
		int n = 1, sw = 1, col = 0;
		
		for(int i = 0; i<arr.length; i++) {  // 행 자동 반복
			
			// 각 행에 숫자 채우기
			while(col < arr[i].length && col > -1) { // 열 채우기 반복 : col : 0부터 arr[i].길이 만큼 &&
				arr[i][col] = n++; //
				col += sw;
			}
			
			sw = -sw;
			col += sw;
		}		
//		int n = 1;
//		for(int i = 0; i<arr.length; i++) {
//			
//			if(i % 2 == 0) {
//			for(int j = 0; j<arr[i].length; j++) {
//					arr[i][j] = n++;
//			}
//			}else {
//			for(int j = 4; j >= 0; j--) {
//				arr[i][j] = n++;
//			}
//			}
//		}
		
//		출력
		for(int i = 0; i < arr.length; i++) {
			
			for(int v : arr[i]) {
				System.out.printf("%2d ", v);
			}
			System.out.println();
		}
		
	}

}
