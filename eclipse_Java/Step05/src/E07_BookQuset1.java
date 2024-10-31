import java.util.Scanner;

public class E07_BookQuset1 {

	public static void main(String[] args) {
		/*
		 	Q1.
		    책 문제 123페이지
			operator 값이 +, -, *, / 인 경우에 사칙연산을 수행하는 프로그램을
			if-else문과 switch-case문을 사용해 작성
			 
			 int num1 = 10;
			 int num2 = 2;
			 char operator = '+';
		*/
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		System.out.println("if-else");
//		if-else 문
		
		
		
		if(operator == '+') {
			result = num1 + num2;
			System.out.println("더하기 값 : "+result);
		}else if(operator == '-') {
			result = num1 - num2;
			System.out.println("빼기 값 : "+result);
		}else if(operator == '*') {
			result = num1 * num2;
			System.out.println("곱하기 값 : "+result);
		}else if(operator == '/'){
			result = num1 / num2;
			System.out.println("나누기 값 : "+result);
		}else {
			System.out.println("잘못 입력");
		}
		
		System.out.println("switch-case");
//		switch-case 문
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println("더하기 값 : "+result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("빼기 값 : "+result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("곱하기 값 : "+result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("나누기 값 : "+result);
			break;
		default :
			System.out.println("잘못 입력");
		}
		
	}

}
