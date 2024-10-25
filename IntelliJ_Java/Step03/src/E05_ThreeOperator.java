import java.util.Scanner;

public class E05_ThreeOperator {
    /*
        삼항연산자

    */
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        int result = n1 > n2 ? n1 : n2; // 조건식 ? 왼쪽:오른쪽 /  true면 왼쪽 false면 오른쪽 값을 리턴
        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 > ");
        int n = sc.nextInt();
        String msg = n >= 20 ? "성인" : "미성년자";
        System.out.println(msg);
    }
}
