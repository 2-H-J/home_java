import java.util.Scanner;

public class E04_Quest {
    public static void main(String[] args) {
//        1 ~ 10 숫자 약수 목록
        /*
        예시
        1
        1   2
        1   3
        1   2   4
        1   5
        1   3   6
        1   7
        1   2   4   8
        1   3   9
        1   2   5   10

        */

        for (int i = 1; i <= 10; i++) { // 줄 바꿈
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        /*

         *
         **
         ***
         ****
         *****

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 > ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // 줄
            for (int j = 1; j <= i; j++) { // 별
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------");
        /*

            *
           **
          ***
         ****
        *****

        */
        for (int i = 1; i <= n; i++) {
            // 줄 : (i는 1부터 시작) (입력한 n 보다 작거나 같을때 까지 반복) (한번 반복하면 i++)
            for (int j = n; j > i; j--){
                // 띄어쓰기 : (j는 입력한 n부터 시작) (j가 i보다 작을때 까지 반복) (한번 반복하면 j--)
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                // 별 : (k는 1부터 시작) (k가 i보다 작거나 같을때 까지 반복) (한번 반복하면 k++)
                System.out.print("*");
            }
            System.out.println(); // 첫번째 for문 i 줄바꿈
        }
        //------------------------------------------------------------------------
        //강사 풀이
        for (int i = 0; i < n; i++){
            //공백 찍는 부분
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            //별 찍는 부분
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("-----------------------------------");
        /*

            *
           ***
          *****
         *******
        *********

        */

        for (int i = 0; i < n; i++){ // 줄

            for (int j = n - 1; j > i; j--){ // 공백
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
//--------------------강사님 풀이
        System.out.println("----------------------------------");
        for (int i = 0; i < n; i++){
            //공백 찍는 부분
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            //별 찍는 부분
            for(int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
