import java.util.Scanner;

public class E08_Quest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 삼각형 밑변과 높이를 입력 받아서
        // 삼각형 넓이를 출력, 단 출력 결과는 소수점이 반드시 나와야함

        // 1. 삼각형 밑변과 높이 입력 받는 스캐너
        System.out.print("삼각형 밑변 입력 > ");
        double d1 = sc.nextDouble();
        System.out.print("삼각형 높이 입력 > ");
        double d2 = sc.nextDouble();

        // 2. 계산 밑변 * 높이 / 2
        double result = d1 * d2 / 2;

        // 3. 출력
        System.out.println("삼각형의 넓이는 : "+result);




    }
}
