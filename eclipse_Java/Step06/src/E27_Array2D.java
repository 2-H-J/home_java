
public class E27_Array2D {

	public static void main(String[] args) {
		// 1차원 - 선
		// 2차원 - 면
		
//		정수형 배열 3행 4열짜리 생성(2차원 배열)
		int[][] arr = new int[3][4];
//		0행 - 4열 ㅁㅁㅁㅁ 
//		1행 - 4열 ㅁㅁㅁㅁ
//		2행 - 4열 ㅁㅁㅁㅁ
		
		System.out.println("행 개수 : "+arr.length);
		System.out.println("0번 행의 열개수 : "+arr[0].length);
		System.out.println("1번 행의 열개수 : "+arr[1].length);
		System.out.println("2번 행의 열개수 : "+arr[2].length);
	}

}
