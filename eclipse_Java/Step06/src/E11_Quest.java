import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class E11_Quest {

	public static void main(String[] args) {
		/*
		 * E06 복습 Q2. 정수형 배열 길이가 10인 배열을 생성한 뒤에 숫자를 전부 입력 받아서 배열에 저장 한후 배열에 있는 숫자를 홀수 먼저
		 * 전부 출력하고 그다음 짝수를 전부 출력
		 * 
		 * 예시) 홀수 : 1 3 5 7 9 짝수 : 2 4 6 8 10
		 */
		int[] arr = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
		}

		System.out.print("홀수 출력 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("\n짝수 출력 : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------");
//		System.out.println(Arrays.toString(arr));

		String odd = "홀수 출력 : ";
		String even = "짝수 출력 : ";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				odd += arr[i] + " ";
			} else {
				even += arr[i] + " ";
			}
		}
		System.out.println(odd);
		System.out.println(even);

	}

}
