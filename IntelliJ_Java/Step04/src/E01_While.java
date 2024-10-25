import java.util.Scanner;

public class E01_While {
    public static void main(String[] args) {
//       반복문 : 원하는 만큼 동일한 코드를 반복해주는 문법
//       반복문의 핵심 : 조건식이 true일동안 반복

        /*
        while (조건식){
            실행할 코드...
            실행할 코드...
            실행할 코드...
        }
        */

        int i = 0;
        while (i < 100){
            i++;
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 > ");
        int n = sc.nextInt();
        int score = 0;

        while (n > score){
            System.out.println("Hello World");
            score++;
        }
    }
}
