
public class E14_Operator {
	/*
	 * 		논리 연산자 : 조건식들을 두개 이상 사용하거나, 조건식의 결과를 반대로 뒤집을때
	 * 		AND : 양쪽의 조건식이 모두 true 일때 true가 되는 연산자 --> &&
	 * 		OR : 양쪽의 조건식 중 하나라도 true면 true가 되는 연산자 --> ||
	 * 		NOT : 조건식의 결과를 반대로 뒤집는 연산 --> !
	 */
	public static void main(String[] args) {
		int n1 = 5, n2 = 6;
		
		//n1이 5보다 크고, 20보다 작냐?
//		System.out.println(5 < n1 < 20);
		System.out.println(n1 > 5 && n1 < 20);
		//n2가 양수이면서, n2가 짝수냐?
		System.out.println(n2 > 0 && n2 % 2 == 0);
		//n1이 5보다 크거나, n2가 10이냐?
		System.out.println(n1 > 5 || n2 == 10);
		//n1이 짝수 이거나, n2가 5보다 크고 10보다 작냐?
		boolean result = n1 % 2 == 0 || (n2 > 5 && n2 < 10);
		System.out.println(result);
		
		System.out.println(!result);		
		
	}
}





