import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Step06_Plus_Quset {

	public static void main(String[] args) {
		/*
		 * 문제 1: 최대값 찾기 사용자로부터 5개의 정수를 입력받아 가장 큰 수를 출력하는 프로그램을 작성하세요.
		 */
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		int max = 0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i+"번째 숫자 입력 : ");
//			arr[i] = sc.nextInt();
//			if(arr[i] > max) {
//				max = arr[i];
//			}	
//		}
//		System.out.println(max);

		/*
		 * 문제 2: 배열 요소 합계 사용자로부터 10개의 정수를 입력받아 배열에 저장한 후, 
		 * 배열의 모든 요소의 합계를 출력하는 프로그램을 작성하세요.
		 */
//		int[] arr = new int[10];
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(i+"번째 숫자 입력 : ");
//			arr[i] = sc.nextInt();
//			sum += arr[i]; 
//		}
//		System.out.println(sum);

		/*
		 * 문제 3: 짝수와 홀수 개수 세기 사용자로부터 10개의 정수를 입력받아 배열에 저장한 후, 
		 * 짝수와 홀수의 개수를 각각 출력하는 프로그램을 작성하세요.
		 */
//		int[] arr = new int[10];
//		int j = 0;
//		int h = 0;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(i+"번째 숫자 입력 : ");
//			arr[i] = sc.nextInt();
//			if(arr[i]%2==0 && arr[i]!=0) {
//				j++;
//			}
//			if(arr[i]%2==1) {
//				h++;
//			}
//		}
//		System.out.println("짝수 개수 : "+j);
//		System.out.println("홀수 개수 : "+h);
		/*
		 * 문제 4: 배열 요소 역순 출력 사용자로부터 5개의 정수를 입력받아 배열에 저장한 후, 
		 * 배열의 요소를 역순으로 출력하는 프로그램을 작성하세요.
		*/
		int[] arr = new int[5];
		int value = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
		
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
