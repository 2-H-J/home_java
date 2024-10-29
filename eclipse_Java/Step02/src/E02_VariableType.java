
public class E02_VariableType {

	public static void main(String[] args) {
		
		/*
		 * 	변수 타입
		 * 		정수형 : byte, short, int, long
		 * 			byte : 1byte = 8bit 2의8승 / byte : -128 ~ 0 ~ 127
		 * 			short : 2byte = 16bit ..
		 * 			int : 4byte = 32bit ..
		 * 			long : 8byte = 64bit ..
		 * 
		 * 			bit : 0과1을 저장하는 공간 
		 * 
		 * 		실수형 : float, double
		 * 			float : 4byte
		 * 			double : 8byte
		 * 
		 * 		문자형 : char
		 * 			char : 2byte
		 * 
		 * 		논리형 : boolean
		 * 			boolean : 1byte
		*/
		byte b = 127;
		System.out.println(b);
		
		short s = 32767;
		System.out.println(s);
		
		int i = 2147483647; // The literal 2147483648 of type int is out of range 
		System.out.println(i);
		
		long l = 9223372036854775807L;
		System.out.println(l);
		
		b += 1; // 비트단위가 변경 맨 앞 부호비트가 바뀐다
		System.out.println(b);
		
		System.out.println();
	}

}
