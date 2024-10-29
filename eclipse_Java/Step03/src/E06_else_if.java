import java.util.Scanner;

public class E06_else_if {
	/*
	 * 		else if
	 * 			if문으로 구성된 조건문에서 두번째 조건문부터 담당하는 문법
	 * 			
	 * 		if(조건식-1){
	 * 			실행할 코드
	 * 			...
	 * 		}else if(조건식-2){
	 * 			실행할 코드
	 * 			...
	 * 		}else if(조건식-3){
	 * 			실행할 코드
	 * 			...
	 * 		}else{
	 * 			실행할 코드
	 * 			...
	 * 		}
	 * 
		*/
	public static void main(String[] args) {
		/*
		성인 / 고등학생 / 중 / 초
		20세 이상 성인 / 17~19 고 / 14~16중 / 8~13초
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 > ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 17 && age <= 19) {
			System.out.println("고등학생");
		}else if(age >= 14 && age <= 16) {
			System.out.println("중학생");
		}else if(age >= 8 && age <= 13) {
			System.out.println("초등학생");
		}else {
			System.out.println("미취학 아동");
		}
		
		System.out.println("-------------------------");
		
		System.out.println("최소값 기준");
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 17) {
			System.out.println("고등학생");
		}else if(age >= 14) {
			System.out.println("중학생");
		}else if(age >= 8) {
			System.out.println("초등학생");
		}else {
			System.out.println("미취학 아동");
		}
		
		System.out.println("-------------------------");
		
		System.out.println("최대값 기준");
		if(age <= 7) {
			System.out.println("미취학 아동");
		}else if(age <= 13) {
			System.out.println("초딩");
		}else if(age <= 16) {
			System.out.println("중딩");
		}else if(age <= 19) {
			System.out.println("고딩");
		}else {
			System.out.println("성인");
		}
	}

}
