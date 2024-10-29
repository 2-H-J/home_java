import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {

				/*
				 * 정수형 배열 길이가 10인 배열을 생성한 후에 정수를 입력 받아서 
				 * 배열의 각 요소에 전부 저장한 후에 배열에 저장된 값의 총합을 출력.
				 */
				Scanner sc = new Scanner(System.in); // 입력받을 수 있게 Scanner

				int arr[] = new int[10]; // 정수형 길이가 10인 배열 생성

				int sum = 0; // 총합을 저장한 sum 변수 선언

				int max = 0; // 입력수 중 가장 최대값을 저장할 변수

				int min = 0; // 입력수 중 가장 최소값을 저장할 변수

//				for(int i = 0; i<arr.length; i++) { // 배열 길이 0 부터 선언한 배열길이 까지 반복 for문
//					System.out.print(i+"번째 값 입력 : "); // 입력 print
//					arr[i] = sc.nextInt(); // 입력 변수
//					sum += arr[i]; // 입력 변수를 통해 입력한 arr[i] 값을 sum에 저장
//				}
//				System.out.println(sum); // sum에 저장한 값을 출력
		//
//				System.out.println("--------------------------");

//				배열에 저장된 값들중 총합, 최대값, 최소값 을 출력

				for (int i = 0; i < arr.length; i++) { // 배열 길이 0 부터 선언한 배열길이 까지 반복 for문
					System.out.print(i + "번째 값 입력 : "); // 입력 print
					arr[i] = sc.nextInt(); // 입력 변수
				}

				max = arr[0];
				min = arr[0];

//				총합, 최대값, 최소값
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i]; // 입력수 총 합

					max = Math.max(max, arr[i]); // 입력수 최대값

					min = Math.min(min, arr[i]); // 입력수 최소값
					
				}
				System.out.println("총합 : " + sum); // sum에 저장한 값을 출력
				System.out.println("최대값 : " + max);
				System.out.println("최소값 : " + min);

//				ArrayList<String> list = new ArrayList<String>();
//				
//				list.add("Hi1"); // 단어 추가
//				list.add("Hi2");
//				list.add("Hi3");
//				
//				System.out.println(list);
//				System.out.println(list.size());
//				
//				list.remove("Hi2"); // 특정 단어 지우기
//				System.out.println(list);
//				System.out.println(list.size());
			
		

	}

}
