
public class E01_Variable {

	public static void main(String[] args) {
		/*
		 * 변수(Variable) : 데이터를 하나 저장할 공간
		 * 
		 * 변수 선언 방법
		 * 		변수타입 변수명;
		 * 		int num;
		 * 
		 * 		int num = 100; 선언과 동시 초기화
		 * 
		 * 데이터(타입) 형태
		 * 		정수 : 양수, 음수, 0
		 * 		실수 : 정수에서 소수점이 추가된 형태
		 * 		문자 : 한 글자
		 * 		논리 : 참(true), 거짓(false)
		 * 		
		 * 		문자열 : 문자가 한개이상 구성된 형태
		*/
		
//		변수 선언 방법 -1
		int num; // 변수 선언 : num이라는 변수명으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
		num = 100; // 변수 초기화 : 정수 100을 변수 num에 저장(대입) 한다.
		System.out.println(num); // num이 저장하고 있는 100을 읽어와서 화면에 출력
//		그냥 선언된 변수와 데이터값은 사용 되고 나면 끝.
		
		num = 200; // 기존 100을 덮어 200으로 다시 초기화 - 맨 마지막 데이터 값을 저장
		System.out.println(num);
		
//		변수 선언 방법 -2
		int a = 10; // 변수 선언과 동시에 초기화(initialize) : 변수를 선언한 뒤 처음 저장하는 행위
		System.out.println(a);
		
//		변수 선언 방법 -3
//		동일한 변수타입의 변수를 만드는 경우 동시 선언 초기화
		int n1 = 10, n2 = 20;
		System.out.println(n1+n2);
		System.out.println(n1+" "+n2);
		
//		정수형 변수 3개 선언
		int num1, num2, num3;
//		num1, num2, num3를 전부 동일한 값 0으로 초기화
		num1 = num2 = num3 = 0; // num3에 0을 대입 -> num3을 num2에 대입 -> ...
		
		System.out.println(num1 +" "+ num2 +" "+ num3);
		
		
		
	}

}
