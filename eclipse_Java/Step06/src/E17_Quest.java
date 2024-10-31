import java.util.Scanner;

public class E17_Quest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("가위 - 1, 바위 - 2, 보 - 3");
		System.out.print("사용자 > ");
		int user = sc.nextInt();
		
//		int user = (int) (Math.random() * 3) + 1;
		
		int com = (int) (Math.random() * 3) + 1;
		
//		사용자가 이겼는지 졌는지 비겼는지 출력
//		사용자 1 2 3
		
//		컴퓨터 3 1 2 ↓
//		%3 =   0 1 2
//		+1 =   1 2 3
//		System.out.println("사용자 > "+user);
		System.out.println("컴퓨터 > "+com);
		if (user == com % 3 + 1) {
			System.out.println("사용자가 이겼습니다.");
		} else if (user == com) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
	}
	

}
