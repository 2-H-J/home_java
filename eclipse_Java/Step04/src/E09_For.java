
public class E09_For {

	public static void main(String[] args) {
		/*
			for(초기화; 조건식; 증감식){ // for문 안 ;(새미콜론)은 영역 구분 필수
				실행할 코드...;
				실행할 코드...;
				실행할 코드...;
			}
			
		*/
		
		int i;
		for(i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		
		System.out.println(i); // 지역변수는 for( )안에서만 사용 가능하지만 따로 변수 int i를 선언해서 나온다
		
		System.out.println("---------------------");
//		for(int i = 0; i < 5; i++) -> ()안 선언하는 변수 : 지역변수라고 하고 main { }안에서만 쓸 수 있다.
//															main { }이 끝나면 지역 변수 데이터는 사라진다
		
		for(int j = 0; j < 5; j++) {
			System.out.println("안녕하세요");
		}
//		j는 for문에서 사용하기 위해 선언을 한 변수 이기때문에 for문이 끝나면 사라짐 : 지역변수(Local Variable)
//		System.out.println(j); // for( ) 안에서만 선언된 변수는 지역변수라고 하고 반복문이 끝나면 사라진다.
		
	}

}
