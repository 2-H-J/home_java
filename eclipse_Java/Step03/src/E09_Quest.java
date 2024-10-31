import java.util.Scanner;

public class E09_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 > ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch);
		
//		입력받은 알파벳이 소문자면 대문자로 변환, 대문자면 소문자로 변환
//		단, 알파벳이 아니면 아무런 작업을 하지 않아도됨.
		
//		32 A=65 a=97
				
		if(ch >= 'A' && ch <= 'Z') // 대문자 A(65) ~ Z(96) 이면 32를 더한다
			ch += 32;
		else if(ch >= 'a' && ch <= 'z') // 소문자 a(97) ~ z(129) 이면 32를 뺀다
			ch -= 32;
		System.out.println("변환 : "+ch);
		
		
		
	}

}
