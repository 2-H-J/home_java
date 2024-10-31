import java.util.Scanner;

public class E15_Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		
//		String command = new String("delete");
		
		
//		switch로 문자열 검증
		
		switch(str) {
		case "register" :
			System.out.println("회원정보 등록 기능을 실행 합니다.");
			break;
		case "search" :
			System.out.println("회원정보 검색 기능을 실행 합니다.");
			break;
		case "delete" :
			System.out.println("회원정보 삭제 기능을 실행 합니다.");
			break;
		default :
			System.out.println("잘못된 명력어를 입력 하셨습니다.");
		}
		
	}

}
