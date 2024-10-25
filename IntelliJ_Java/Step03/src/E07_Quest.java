import java.util.Scanner;

public class E07_Quest {
    public static void main(String[] args) {
        /*
        사용자로부터 점수를 입력받아,
        다음의 기준으로 등급을 분류하여 프로그램을 작성하세요
        if문

        95이상 A+
        90 ~ 94 : A
        85 ~ 89 : B+
        80 ~ 84 : B
        75 ~ 79 : C+
        70 ~ 74 : C
        65 ~ 69 : D+
        60 ~ 64 : D
        0 ~ 59 : F
*/
        // if 문으로 진행하면 너무 조건이 많고 길어짐
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 > ");
        int n = sc.nextInt();

        if (n >= 95) {
            System.out.println("등급 A+");
        } else if (n >= 90) {
            System.out.println("등급 A");
        } else if (n >= 85) {
            System.out.println("등급 B+");
        } else if (n >= 80) {
            System.out.println("등급 B");
        } else if (n >= 75) {
            System.out.println("등급 C+");
        } else if (n >= 70) {
            System.out.println("등급 C");
        } else if (n >= 65) {
            System.out.println("등급 D+");
        } else if (n >= 60) {
            System.out.println("등급 D");
        } else {
            System.out.println("등급 F");
        }

        // switch
        switch (n) {
            case 95, 96, 97, 98, 99, 100:
                System.out.println("A+");
                break;
            case 90, 91, 92, 93, 94:
                System.out.println("A");
                break;
            case 85, 86, 87, 88, 89:
                System.out.println("B+");
                break;
            case 80, 81, 82, 83, 84:
                System.out.println("B");
                break;
            case 75, 76, 77, 78, 79:
                System.out.println("C+");
                break;
            case 70, 71, 72, 73, 74:
                System.out.println("C");
                break;
            case 65, 66, 67, 68, 69:
                System.out.println("D+");
                break;
            case 61, 62, 63, 64:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        // 강사

        String grade = "F";

        if(n >= 90){
            grade = n % 10 >= 5 ? "A+" : "A";
        } else if (n >= 80) {
            grade = n % 10 >= 5 ? "B+" : "B";
        } else if (n >= 70) {
            grade = n % 10 >= 5 ? "C+" : "C";
        } else if (n >= 60) {
            grade = n % 10 >= 5 ? "D+" : "D";
        }

//        if(n >= 60 && n % 10 >= 5){
//            grade += "+";
//        }

        System.out.println(grade);

    }
}
