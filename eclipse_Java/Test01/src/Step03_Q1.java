import java.util.Scanner;

public class Step03_Q1 {

	public static void main(String[] args) {
		/*
			Q1. 사용자로부터 연도를 입력 받음
				입력받은 연도가 윤년인지 아닌지 출력
				
				4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
				100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
				
		*/
		
//		if문
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			System.out.println(year+"년 : 윤년");
		}else {
			System.out.println(year+"년 : 평년");
		}
		
		
		
	}

}
