import java.util.Arrays;
import java.util.Scanner;

public class E22_Quest {

	public static void main(String[] args) {
		/*	-풀이-
		 * 	최초의 정수형 배열은 길이가 5인 배열을 생성
		 * 	배열에 숫자를 순서대로 입력해 나가면서
		 * 	-1을 입력할때까지 계속해서 배열에 숫자를 입력
		 * 	단, 배열에 내용이 전부채워지면 그때마다 배열의 길이를 3씩늘림,
		 * 	배열에 숫자 입력이 끝나면 입력된 내용을 전부 출력
		 * 	배열에 입력된 숫자들의 평균을 출력
		 * 	단, 마지막에 입력된 -1은 제외하고 평균을 구하기
		*/
		
		int[] arr = new int[5]; // 배열 5길이로 선언

		Scanner sc = new Scanner(System.in);

		int i = 0; // 인덱스 변수 선언

		while (true) { // -1을 입력 해서 종료를 하기 전까진 무한으로 돌기 때문에 조건을 그냥 true
			System.out.print("숫자 입력 (-1을 입력시 종료) > "); 
			arr[i] = sc.nextInt(); // 입력수 배열에 저장 하는 스캐너

			System.out.println(Arrays.toString(arr)); // 배열에 입력되는 숫자 확인 프린트

			if (arr[i] == -1) break; // 배열에 -1이 들어가면 반복문 종료

			i++; // 종료 되지 않는 동안 입력수를 반복

			if (i == arr.length) { // 입력 개수가 인덱스 길이랑 같으면 진행
				// 1. 임시 배열
				int[] temp = new int[arr.length + 3];
				// 2. 배열 내용 복사
				System.arraycopy(arr, 0, temp, 0, arr.length);
				// 3. 배열 연결
				arr = temp;
			}
		}
		
		int sum = 0; // 총합 변수
		for(int j = 0; j < i; j++) { 
			sum += arr[j]; // 입력수를 차례로 더하기
		}
		
		System.out.println((double)sum / i);
	}

}
