import java.util.Scanner;

public class E01_if {
	/*
	 * 분기문(if, switch)
		조건식의 결과와, 데이터 값에 따라서
		작업할 코드를 상황에 따라서 동작하게끔 처리
	 * 
		if문
			조건식 true면 if문에 붙어있는 { 실행 영역 }에 있는 코드를 실행
			조건식이 false면 해당 if{}문을 건너뜀
			
		조건식 : 관계연산자와 논리연산자를 이용한 수식, 결과는 true / false로 나옴
		
		if(조건식){
			실행할 코드
			...
			...
			...
		}
		
		if문의 구성요소는 if, else if, else 가 있다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 > ");
		int test = sc.nextInt();
		
		if(test < 0) {
			System.out.println("음수 입니다.");
		}else if(test > 0) {
			System.out.println("양수 입니다.");
		}else{
			System.out.println("0 입니다.");
		}
		System.out.println("프로그램 종료");

		System.out.println("-----------------------------");
		
		int n = 0;
		
		if(n < 0) {
			System.out.println("음수 입니다.");
		}
		if(n > 0) {
			System.out.println("양수 입니다.");
		}
		if(n == 0) {
			System.out.println("0 입니다");
		}
		System.out.println("프로그램 종료");
		
		
	}

}
