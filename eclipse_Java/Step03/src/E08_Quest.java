import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		
		/*
		 * 숫자 두개를 입력해서
		 * 두 숫자의 뺄셈 결과를
		 * 무조건 양수로 되게끔 출력
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 > ");
		int n1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 > ");
		int n2 = sc.nextInt();

		int sum = n1 - n2;

		System.out.println("---case 1---");
		System.out.println(Math.abs(sum)); // Math.abs : 절대값을 리턴해주는 메서드
		
//		------------------------------------------------------------		
		
		System.out.println("---case 2---");
		
		if(n1 > n2) {
			System.out.println(n1 - n2);
		}else {
			System.out.println(n2 - n1);
		}

//		------------------------------------------------------------		
		
		System.out.println("---case 3---");

		if(sum < 0) {
			sum = -sum;
			System.out.println(sum);
		}else {
			System.out.println(sum);
		}
		
//		------------------------------------------------------------

		System.out.println("---case 4---");
		
		System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
		
//		------------------------------------------------------------
		
		System.out.println("---case 5---");
		
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println(n1 - n2);
	}

}
