import java.util.Scanner;

public class E02_Quest {

	public static void main(String[] args) {
	/*
		숫자를 0 입력 할때까지 숫자 입력을 받는 반복문
		반복문이 끝나면 입력받은 숫자들의 합을 출력
	*/
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum = 0; // 총합
		int n; // 0 또한 총개수에 포함되기 때문에 평균을 구할때 count에 -1이 포함되어야 한다.
		int count = 0;
//		int count = -1; 이렇게 선언 해도되고 아래에서 한번 마이너스 해도 된다.
//		0을 입력할때까지 반복
		
//		do-while문
		do {
			System.out.print("숫자 입력 (0입력시 종료) > ");
			n = sc.nextInt(); // 숫자 입력
			sum += n; // 입력수 저장
			count++;
		}while(n != 0);
//		--count;
		System.out.println("입력한 모든 수 총합 : " +(double)sum);
		System.out.println("입력한 모든 수 평균 : " +(double)sum / --count);

//		-----------------------------------------------------------------------------------
		
//		while(n != 0) {
//			System.out.print("숫자 입력 (0입력시 종료) > ");
//			n = sc.nextInt(); // 숫자 입력
//			sum += n; // 입력수 저장
//		}
//		System.out.println("입력한 모든 수 총합 : " +sum);
		
	}

}
