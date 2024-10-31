import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반지름 데이터 한개를 입력 받아서
		//입력 받은 반지름에 해당하는 원넓이를 출력
		//1. 반지름 입력
		System.out.print("반지름 입력 > ");
		int r = sc.nextInt();
		//2. 원넓이 계산
		double area = r * r * 3.1415;
		
		//3. 결과 출력
		System.out.println("원넓이 : " + area);
		
		
	}

}
