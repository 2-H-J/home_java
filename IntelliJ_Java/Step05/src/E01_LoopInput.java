import java.util.Scanner;

public class E01_LoopInput {
    // 반복문으로 원하는 만큼 데이터 입력을 받은 후
    // 수행한 작업 결과를 출력하는 코드를 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자 5번 입력 받아서 입력 받은 숫자들의 총합

        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("숫자 입력 > ");
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
