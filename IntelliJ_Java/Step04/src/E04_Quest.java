import java.util.Scanner;

public class E04_Quest {
    public static void main(String[] args) {
        /*
        숫자 하나 입력 받아서 입력한 숫자의 구구단을 출력
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 > ");
        int dan = sc.nextInt();
        int i = 0;
        while (i < 9) {
            i++;
//            System.out.println(dan+" x "+i+" = "+dan * i);
            System.out.printf("%d x %d = %d \n", dan, i, dan * i);
        }


    }
}
