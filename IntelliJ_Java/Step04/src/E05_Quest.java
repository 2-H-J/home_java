public class E05_Quest {
    public static void main(String[] args) {
        /*
        1 ~ 100 까지 숫자들 중 4와 7의 배수를 출력
        단, 4와 7의 공배수는 1번만 출력
        */

        int n = 0;
        int sum = 0;
        while (n < 100){
            n++;
            sum += n;
            if(n % 4 == 0 || n % 7 == 0){
                System.out.print(n+" ");
            }
        }
        System.out.println();
        System.out.println(sum);


    }
}
