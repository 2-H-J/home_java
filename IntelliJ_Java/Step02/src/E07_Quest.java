import java.util.Scanner;

public class E07_Quest {
    public static void main(String[] args) {
        /*
        반지름 데이터 한개를 입력 받아서
        입력 받은 반지름에 해당하는 원넓이를 출력
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("반지름 입력 > ");
        double d = sc.nextDouble();

        double sum = d * d * 3.1415;
        System.out.println("원넓이 : "+sum);
    }
}
