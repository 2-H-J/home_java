package organize;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 약수
        /*
        *   어떤 수를 나누어 나머지가 없이 떨어지게 하는 수를 약수라고 합니다.
            8을 1, 2, 4, 8 로 나누면 나누어떨어집니다.
            이때 1, 2, 4, 8은 8의 약수입니다.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 > ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i+" 약수");
            }
        }
    }
}
