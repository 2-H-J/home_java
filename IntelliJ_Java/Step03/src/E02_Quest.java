import java.util.Scanner;

public class E02_Quest {
    public static void main(String[] args) {
        /*
            숫자 하나 입력 받아서 해당 숫자가 짝수 인지 홀수 인지 0인지 구분해서 출력
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 > ");
        int n = sc.nextInt();

        if(n % 2 == 0 && n != 0){
            System.out.println("짝수 입니다.");
        } else if (n % 2 == 1) {
            System.out.println("홀수 입니다.");
        }else {
            System.out.println("0 입니다");
        }

    }
}
