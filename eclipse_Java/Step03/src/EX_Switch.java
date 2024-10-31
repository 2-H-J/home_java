
public class EX_Switch {

	public static void main(String[] args) {
		int no = 10;

		int result = switch (no) {
		case 1, 3, 5, 7, 9 -> {
			System.out.println("홀수");
			yield 0;
		}
		case 0, 2, 4, 6, 8, 10 -> {
			System.out.println("짝수");
			yield 1;
		}
		default -> {
			System.out.println("Test");
			yield 3;
		}
		};
		System.out.println("result : " + result);
		
		switch (no) {
		case 1, 3, 5, 7, 9 -> {
			System.out.println("홀수");
		}
		case 0, 2, 4, 6, 8, 10 -> {
			System.out.println("짝수");
		}
		default -> {
			System.out.println("Test");
		}
		}
		
		switch (no) {
		case 1, 3, 5, 7, 9:
			System.out.println("홀수");
			break;
		case 0, 2, 4, 6, 8, 10:
			System.out.println("짝수");
			break;
		default:
			System.out.println("Test");
		}

	}

}