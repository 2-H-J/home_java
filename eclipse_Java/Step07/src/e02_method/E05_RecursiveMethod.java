package e02_method;

public class E05_RecursiveMethod {
	// 재귀함수?
	// 매개변수로 숫자 하나 받아서 해당 숫자의 팩토리얼 값을 리턴하는 메서드
	public static int fac(int n) {
//		int result = 1;
//		for(int i = 1; i <= n; i++) {
//			result *= i;
//		}
//		return result;
		if(n == 1) {
			return 1;
		}
		return n * fac(n-1); 
		//	예시 5를 입력했다하면 = 5 * fac(4) -> 4 * fac(3) -> 3 * fac(2) -> .....
		//	위 같이 하면 java.lang.StackOverflowError 발생 :  스택메모리 초과 에러
		//	그럴 때는 아래와 같이 멈추는 조건을 달아주어야 한다.
		//	if(n == 1) {
		//	return 1;
		//	}
	}
	
	// 매개변수로 숫자 하나를 받아서 숫자에 해당하는 2의 n승 값을 리턴하는 메서드
	// 매개변수로 값이 6 --> 리턴할 값 64 (2의 6승 값 리턴)
	public static int power(int n) {
		if(n == 0) {
			return 1;
		}
		return 2 * power(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fac(10));
		System.out.println(power(10));

	}

}
