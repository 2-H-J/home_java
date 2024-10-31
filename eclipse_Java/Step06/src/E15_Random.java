
public class E15_Random {

	public static void main(String[] args) {
		// (int)(Math.random() * (최대값 - 최소값 + 1) + 최소값)

		for (int i = 0; i < 10; i++) {

			System.out.printf("%d ", (int) (Math.random() * 10) + 1); // 0 ~ 9 // +1 하면 1 ~ 10

		}
		System.out.println();

		// 7 ~ 15
		for (int i = 0; i < 10; i++) {

			System.out.printf("%d ", (int) (Math.random() * 9) + 7);
			// (int)(Math.random() * 최대값 - 최소값 + 1) + 최소값)
			// 						   15	-   7	 + 1) +   7

		}
		System.out.println();

		// 로또번호 6개 1 ~ 45 출력
		for (int i = 0; i < 6; i++) {

			System.out.printf("%d ", (int) (Math.random() * 45) + 1);
			// (int)(Math.random() * 최대값 - 최소값 + 1) + 최소값)
			// 						   45 	- 	1 	 + 1) +	   1

		}
		System.out.println();
	}

}
