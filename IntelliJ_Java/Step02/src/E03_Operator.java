public class E03_Operator {
    /*
    사칙연산
        덧셈  +
        뺄셈  -
        곱셈  *
        나눗셈 / <- 몫
        나눗셈  % <- 나머지


    */
    public static void main(String[] args) {
        // 정수형 변수 두개 선언하여, 원하는 값으로 초기화
        // 연산 결과 저장할 정수형 변수 선언 및 초기화

        int n1 = 10 , n2 = 4;

        int result = 0;

        System.out.println("n1 : "+n1+" | n2 : "+n2);

        result = n1 + n2;
        System.out.println("덧셈 "+result);

        result = n1 - n2;
        System.out.println("뺄셈 "+result);

        result = n1 * n2;
        System.out.println("곱셈 "+result);

        result = n1 / n2;
        System.out.println("나눗셈(몫) "+result);

        result = n1 % n2;
        System.out.println("나눗셈(나머지) "+result);

        result = n1 + 2 * n2 / 5; // (2 * n2(4)) = (8 / 5) = (1 + n1(10)) = 11
        System.out.println(result);
    }
}

