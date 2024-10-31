import java.util.Scanner;

public class E01_LoopInput {

	public static void main(String[] args) {
		/*
		 * 반복문으로 원하는 만큼 데이터 입력을 받은 후 수행한 작업 결과를 출력하는 코드 작성
		 * 
		 * 숫자를 5번 입력 받아서 입력 받은 숫자들의 총합을 출력
		 */

		Scanner sc = new Scanner(System.in);

		int sum = 0; // 입력받는 숫자 총합 저장할 변수

		for (int i = 0; i < 5; i++) { // 0번 부터 5번까지 반복
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt(); // n 변수 새로 선언 하면서 스캐너 입력 등록
			sum += n; // sum에 n입력값 넣기
		}
		System.out.println(sum); // 출력

		int sum1 = 0;
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) { // 0부터 선언한 배열 arr의 길이 5까지 반복
			System.out.print("숫자 입력 > ");
			int num = sc.nextInt();
			sum1 += num;
		}
		System.out.println(sum1);
	}

}
