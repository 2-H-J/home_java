import java.util.Scanner;

public class E04_Quest {

	public static void main(String[] args) {
		// 배열 생성

		int[] arr = { 2, 9, 7, 8, 6, 31, 41, 2, 3, 4, 4, 2, 3, 6, 4, 2, 1, 6, 7 };

//		배열에 저장된 값들 중 홀수의 개수를 출력

//		1. 홀수 개수 저장할 변수
		int count1 = 0;
//		짝수 개수
		int count2 = 0;

//		2. 배열 첫번째 요소부터 마지막까지 접글하면 해당 값이 홀수인지 확인
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if (arr[i] % 2 == 1) {
//				System.out.println(arr[i]);
				count1++;
			} else {
				count2++;
			}
		}
//		3. 홀수/짝수 개수 출력
		System.out.println("홀수 개수 : " + count1);
		System.out.println("짝수 개수 : " + count2);

//		직접 하기
		int[] arr1 = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
		}

	}
}