import java.util.Arrays;

public class Step06_2_Q2 {

	public static void main(String[] args) {
/*
		Q2. 길이가 20인 정수형 배열을 생성 후 값을 1~20까지 저장
			배열에 있는 내용을 자유롭게 섞은 후에 배열 내용 출력
*/
		int[] arr = new int[20];
		
		for(int i = 0; i<arr.length; i++ ) {
			arr[i] = (int)(Math.random()*20)+1;
		}
		System.out.println(Arrays.toString(arr));
		
//		
	}
	
}