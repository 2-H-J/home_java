import java.util.Scanner;

public class E08_Quest {
    public static void main(String[] args) {

        // 숫자 두개 입력 받아 값을 출력
        // 단, 무조건 양수로 되게끔 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 > ");
        int n1 = sc.nextInt();
        System.out.print("숫자 입력 > ");
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n1 - n2);
        }else {
            System.out.println(n2 - n1);
        }
    }
}
