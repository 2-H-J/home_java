import java.util.Scanner;

public class E04_Quest {
    public static void main(String[] args) {
        /*
            사용자로부터 나이를 입력 받아서
            입력 받은 나이가 20세 이상이면 성인
            20세 미만이면 미성년자 출력
            if-else 이용
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("나이 입력 > ");
        int n = sc.nextInt();
        
        if(n >= 20){
            System.out.println("성인");
        }else {
            System.out.println("미성년자");
        }
    }
}
