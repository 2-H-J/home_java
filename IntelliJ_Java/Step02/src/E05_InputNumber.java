import java.util.Scanner;

public class E05_InputNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 > ");
        int n1 = sc.nextInt();

        System.out.println("정수 n1 : "+n1);

        System.out.print("숫자 입력 > ");
        int n2 = sc.nextInt();
        System.out.println("정수 n2 : "+n2);

        // 실수 하나 입력 받아서 출력
        System.out.println("실수 입력 > ");
        double d1 = sc.nextDouble();
        System.out.println("실수double : "+d1);



    }

}
