import java.util.Scanner;

public class Step03_StringEqualsEx {

	public static void main(String[] args) {
		/*
			1.	삼항연산자는 간단한 if문 코드를 간결하게 가독성을 높일 때 사용한다. 
			2.	삼항연산자의 형식 = ( 조건문 )  ?  값 or 연산식   :   값 or 연산식 ; 
    			※ 조건문이 참일 때는 콜론(:) 기준으로 앞에 오는 값, 거짓일 때는 뒤에 오는 값 저장
    		
    			if 조건문을 간결하게 줄이고 싶을 때는 삼항연산자 사용하기!
				단, 무분별한 삼항연산자 사용은 가독성을 저하시킬 수 있다!
		*/
		
//		if문 적용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 값 :");
		int se1 = sc.nextInt();
		System.out.print("두번째 값 :");
		int se2 = sc.nextInt();
		
		
		if(se1 > se2) {
			System.out.println("첫번째 값이 두번째 값 보다 큼");
		}else {
			System.out.println("두번째 값이 첫번째 값 보다 큼");
		}
		
		System.out.println("---------------------------------------------------------");
		
		//		삼항 연산자 적용
		
		String result = (se1 > se2) ? "첫번째 값이 큽니다" : "두번째 값이 큽니다";
		System.out.println(result);
		
		System.out.println("---------------------------------------------------------");
		
		
//		ChatGPT 문제_1
//		int num = -5;
//		String result = (num > 0) ? "Positive" : (num == 0) ? "Zero" : "Negative";
//		System.out.println("The number is: " + result);
//		문제: 위 코드에서 num 변수의 값을 변경하여 result에 "Zero"가 출력되도록 코드를 수정하세요.
		
		int num = 0;
		String result1 = (num > 0) ? "Positive" : (num == 0) ? "Zero" : "Negative";
		System.out.println("The numer is : " + result1);
		
		System.out.println("---------------------------------------------------------");
		
//		ChatGPT 문제_2
//		int age = 17;
//		String category = (age >= 18) ? "Adult" : "Minor";
//		System.out.println("You are classified as: " + category);
//		문제: 위 코드에서 age 변수를 활용하여 category가 "Adult"로 출력되도록 하세요. 
//		age 값을 변경한 후, 결과를 확인하세요.
		
		int age = 17;
		String category = (age+1 >= 18) ? "Adult" : "Minor";
		System.out.println("You are classified as: " + category);
		
		System.out.println("---------------------------------------------------------");
		
//		ChatGPT 문제_3
//		int x = 15;
//		int y = 30;
//		int z = 25;
//
//		String result2 = (x > y) ? ((x > z) ? "x is the largest" : "z is the largest") 
//		                        : ((y > z) ? "y is the largest" : "z is the largest");
//
//		System.out.println(result2);
//		문제: 위 코드에서 x, y, z 변수의 값을 변경하여 result2에 "z is the largest"가 출력되도록 하세요. 
//		변경한 후, 삼항 연산자가 올바르게 가장 큰 값을 비교하는지 확인하세요.
		int x = 15;
		int y = 20;
		int z = 25;

		String result2 = (x > y) ?  // x가 y보다 크면 ((x > z)비교 작으면 ((y > z) 비교 : 작으니 y로
				((x > z) ? "x is the largest" : "z is the largest") : 
					// x가 z보다 크면 "x is the largest" 출력, 작으면 "z is the largest"
					((y > z) ? "y is the largest" : "z is the largest");
		System.out.println(result2);
		
		
		
		
		
	}

}
