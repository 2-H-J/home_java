
public class E10_Operator {
	/*
	 * 	복합 대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 		+=	-=	*=	/=	%=
	 */
	public static void main(String[] args) {
		int n = 10;
		
		n += 4;
		System.out.println(n);
		n -= 6;
		System.out.println(n);
		n *= 2;
		System.out.println(n);
		n /= 3;
		System.out.println(n);
		n %= 6;
		System.out.println(n);

		//-------
		String address = "서울시 ";
		//address = address + "영등포구 "
		address += "영등포구 ";
		address += "당산동 ";
		address += "당산 빌딩 11층";
		
		System.out.println(address);
	}

}









