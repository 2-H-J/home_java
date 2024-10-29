package e03_wrapper;

public class WrapperClass {
	/*
	 * 	Wrapper 클래스는 기존의 primitive 변수 타입을
	 * 	reference 형 타입으로 바꿀때 사용되는 클래스
	 * 	각 타입에 대한 기능과 정보를 담고 있음
	 * 
	 *  Primitive			Wrapper
	 *  
	 *  int		----------> Integer 
	 *  double  ----------> Double
	 *  float	----------> Float
	 *  boolean	----------> Boolean
	 *  char	----------> Character
	 *  short	----------> Short 
	 *  byte	----------> Byte
	 *  long	---------->	Long
	 * 
	 */
	public static void main(String[] args) {
		//Wrapper 클래스도 일반 변수 선언해서 사용하듯 사용하면 됨
		Integer n1 = 100;
		int n2 = 30; 
		Integer n3 = new Integer(5);
		System.out.println(n1);
		System.out.println(n3);
		System.out.println(n1 * n2 * n3);
		System.out.println("------------------------------------1");
		
		//int 형 타입의 최대값, 최소값, 바이트수, 사이즈 -> 비트수 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println("------------------------------------2");
		
		//문자열을 해당 타입의 값으로 변환
		System.out.println(Integer.parseInt("1234") * 2);//--
		System.out.println(Double.parseDouble("3.1415") * 2);//--
		System.out.println(Integer.toHexString(65));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toBinaryString(10));
		System.out.println("------------------------------------3");
		
		//16진수 표현 방법 - 0x 로 시작 
		System.out.println(0xA);//10
		//8진수 표현 방법 - 0 로 시작
		System.out.println(012);//10
		System.out.println("------------------------------------4");
		
		int i1 = 100;
		//auto boxing
		Integer i2 = i1;
		//auto unboxing
		int i3 = i2;
		
		System.out.println(i3);
		System.out.println("------------------------------------5");
		
		//1.5이전 버전에서의 boxing, unboxing
		int i4 = 100;
		//boxing
		Integer i5 = new Integer(i4);
		//unboxing
		int i6 = i5.intValue();
		System.out.println(i6);
		//--------------
		Object o1 = new Integer(10);
		int i7 = ((Integer)o1).intValue();
		System.out.println(i7);
		
	}

}














