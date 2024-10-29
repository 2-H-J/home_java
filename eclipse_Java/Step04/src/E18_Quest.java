import java.util.Scanner;

public class E18_Quest {

	public static void main(String[] args) {
/*
		사용자로 부터 나이를 입력 받아서
		입력 받은 나이가 미성년자 인지 성인인지 출력
		단, 나이는 0보다 큰 값을 받아야됨
		0 이하의 값이 들어오면 다시 입력 받게끔 처리
		
		실행 예시 >
				나이 입력(0보다 큰값을 입력하세요) : -5
				-> 나이를 잘못 입력 하셨습니다.
				나이 입력(0보다 큰값을 입력하세요) : 20
				성인 입니다.
*/
		
		Scanner sc = new Scanner(System.in);
		
		int age; // 나이를 입력 받은 변수
		do { // 먼저 실행되는 영역 나이 입력
			System.out.print("나이 입력(0보다 큰값만 입력) : ");
			age = sc.nextInt();
			if(age <= 0)
				System.out.println("나이를 잘못 입력하셨습니다.");
		}while(age <= 0); // 나이가 0보다 적으면 다시 실행
		if(age > 19) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
//		----------------------------------
		
//		do {
//			System.out.print("나이 입력(0보다 큰 값 입력) >> ");
//			age = sc.nextInt();
//			
//			if(age <= 0) {
//				System.out.println("나이를 잘못 입력하셨습니다.");
//			} else {
//				if(age >= 20)
//					System.out.println("성인입니다.");
//				else
//					System.out.println("미성년자입니다.");
//			}
//		} while(age <=  0);
		
		
		
//		System.out.print("나이 입력(0보다 큰값만 입력) : ");
//		age = sc.nextInt();
//		while(age <= 0) {
//			System.out.print("나이 입력(0보다 큰값만 입력) : ");
//			age = sc.nextInt();
//			if(age <= 0)
//				System.out.println("나이를 잘못 입력하셨습니다.");
//		}
//		if(age > 19) {
//			System.out.println("성인");
//		}else {
//			System.out.println("미성년자");
//		}
			
			
		
		
		
	}

}
