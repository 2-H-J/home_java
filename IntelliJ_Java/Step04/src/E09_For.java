import java.util.Scanner;

public class E09_For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("안녕");
        }

        int j = 0;
        for (; j < 3; j++) {
            System.out.print("j ");
        }
        System.out.println();
        for (int n = 0; n < 10; ) {
            System.out.print(++n + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("단 입력 > ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, dan * i);
        }

        System.out.println("-------------------");
        System.out.print("숫자 입력 > ");
        int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac *= i;
        }
        System.out.println(fac);

        System.out.println("-------------");

        // 숫자 하나 입력 받아서 입력한 숫자의 모든 약수를 출력

        System.out.print("약수 구할 수 입력 > ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i+" ");
            }
        }

    }
}
