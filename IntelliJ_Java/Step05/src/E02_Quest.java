import java.util.Scanner;

public class E02_Quest {
    public static void main(String[] args) {
        // 숫자를 0 입력 할 때 까지 숫자 입력을 받는 반복문
        // 반복문이 끝나면 입력받은 숫자들의 합을 출력
        // 총합의 평균도 출력 단, 0은 평균 구할때 count 에서 제외

        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double n = 1;
        int count = 0;

        while (n != 0){
            System.out.print("숫자 입력 > ");
            n = sc.nextDouble();
            sum += n;
            count++;
        }
        count--;
        System.out.println("합 : "+sum);
        System.out.println("평균 : "+sum / count);

    }
}
