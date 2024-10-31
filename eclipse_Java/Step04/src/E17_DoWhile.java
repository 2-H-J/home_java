
public class E17_DoWhile {

	public static void main(String[] args) {
/*
		do-while
		무조건 한번은 실행후 조건 비교 반복 하는 반복문
*/
		int i = 0;
		do { // do { } 먼저 한번은 실행 할 영역 
			System.out.println("Hello World");
			i++;
		}while(i < 5); // while( ) 조건 보고 다시 do로 갈지 말지
	}

}
