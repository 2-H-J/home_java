package e01_class;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        // 클래스도 변수 타입
        Student std1 = new Student(); // 학생 데이터 저장할 객체 생성(인스턴스)
                                     // 메모리 할당을 할 때는 new
        // std1 참조형 변수 Student에 학번,이름,학과,평점에 대해 std1을 통해 연결 하겠다
        // std1 이라는 Student 인스턴스를 새로운 메모리로 할당한것

        // 데이터 초기화
        std1.studentNo = "S0001";
        std1.studentName = "홍길동";
        std1.majorName = "컴공";
        std1.score = 3.5;

        System.out.println(std1.studentNo);
        System.out.println(std1.studentName);
        System.out.println(std1.majorName);
        System.out.println(std1.score);

        System.out.println(std1.studentNo + " / " + std1.studentName + " / " + std1.majorName + " / " + std1.score);

        Student std2 = new Student();

        std2.studentNo = "S0002";
        std2.studentName = "장보고";
        std2.majorName = "법학";
        std2.score = 4.3;

        System.out.println(std2.studentNo + " / " + std2.studentName + " / " + std2.majorName + " / " + std2.score);

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
    }
}
