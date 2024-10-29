package e03_exception;

import java.util.Scanner;

public class ExceptionEx7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자 입력 1 : ");
			int n1 = sc.nextInt();
			if(n1 < 1)
				throw new UserException("숫자는 양수를 입력해야 합니다.");
			
			System.out.print("숫자 입력 2 : ");
			int n2 = sc.nextInt();
			if(n2 < 1)
				throw new UserException("숫자는 양수를 입력해야 합니다.");
			
			System.out.println(n1 * n2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
