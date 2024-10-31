import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {

        System.out.println("Hello World");
        // "Hello World" 문자열 or String
        // ; 할 일 종료

        System.out.println("Hi");

        System.out.println(100);


        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력 > ");
//        int num = sc.nextInt();
//
//        System.out.println();
//
//
//        if (num >= 10){
//            System.out.println("10 이상");
//        }

        System.out.print("여러 문장 단어 입력 > ");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
