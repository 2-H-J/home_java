public class E04_Casting {
/*
    데이터 형변환 : 데이터 타입을 바꾸는 행위
    
    자동으로 데이터 형변환 : 연산할 때 자동으로 변환(오토캐스팅)
        - 수의 체계상 작은 개념과 큰 개념이 계산 했을 때
            --> 실수와 정수가 계산할 때 ( 정수가 실수로 바뀐다. 이래야 데이터 손실이 없다.)
        - 메모리 바이트 수가 작은 타입이 큰 타입과 계산 했을 때 작은 타입이 바뀐다.
            --> int 형과 long 이 계산했을 때는 int 형이 long 으로 변환 / float 형과 double 이 계산 하면 float 이 double 으로 변환

    강제로 데이터 형변환 : 데이터 손실이 일어날 수 있음
        - 큰 개념을 작은 개념으로 바꿔야 할 때
            --> 실수를 정수로
        - 메모리 바이트 수가 큰 타입을 작은 타입으로 바꿔야 될 때
            --> double 을 float 로
*/
    public static void main(String[] args) {

        // 자동으로 형변환 되는 경우
        int n = 120;
        double d = 3.12;
        System.out.println(n / d);

        d = n;
        System.out.println(d);

        short s = 100; // byte 와 short 는 int 형에서 자동으로 형변환 돼서 저장
        System.out.println(s);

        long l = 100L;
        System.out.println(l - s);

        System.out.println('A' + 1); // char 는 2바이트 1은 int 4바이트 이기 때문에 int로 바뀐다.

        // 강제로 형변환 하는 방법 --> (바꾸고 싶은 변수 타입) 값 or 변수

        double pi = 3.1415;
        int i = (int)pi;
        System.out.println(i);

        double db = 5.15;
        System.out.println((int)db);

        i = 65;
        char c2 = (char) i;
        System.out.println(c2);

    }
}
