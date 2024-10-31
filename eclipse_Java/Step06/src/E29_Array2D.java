
public class E29_Array2D {

	public static void main(String[] args) {
		// 정수형 배열 5행 5열 짜리로 생성

//		채우는 형태
//		1	2	3	4	5
//		6	7	8	9	10
//		11	12	13	14	15
//		16	17	18	19	20
//		21	22	23	24	25
		int[][] arr = new int[][] { 
			{ 1, 2, 3, 4, 5 },
			{ 6, 7, 8, 9, 10 },
			{ 11, 12, 13, 14, 15 },
			{ 16, 17, 18, 19, 20 },
			{ 21, 22, 23, 24, 25 }
		};

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");		
		
		int[][] arr1 = new int[5][5];
		
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++) {
				arr1[i][j] = i * 5 + (j + 1);
			}
		}
		
		for(int[] a : arr1) {
			for(int n : a) {
				System.out.print(n + "	");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
		
		int[][] arr2 = new int[5][5];
		int num = 1;
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
//				arr2[i][j] = i * 5 + (j + 1);
				arr2[i][j] = num++;
			}
		}
		
		for(int[] a : arr2) {
			for(int n : a) {
				System.out.print(n + "	");
			}
			System.out.println();
		}
	}

}
