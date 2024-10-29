import java.util.Scanner;

public class Step06_1_Q2 {

	public static void main(String[] args) {
		/*
		 * Q2. 정수형 배열 길이가 10인 배열을 생성한 뒤에 
		 * 숫자를 전부 입력 받아서 배열에 저장 한후 배열에 있는 
		 * 숫자를 홀수 먼저 전부 출력하고 그다음 짝수를 전부 출력
		 * 
		 * 예시) 	홀수 : 1 3 5 7 9 
		 * 			짝수 : 2 4 6 8 10
		 */

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];


		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 숫자입력 : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("홀수 : ");
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println();

		System.out.print("짝수 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				System.out.print(arr[i] + " ");
			}

		}
	}

}
