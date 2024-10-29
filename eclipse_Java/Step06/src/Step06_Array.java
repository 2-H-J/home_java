import java.util.Scanner;

public class Step06_Array {

	public static void main(String[] args) {

//		--배열정리--
		
//		-----------------------배열 생성 방법-----------------------
		
//		길이가 5인 정수형 배열을 생성
		int[] arr = new int[5];
		
		System.out.println("--------------------------------------------------------------");
//		-----------------------배열 생성 및 초기화-----------------------
//		배열 생성과 동시에 초기화 하는 방법 -1
		int[] arr1 = {1,2,3,4,5,6,7,8};
		
//		배열 생성과 동시에 초기화 하는 방법 -2
		int[] arr2 = new int[] {10,11,12,13,14};
		
		System.out.println("--------------------------------------------------------------");
//		-----------------------배열에 내용을 입력 / 출력-----------------------
		int[] arr3 =new int[] {1,2,3,4,5}; // 배열에 내용 입력 -1
		System.out.println(arr[0]); // 0번째 인덱스 출력 ....
		for(int i : arr3) { // 배열의 각 요소를 순차적으로 반복합니다.
			System.out.print(i+" ");
		}
		
		
		
		int[] arr5 = new int[5]; // 배열에 내용 입력 -3
		for(int i = 0; i<arr5.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print(i+"번째 배열 숫자 > ");
			arr5[i] = sc.nextInt();
		}
		for (int i = 0; i < arr5.length; i++) { // 입력한 내용 출력
			System.out.print(arr5[i]+" ");
		}
		
		System.out.println("--------------------------------------------------------------");
//		-----------------------총합, 최대값, 최소값-----------------------
		Scanner sc = new Scanner(System.in); // 입력받을 수 있게 Scanner

		int arr6[] = new int[10]; // 정수형 길이가 10인 배열 생성

		int sum = 0; // 총합을 저장한 sum 변수 선언

		int max = 0; // 입력수 중 가장 최대값을 저장할 변수

		int min = arr6[0]; // 입력수 중 가장 최소값을 저장할 변수

//		for(int i = 0; i<arr.length; i++) { // 배열 길이 0 부터 선언한 배열길이 까지 반복 for문
//			System.out.print(i+"번째 값 입력 : "); // 입력 print
//			arr[i] = sc.nextInt(); // 입력 변수
//			sum += arr[i]; // 입력 변수를 통해 입력한 arr[i] 값을 sum에 저장
//		}
//		System.out.println(sum); // sum에 저장한 값을 출력
//
//		System.out.println("--------------------------");

//		배열에 저장된 값들중 총합, 최대값, 최소값 을 출력

		for (int i = 0; i < arr6.length; i++) { // 배열 길이 0 부터 선언한 배열길이 까지 반복 for문
			System.out.print(i + "번째 값 입력 : "); // 입력 print
			arr6[i] = sc.nextInt(); // 입력 변수
		}

		max = arr6[0];

//		총합, 최대값, 최소값
		for (int i = 0; i < arr6.length; i++) {
			sum += arr6[i]; // 입력수 총 합

			if (max < arr6[i]) { // 입력수 중 최대값을 조건으로 걸고 max에 최대값을 넣는다
				max = arr6[i];
			}
			if (min > arr6[i]) { // 입력수 중 최소값을 조건으로 걸고 min에 최소값을 넣는다
				min = arr6[i];
			}
		}
		System.out.println("총합 : " + sum); // sum에 저장한 값을 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}

}
