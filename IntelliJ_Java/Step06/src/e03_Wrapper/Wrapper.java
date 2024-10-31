package e03_Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Integer n1 = 100;
        int n2 = 30;
        Integer n3 = new Integer(5);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1 * n3);

        System.out.println("---------------------------------------");
        // int 형 타입의 최대값, 최소값, 바이트수, 사이즈
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE); // 비트수

        System.out.println("---------------------------------------");
        //문자열을 해당 타입의 값으로 변환
        System.out.println(Integer.parseInt("1234") * 2);
        System.out.println(Double.parseDouble("3.1415") * 2);

        System.out.println("---------------------------------------");
        System.out.println(Integer.toHexString(65)); // 16진수
        System.out.println(Integer.toHexString(10)); // 16진수
        System.out.println(Integer.toOctalString(10)); // 8진수
        System.out.println(Integer.toBinaryString(10)); // 2진수

        System.out.println("---------------------------------------");
        // 16 진수 표현법 - 0x 로 시작
        System.out.println(0xA); // 10

        // 8진수 표현법 - 0 로 시작
        System.out.println(012); // 10

        System.out.println("---------------------------------------");
        int i1 = 100;
        Integer i2 = i1; // auto boxing
        int i3 = i2; // auto unboxing
        System.out.println(i3);

        //--------------------
        Object o1 = new Integer(10);
        int i7 = ((Integer)o1).intValue();
        System.out.println(i7);


    }
}
