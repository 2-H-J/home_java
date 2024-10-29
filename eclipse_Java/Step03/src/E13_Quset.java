import java.util.Scanner;

public class E13_Quset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력 > ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "년은 윤년 입니다.");
			
		}else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
		if(year % 4 == 0 && year % 100 != 0) {
			
		}

	
	}

}
