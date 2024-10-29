
public class PrintMain {

	public static void main(String[] args) {
		
		System.out.println(10);
		System.out.println(10+5);
		System.out.println(10-5);
//		숫자
		
		System.out.println("Hello");
		System.out.println("Hello" + "World");
		System.out.println("Hello"+10);
//		문자열
		
		System.out.println("안녕하세요" + 8282 + 1000 + "갑시다." + 1234 + 1000);
//		안녕하세요82821000갑시다.12341000
//		문자열 + 숫자 : 문자열로 인식
		
		System.out.println("안녕하세요" + (8282 + 1000) + "갑시다." + (1234 + 1000));
//		안녕하세요9282갑시다.2234
		
		System.out.println("------------------------------------------------------------");
		
		System.out.print("Hello");
		System.out.print("World"); // 자동엔터 x 한줄로 출력 : print
		System.out.print("\n Hello \n"); // \n : 줄바꿈
		System.out.print("World \n");
		
		System.out.println("------------------------------------------------------------");
		
		System.out.printf("안녕하세요 %d %d \n",8282,1000);
//		%d : 중간 중간 넣는 특수문자  / 첫번째 %d : 8282 / 두번째 %d : 1000 / , : 구간 구분
		
		
		
	}

}
