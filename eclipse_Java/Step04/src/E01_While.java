
public class E01_While {

	public static void main(String[] args) {

		/*
		 	반복문 : 원하는 만큼 동일한 코드를 반복해주는 문법

				반복문의 핵심, 조건식이 true일동안 반복
	
					while
					for
					do-while
					
					while(조건식){
						실행할 코드...
						실행할 코드...
						실행할 코드...
					}
		*/
		
//		반복문의 주요
//		i : 제어변수 초기값 확인
//		조건식 확인 
//		증감식 확인
//		조건에 맞는 true 까지 돌아가는지 확인
		
		int i = 0;
		while(i != 5) {
			System.out.println("안녕하세요");
			System.out.println(i);
			i++;
		}
		
		
	}

}
