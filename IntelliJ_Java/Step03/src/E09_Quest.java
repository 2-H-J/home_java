import java.util.Scanner;

public class E09_Quest {
    public static void main(String[] args) {
        // 입력 받은 문자가 소문자면 대문자로 변환, 대문자면 소문자로 변환
        // 단, 입력받은 문자가 알파벳이 아니면 아무런 작업을 하지 않아도됨

        Scanner sc = new Scanner(System.in);
        System.out.print("문자 하나 입력 > ");
        char ch = sc.nextLine().charAt(0);


        if (ch >= 65 && ch <= 90) {
            System.out.println((char) (ch + 32));
        } else if (ch >= 97 && ch <= 122) {
            System.out.println((char) (ch - 32));
        } else {
            System.out.println("알파벳만 입력해주세요.");
        }
//-------------------------------------------------------
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println((char) (ch + 32));
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println((char) (ch - 32));
        } else {
            System.out.println("알파벳 아님");
        }
//-------------------------------------------------------
// 강사
        if(ch >= 'A' && ch <= 'Z'){
            ch += 32;
        } else if (ch >= 'a' && ch <= 'z') {
            ch -= 32;
        }
        System.out.println(ch);
    }
}
