import java.util.Arrays;
import java.util.Scanner;

public class E21_ArrayElementDelete {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner sc = new Scanner(System.in);

		System.out.print("삭제할 숫자 입력 > ");
		int n = sc.nextInt();
		System.out.println("기존 : "+Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				for (int j = i; j < arr.length - 1; j++) {
					arr[j] = arr[j + 1];
				}
			}
		}

		System.out.println();
		System.out.println("삭제 : "+Arrays.toString(arr));
	}

}
