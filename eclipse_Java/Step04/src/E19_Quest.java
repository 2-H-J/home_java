
public class E19_Quest {

	public static void main(String[] args) {
		/*
				알파벳 A 부터 Z까지 출력
				
				단, 대문자와 소문자를 아래 형식으로 출력
				
				A-a
				B-b
				C-c
				...
				Z-z
				
				char 형 변수
				
				A와 a의 문자코드값을 이용
		*/
		System.out.println("나----------------");
		char A = 'A';
		char a = 'a';
		while(A <= 'Z') {
			System.out.println(A++ +"-"+ a++);
		}
		
		//강제로 형변환 하는 방법 ---> (바꾸고 싶은 변수 타입) 값 or 변수
				
		System.out.println("풀이1------------------------------------------------------------");				
			
		for(int i = 65; i<=90; i++) {
			System.out.println((char)i + " - " + (char)(i+32));
		}
		
		System.out.println("풀이2------------------------------------------------------------");			
		
		for(char j = 'A'; j<='Z'; j++) {
			System.out.println(j + " - " + (char)(j+32));
		}
		
		System.out.println("풀이3------------------------------------------------------------");				

		for(char k = 'A', z = 'a'; k <= 'Z'; k++, z++) {
			System.out.println(k + " - " + z);
		}
		
		
		
		
		

	}

}
