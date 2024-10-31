import java.util.Scanner;

public class E10_StringEquals {

	public static void main(String[] args) {
		
		
		
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		String str3 = new String("안녕하세요"); // new : 새로운 주소(HashCode)값으로 메모리를 할당 받는다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str4 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("---------------------------------------------1");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		//주소(HashCode)값으로 비교하니 메모리 내용이 비교가 안된다
		System.out.println(str3 == str4);

		System.out.println("---------------------------------------------2");
		
		System.out.println(str1.equals(str3));
		// equals : 같은 메모리값(내용)으로 비교를 하고 싶으면 equals 사용
		System.out.println(str3.equals(str4));
		
		System.out.println("---------------------------------------------3");
		
		System.out.println(System.identityHashCode(str1)+" : str1");
		System.out.println(System.identityHashCode(str2)+" : str2");
		System.out.println(System.identityHashCode(str3)+" : str3");
		System.out.println(System.identityHashCode(str4)+" : str4");
		//System.identityHashCode : 주소(HashCode)값 출력
		
	}

}
