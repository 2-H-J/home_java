import java.util.Arrays;
import java.util.Scanner;

public class E25_Quest {

	public static void main(String[] args) {
		/*
		 * Q3. 정수형 배열 길이가 10인 배열을 생성 한뒤에 
		 * 입력한 숫자가 짝수면 맨뒤에서부터 채움 
		 * 입력한 숫자가 홀수면 맨앞에서부터 채움 입력이
		 * 
		 * 끝나면 전체 내용을 출력 
		 * 숫자 입력 : 1 [1,0,0,0,0,0,0,0,0,0]
		 * 
		 * 숫자 입력 : 4 [1,0,0,0,0,0,0,0,0,4]
		 * 
		 * 숫자 입력 : 3 [1,3,0,0,0,0,0,0,0,4]
		 */
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);

		int start = 0, end = arr.length - 1;

//		while(start <= end) {
////			숫자 입력
//			System.out.print("숫자 입력 > ");
//			int n = sc.nextInt();
////			홀짝 판단 해서 저장
//			if(n % 2 == 1) {
//				arr[start++] = n;
//			}else {
//				arr[end--] = n;
//			}
//			System.out.println(Arrays.toString(arr));
//		}

		do {
//			숫자 입력
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
//			홀짝 판단 해서 저장
			if (n % 2 == 1) {
				arr[start++] = n;
			} else {
				arr[end--] = n;
			}
			System.out.println(Arrays.toString(arr));

		} while (start <= end);
		System.out.println(Arrays.toString(arr));
	}

}
