public class E10_Operator {
    public static void main(String[] args) {
        /*
        * 복합 대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
        *
        *   +=  -=  *=  /=  %=
        *
        * */

        int n = 10;
        n += 4;
        System.out.println(n);

        n -= 6;
        System.out.println(n);

        n *= 2;
        System.out.println(n);

        n /= 3;
        System.out.println(n);

        n %= 2;
        System.out.println(n);

        System.out.println("-------------------");

        String address = "경기도 ";
        address += "안양시 ";
        address += "만안구 ";
        address += "안양동";

        System.out.println(address);
    }
}
