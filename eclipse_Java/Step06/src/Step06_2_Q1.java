import java.util.Arrays;

public class Step06_2_Q1 {

	public static void main(String[] args) {
		/*
		 * Q1. 문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에, 배열을 문자열로 만든 다음에 결과를 출력
		 */
		String[] arrstr = { "d", "l", "r", "o", "W", " ", "o", "l", "l", "e", "H" };
		String[] temp = new String[arrstr.length]; // 임시 저장할 변수

		System.out.println(Arrays.toString(arrstr));

//		새 배열로 저장
		for (int i = 0; i < arrstr.length; i++) {
			temp[i] = arrstr[i];
		}
//		System.out.println(Arrays.toString(temp));
		
//		다시 arrstr로 돌리며 반대로 넣기
		
	}

}
