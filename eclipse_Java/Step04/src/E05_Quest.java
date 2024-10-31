
public class E05_Quest {

	public static void main(String[] args) {
//		1 ~ 100 까지의 숫자들 중에 4와 7의 배수를 출력
//		단 4와 7의 공배수는 1번만 출력

//		4 7 8 12 14 16 20 21 24 28 32 35...............................

		int n = 1;

//			1. 1 ~ 100 까지 출력
		while (n <= 100) {
//				System.out.println(++n);

//			2. 4와 7의 배수 확인
			if (n % 4 == 0 || n % 7 == 0) {
				System.out.println(n);
			}
//			3. 증감
			n++;
			
			
		}
	}

}
