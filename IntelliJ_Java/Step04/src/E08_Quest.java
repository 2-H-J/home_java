import java.util.Scanner;

public class E08_Quest {
    public static void main(String[] args) {

        // 숫자 하나 입력 받아서 해당 숫자의 팩토리얼 값 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 > ");
        int n = sc.nextInt();
        int f = 1;
        int i = 0;
        while (i < n){
            i++;
            System.out.print(i+" ");
            f *= i;
        }
        System.out.println(" > 팩토리얼 값 : "+f);
    }
}
