package organize;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
		Q1. 숫자 하나를 입력 받아서,
			입력 받은 숫자가 완전수 인지 판단하는 코드를 작성

			실행 예시 >
			숫자 입력 : 6
			입력하신 숫자는 완전수 입니다.

			숫자 입력 : 5
			입력하신 숫자는 완전수가 아닙니다.

			완전수 : 퍼팩트넘버 ( 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 경우)
			0, 6, 28, 496, 8128, 33550336
	    */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 > ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.print(sum + " ");
            }
        }

        if (sum == n) {
            System.out.println(" : 완전수");
        } else {
            System.out.println(" : 완전수X");
        }
    }
}