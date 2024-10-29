
public class E12_Continue {

	public static void main(String[] args) {
//		1 ~ 10 까지 출력
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				continue; // 조건 밑에 작성을 하면 바로 다음 for 증감식으로 들어간다.
			System.out.println(i);
		}
		
//		----------------------------------
		
		System.out.println("------------------------------------");
		int n = 1;
		
		while(n <= 10) { // while 에서는 continue를 하기 전 증감식을 작성 하여야 한다.
			if(n % 2 == 0) {
				n++;
				continue;
			}	
			System.out.println(n);
			n++;
		}
		
		
	}

}
