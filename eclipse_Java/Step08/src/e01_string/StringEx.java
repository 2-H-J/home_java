package e01_string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "Hello World";

		// 저장하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();

		// 배열에 저장된 내용을 출력
		System.out.println(Arrays.toString(arr));

		// 바이트형 배열을 문자열로 변환
		String str2 = new String(arr);
		System.out.println(str2);

		// 해당 인덱스 번호에 위치한 문자 하나 리턴
		System.out.println(str1.charAt(4)); // 인덱스 4번

		System.out.println("------------------------------------------------");
		String str3 = "Hello World Hello Java World";

		// 문자열 왼쪽부터 검색
		System.out.println(str3.indexOf("World")); // World 조회 인덱스 6번째 부터 검색해서 값 6나옴
		System.out.println(str3.indexOf("World", 7)); // World 인덱스 7번째 부터 검색
		System.out.println(str3.indexOf("World", 24)); // 인덱스 -1은 존재하지 않기 때문에 값이 없다는 것을 알림

		// 문자열 오른쪽부터 검색
		System.out.println(str3.lastIndexOf("World")); // 오른쪽에서 왼쪽으로 검색 해서 검색내용이 가장 가까운 인덱스 번호 23
		System.out.println(str3.lastIndexOf("World", 22)); // 인덱스 22번째부터 오른쪽에서 왼쪽으로 검색

		System.out.println("------------------------------------------------");

		// 알파벳을 전부 소문자로 변환
		System.out.println(str3.toLowerCase());

		// 알파벳을 전부 대문자로 변환
		System.out.println(str3.toUpperCase());

		System.out.println("------------------------------------------------");

		// 글자 개수
		System.out.println(str3.length());

		System.out.println("------------------------------------------------");

		// 지정 인덱스 번호부터 출력
		System.out.println(str3.substring(10)); // 인덱스번호 10부터 끝까지

		// 지정 인덱스 번호부터 번호전까지 출력
		System.out.println(str3.substring(10, 15)); // 인덱스번호 10부터 인덱스번호 15전까지

		System.out.println("------------------------------------------------");

		// 문자열 내용 변경
		System.out.println(str3.replace("World", "Hell")); // 문자열 World를 Hell로 변경

		System.out.println("------------------------------------------------");

		String str4 = "          Hello World          ";

		System.out.println(str4.length());
		System.out.println(str4);

		// 문자열 양쪽에 있는 필요없는 공백 제거(문자열을 만나기 전까지)
		System.out.println(str4.trim());
		System.out.println(str4.trim().length());

		System.out.println("------------------------------------------------");
//		★★★★★구분 문자열
		String str5 = "java,html,css,javascript,jsp,spring";
		
		// 문자열을 구분자-> ,를 기준으로 잘라서 배열로 만들어줌
		// 지정한(바꿀수있음) ,(콤마)기준 배열로 쪼개서 구분하기
		String[] result = str5.split(","); 
		System.out.println(Arrays.toString(result));
		System.out.println(result[1]);
		
		// 문자열로된 배열을 하나의 문자열로 만들어줌, 문자열과 문자열 사이에 구분자 -> / 넣어줌
		// 지정한(바꿀수있음) 구분자-> ,(콤마)의 기준을 구분자-> /로 바꿔서 모든 문자열을 붙여준다 
		String str6 = String.join("/", result);
		System.out.println(str6);
		
		System.out.println("------------------------------------------------");
		
		// 문자열 포맷 ( %s : 문자열 , %d : 정수 , %f : 실수 )
		// %10d ---> 10출력공간을 확보해서 출력 / 양수면 오른쪽 정렬, 음수면 왼쪽 정렬
		
		// %.2f --> 소수점 둘째자리까지 표시, 셋째 자리에서 반올림
		System.out.println(String.format("이름 : %s / 나이 : %d / 시력 : %f","김철수", 20, 1.5));
		
		// %x : 16진수, %o : 8진수
		System.out.println(String.format("%d %x %o", 10, 10, 10));
		// %X : 대문자 기준
		System.out.println(String.format("%d %X %o", 10, 10, 10));
		// %b boolean , %c char
		System.out.println(String.format("%b %c", true, '가'));
		
		System.out.println(String.format("%f %g", 3.240000000, 3.24000000000));
		
		System.out.println(String.format("%05d", 10)); // 총 5의 공간을 만들고 남는 공간을 0으로 채워줌
		
		
	}

}
