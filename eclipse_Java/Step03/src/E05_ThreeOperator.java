import java.util.Scanner;

public class E05_ThreeOperator {
	/*
			삼항 연산자
			
				조건식이 true / false 일때 실행할 연산을 구분해주는 연산자
				
			조건식 ? 참일때 실행할 연산 : 거짓일때 실행할 연산
*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		int n1 = 20, n2 = 5;
		
		int result = n1 > n2 ? n1 : n2; // true일때 : 왼쪽  false일때 : 오른쪽
		System.out.println(result);
		
		result = n1 < n2 ? n1 : n2;
		System.out.println(result);
		
		System.out.println("--------------------------");
		
		System.out.print("나이 입력 > ");
		int age = sc.nextInt();
		
		String msg = age >= 20 ? "성인" : "미성년자";
		System.out.println(msg);
		
		String msg1 = age <= 19 ? "성인" : "미성년자";
		System.out.println(msg1);
		
		
		
		
	}
}
