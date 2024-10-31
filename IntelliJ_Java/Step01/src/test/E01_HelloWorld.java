package test;

public class E01_HelloWorld {
    public static void main(String[] args) {
       System.out.println("Hello World");

       System.out.println(12345);

        System.out.println("-----------------------------");
//     프린트 단축키
//     sout
        System.out.println("sout");

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        for (int i = 2; i <= 9; i++){ // dan 2 ~ 9

            for(int j = 1; j <= 9; j++){ // 1 ~ 9
                System.out.println(i + " X "+ j + " = " + i * j);
            }
            System.out.println("-----------------------------");
        }

    }
}
