
public class E28_Array2D {

	public static void main(String[] args) {
		
//		2차원 배열 선언 , 초기화 , 출력
		
		int[][] arr1 = new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		int[][] arr2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		System.out.println("-----각 행 열 지정해서 부르기-----");
		System.out.println(arr1[0][0]);
		System.out.println(arr1[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][1]);
		System.out.println("--------------------------------------");
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i][0]+"\n -----행과 열 반복문으로 출력하기-----");
			
			for(int j = 0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("--------------------------------------");
		
		for(int[] arr : arr2) {
			for(int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
