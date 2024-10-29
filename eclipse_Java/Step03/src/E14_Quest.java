import java.util.Scanner;

public class E14_Quest {

	public static void main(String[] args) {
		
		
//		 * Q2. 사용자로부터 점수를 하나 입력 받은 후
//			입력받은 점수의 등급을 출력
//			90~100 : A , 80~89 : B , 70~79 : C , 60~69 : D , 나머지 F
//			if 와 switch 두가지로 각각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();
		
		
		if(0 <= score && score <= 100) { // 점수 입력 범위 지정
			if(score >= 90) {
				System.out.println("A");
			}else if(score >= 80) {
				System.out.println("B");
			}else if(score >= 70) {
				System.out.println("C");
			}else if(score >= 60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}else{
			System.out.println("0~100");
		}
		
			
			System.out.println("----------------------");
		switch (score / 10) {
		case 10: case 9 :
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}
		
		
	}

}
