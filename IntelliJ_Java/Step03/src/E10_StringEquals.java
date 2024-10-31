import java.util.Scanner;

public class E10_StringEquals {
    public static void main(String[] args) {
        String str1 = "안녕하세요";
        String str2 = "Hi";
        String str3 = new String("안녕하세요");

        // new : 메모리 주소를 새로 받아서 저장
        // 메모리 주소 값으로 비교를 한다
        // 내용으로 비교 하고 싶으면 .equals를 사용 해야 한다.
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 > ");
        String str = sc.nextLine();
        System.out.println(str2.equals(str));
    }
}
