import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {

		/*
		 * 양수 하나를 입력 받아서
		 * 
		 * 1부터 입력받은 숫자까지의 합을 출력
		 * 
		 * 숫자입력 : 10
		 * 
		 * 1 ~ 10 까지 합 : 55
		 */
//		입력 메서드 
		Scanner sc = new Scanner(System.in);
		
//		1. 변수 선언 : 1부터 시작하는 변수 - int , 입력한 숫자 - int, 총합 - int
		int i = 0; // 입력할 숫자 변수
		int n = 0; // 기본 시작 변수
		int sum = 0; // 숫자 합 변수
		
//		2. 숫자 입력
		System.out.print("숫자 입력 > ");
		i = sc.nextInt(); // 숫자 입력 변수
		
//		3. 반복문 : 1 ~ 입력한 숫자 까지
		while (n < i) {
			n++; // 입력한 수 만큼 증가
			System.out.println(n); // 입력 수 증가 확인
			
//		4. 총합에다가 1 ~ 입력한 숫자 더해서 저장(누적)
			sum += n; // 증가분 만큼 +

		}
//		5. 반복이 끝나면 결과 출력
		System.out.println("입력한 수 총 합 : " + sum);
		
		
//		System.out.println("변수 두개------------------");
		
//		while(i > 0) {
//			
//			sum += i;
//		}
//		System.out.println(sum);
		
	}

}
