public class E11_Break {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (true){
            sum += i;
            i++;

            if (sum > 2000){
                break;
            }
        }
        System.out.println(sum); // 위 break가 없으면 반복문이 끝나지 않아서 에러
    }
}
