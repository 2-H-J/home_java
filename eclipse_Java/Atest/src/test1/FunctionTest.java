package test1;

public class FunctionTest {
	
	// 함수 구현하고 호출
	public static int add1(int n1, int n2) { // public static 반환값(int) 메서드명(add)(매개변수 타입(int) 매개변수명(n1),....){실행 코드.... }
												// 반환값이 없으면 void 라고 작성
		int result = n1 + n2; // result 에 매개변수 n1,n2의 값을  더해 넣고
		return result; // result를 반환 해주는 return
	} 
	// 매개변수 int n1, int n2는 다른 함수에서 사용하여도 다른 메모리 공간을 사용하는 거라 이름이 같아도 상관없음 
	// 함수 내부에서만 사용하는 변수 n1,n2 이걸 지역변수라 함
	// 지역변수는 스택(stack)메모리에 생성됨
	
// Q1. 사칙연산 함수 구현하고 결과 값 출력
	public static int add2(int n1, int n2) { // 마이너스 
		int result = n1 - n2;
		return result;
	}
	
	public static int add3(int n1, int n2) { // 곱셈
		int result = n1 * n2;
		return result;
	}
	
	public static int add4(int n1, int n2) { // 나눗셈
		int result = n1 / n2;
		return result;
	}
	
	public static int add5(int n1, int n2) { // 나머지
		int result = n1 % n2;
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum1 = add1(num1,num2); // add1(num1, num2)을 함수 구현하는 곳 add1(n1, n2)으로 받는다 -> sum에 반환받은 result 값을 받는다  
		int sum2 = add2(num1,num2);
		int sum3 = add3(num1,num2);
		int sum4 = add4(num1,num2);
		int sum5 = add5(num1,num2);
		System.out.println("플러스"+sum1);
		System.out.println("마이너스"+sum2);
		System.out.println("곱셈"+sum3);
		System.out.println("나누기"+sum4);
		System.out.println("나머지"+sum5);
	}
	/*
	 * 함수 호출과 스택 메모리
	 * 함수를 호출하면 그 함수만을 위한 메모리 공간이 할당 : 스택(stack)이라고 함
	 * 프로그램 시작하면 main() 함수부터 호출하기 때문에 가장먼저 main함수에 포함된 변수 num1, num2, sum을 저장할 메모리 공간이 생성
	 * 그리고 main함수에서 add함수를 호출하면 add함수를 저장할 메모리 공간이 스택(stack)에 새롭게 생성 그 후,
	 * add 함수 수행이 끝나면 할당 했던 메모리 공간을 해제(자동으로 사라짐)
	 * 
	 * 프로그램에서 여러 함수를 사용했을 경우 함수를 호출한 순서대로 메모리 공간을 만들고 맨 마지막 함수 메모리 공간부터 반환
	 * 예) 함수 A() -> B() -> C() 순서대로 호출 후, C() -> B() -> A() 순서로 반환되며 스택 메모리도 이 순서대로 소멸
	 * 
	*/
	
	
}