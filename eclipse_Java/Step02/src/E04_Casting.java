
public class E04_Casting {
	/*
	 * 		데이터 형변환 : 데이터 타입을 바꾸는 행위
	 * 		
	 * 		자동으로 데이터 형변환 : 연산할 때 자동으로 변환
	 * 			- 수의 체계상 작은 개념과 큰 개념이 계산 했을 때
	 * 				--> 실수와 정수가 계산할 때 정수가 실수로 바뀐다(데이터 손실 X)
	 * 			- 메모리 바이트 수가 작은 타입이 큰 타입과 계산 했을 때
	 * 				--> int형과 long이 계산했을 때는 int형이 long으로 변환
	 * 			- short나 byte 타입에 int형으로 데이터를 넣을때 자동으로 형변환
	 * 
	 * 		강제로 데이터 형변환 : 데이터 손실이 일어날 수 있음
	 * 			- 큰 개념을 작은 개념으로 바꿔야 될때 --> 실수 -> 정수
	 * 			- 메모리 바이트 수가 큰 타입을 작은 타입으로 바꿔야 될때 --> double -> float
	 * 		
	 * 	*/
	public static void main(String[] args) {
		//자동으로 형변환 되는 경우
		int n = 120;
		double d = 3.12;
		System.out.println(n / d);
		d = n;
		System.out.println(d);
		
		short s = 100;//byte와 short는 int 형에서 자동으로 형변환 되서 저장
		System.out.println(s);
		
		long l = 100l;
		System.out.println(l - s);
		
		System.out.println('A' + 1);
		
		//강제로 형변환 하는 방법 ---> (바꾸고 싶은 변수 타입) 값 or 변수
		double pi = 3.1415;
		int i = (int)pi;
		System.out.println(i);
		
		i = 65;
		char c2 = (char)i;
		System.out.println(c2);
	}

}







