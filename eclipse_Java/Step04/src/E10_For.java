
public class E10_For {

	public static void main(String[] args) {
		
		int i=1;// 선언 초기화가 for 에서 빠져도 된다. 다만 영역 구분 ;은 필수
		for(; i<=10;) { // 조건식이 빠지면 무한 실행
			System.out.println(i++); // 증감식은 실행칸에 넣어도 된다.
		}
		
	}

}
