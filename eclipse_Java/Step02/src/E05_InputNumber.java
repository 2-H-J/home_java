import java.util.Scanner;

public class E05_InputNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		System.out.print("숫자 입력 > ");
		n1 = sc.nextInt(); //실제 숫자를 입력 받고 난 뒤에 n1에 저장
		System.out.println("n1 : " + n1 );
		
		System.out.print("숫자 입력 > ");
		int n2 = sc.nextInt();
		System.out.println("n2 : " + n2);
		
		//실수 하나 입력 받아서 출력
		System.out.print("실수 입력 > ");
		double f = sc.nextDouble();
		System.out.println("f : " + f);
		
		System.out.println("---------------------------------------------------");
		
		System.out.print("숫자 입력 > ");
		int n3 = sc.nextInt();
		System.out.println("n3 : " + n3);
		
		System.out.print("문자입력 > ");
		String str1 = sc.next();
		System.out.println("str1 : " + str1);
		
		System.out.print("숫자 입력 > ");
		int n4 = sc.nextInt(12);
		System.out.println("n4 : " + n4);
		
		
		
		
		
	}
}




