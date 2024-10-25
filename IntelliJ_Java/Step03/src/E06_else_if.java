import java.util.Scanner;

public class E06_else_if {
    /*
        else if
            if문으로 구성된 조건문에서 두번째 조건문부터 담당하는 문법 여러번 사용은 가능 단, 효율적이지 못할수 있음
            
            if(조건식){
                실행할 코드...
                실행할 코드...
                실행할 코드...
            }else if(조건식){
                실행할 코드..
                실행할 코드..
                실행할 코드..
            }else{
                실행할 코드
            }
    */
    public static void main(String[] args) {
        // 성인 20세 이상, 고등학생 17 ~ 19, 중학생 14 ~ 16, 초등학생 8 ~ 13, 나머지 미취학 아동

        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 > ");
        int age = sc.nextInt();

        if(age >= 20)
            System.out.println("성인");
         else if (age >= 17)
            System.out.println("고딩");
         else if (age >= 14)
            System.out.println("중딩");
         else if (age >= 8)
            System.out.println("초딩");
         else
            System.out.println("미취학아동");

    }
}
