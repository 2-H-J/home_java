import java.util.Scanner;

public class E06_Quest {
    public static void main(String[] args) {
        /*
            정수형 데이터 두개 입력을 받아서
            입력 받은 두개의 숫자들을 이용해서 사칙연산 결과를 출력
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 1 > ");
        int n1 = sc.nextInt();
        System.out.println("숫자 입력 2 > ");
        int n2 = sc.nextInt();

        System.out.println("덧셈 "+ (n1+n2));
        System.out.println("뺄셈 "+ (n1-n2));
        System.out.println("곱셈 "+ (n1*n2));
        System.out.println("나눗셈 "+ (n1/n2));
        System.out.println("나머지 "+ (n1%n2));

    }
}
