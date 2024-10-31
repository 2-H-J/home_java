import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {

		/*
		 * 사용자로부터 점수를 입력받아,
		 * 다음의 기준으로 등급을 분류하여 출력하는 프로그램을 작성
		 * 
		 * 95이상 : A+
		 * 90 ~ 94 : A
		 * 85 ~ 89 : B+
		 * 80 ~ 84 : B
		 * 75 ~ 79 : C+
		 * 70 ~ 74 : C
		 * 65 ~ 69 : D+
		 * 60 ~ 64 : D
		 * 0 ~ 59 : F
		 * 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();
		
		if (score <= 59) {
			System.out.println("F");
		} else if (score <= 64) {
			System.out.println("D");
		} else if (score <= 69) {
			System.out.println("D+");
		} else if (score <= 74) {
			System.out.println("C");
		} else if (score <= 79) {
			System.out.println("C+");
		} else if (score <= 84) {
			System.out.println("B");
		} else if (score <= 89) {
			System.out.println("B+");
		} else if (score <= 94) {
			System.out.println("A");
		} else {
			System.out.println("A+");
		}
		
		System.out.println("-------------------------------------------------");

//		삼항연산자 적용
		String grade = "F";
		
		if(score >= 90)
			grade = score % 10 >= 5 ? "A+" : "A";
		else if(score >= 80)
			grade = score % 10 >= 5 ? "B+" : "B";
		else if(score >= 70)
			grade = score % 10 >= 5 ? "C+" : "C";
		else if(score >= 60)
			grade = score % 10 >= 5 ? "D+" : "D";
		
//		if(score >= 60 && score % 10 >= 5)
//			grade += "+";
		
		System.out.println(grade);
		
		System.out.println("-------------------------------------------------");
//		AI 검색 삼항 연산자를 사용하거나, 배열을 활용
		
		String[] grades = {"F", "D", "D+", "C", "C+", "B", "B+", "A", "A+"};
		int index = Math.min((score - 55) / 5, 8);
		System.out.println(grades[Math.max(index, 0)]);

		
	}

}
