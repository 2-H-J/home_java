package e02_method;

import java.util.Scanner;

public class E02_SortArray {
	// 출력---------------------------------------------------------------------------------------------
	static void printArray(int pass, int[] arr) { 
		System.out.print(pass + "pass	: ");
		
		for(int n : arr)
			System.out.printf("%3d ", n);
		System.out.println();
	}
	
	//버블정렬------------------------------------------------------------------------------------------
//	static void buble(int[] arr) { // 배열
//		// 버블정렬
//		// 정렬을 개수 - 1 번 만큼 수행
//		// 앞뒤로 비교하면서 정렬을 수행
//		// 오름차순이기 때문에 맨 앞에서 부터 앞뒤로 값을 비교했을 때 큰 값을 뒤로 보낸다.
//		// 정렬 한번씩 수행했을때 배열의 내용을 출력해서 정렬 과정도 체크
//		/*
//		 * 오름차순
//		 * 정렬이 뒤에서 부터 진행
//		 * 개수 - 1 
//		 * 들어가 있는 값에 따라 중간에 완료 될 수 도있다.
//		*/
//		for (int i = 0; i < arr.length - 1; i++) {
//			
//			// 앞뒤로 비교하면서 정렬을 수행
//			for (int j = 0; j < arr.length - 1 - i; j++) { // - i 앞뒤로만 비교하여 정렬 하기 위해
//			// 오름차순이기 때문에 앞뒤로 값을 비교했을 때 큰 값을 뒤로 보낸다.
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//			// 정렬 한번씩 수행했을때 배열의 내용을 출력해서 정렬 과정도 체크
//			printArray(i + 1, arr);
//		}
//	}
	
	//선택정렬------------------------------------------------------------------------------------------
//	static void select(int[] arr) {
//		// 선택정렬
//		// 정렬을 (배열 길이 - 1) 번 만큼 수행
//		// 기준 인덱스 0 ~ 배열길이 - 1
//		// 제일 작은 값이 있는 인덱스 저장할 변수 선언 초기화는 기준 인덱스
//		// 기준 인덱스에는 제일 작은 값이 있는 인덱스 번호를 저장
//		// 제일 작은 값이 있는 인덱스와 기준 인덱스 값과 교환
//		// int[] arr1 = { 8, 4, 6, 9, 7, 1 };
//		
//		// 앞뒤로 비교하면서 정렬을 수행
//		
//		// 정렬을 (배열 길이 - 1) 번 만큼 수행
//		// 기준 인덱스 0 ~ 배열길이 - 1
//		for (int i = 0; i < arr.length - 1; i++) {
//			
//			// 비교할 인덱스 번호
//			// 제일 작은 값이 있는 인덱스 저장할 변수 선언 초기화는 기준 인덱스
//			int idx = i;
//			for (int j = i+1; j < arr.length; j++) { 
//				// 제일 작은 값이 있는 인덱스 번호를 저장
//				if(arr[idx] > arr[j]) {
//					idx = j;
//					
//				}
//				
//			}
//			// 제일 작은 값이 있는 인덱스와 기준 인덱스 값과 교화
//			int temp = arr[i];
//			arr[i] = arr[idx];
//			arr[idx] = temp;
//			
//			// 배열 내용 출력
//			printArray(i + 1, arr);
//			
//		}
//	}
	
	// ----------------------------------------------------------------------------------------
	static void insert() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			// 1. 배열에 숫자 입력
				System.out.print("숫자 입력 > ");
				arr[i] = sc.nextInt();
//			// 2. 정렬
				for(int j = i; j > 0; j--) {
					if(arr[j] < arr[j - 1]) {
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
				}
			// 3. 배열 출력
				printArray(i + 1, arr);
		}
	}
	
//	

	public static void main(String[] args) {
//		int[] arr1 = { 8, 4, 6, 9, 7, 1 };
//		int[] arr2 = {42,253,325,67,53,42,1234,67,53,33,5,8,3};
//		int[] arr3 = {5,8,45,23,64,15,78,53};
////		buble(arr1);
//		System.out.println("-----------------------------------------");
//		buble(arr2);
//		System.out.println("-----------------------------------------");
//		select(arr1);
//		System.out.println("-----------------------------------------");
//		select(arr3);
		System.out.println("-----------------------------------------");
		insert();
		
	}
}
