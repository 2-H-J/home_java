import java.util.Arrays;

public class E23_Quest {

	public static void main(String[] args) {
//		24.09.05 / Q1
/*
* 		Q1. 문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에, 배열을 문자열로 만든 다음에 결과를 출력
*/
		String str = "Hello World"; // 변수 저장
		char[] arr = str.toCharArray(); // str변수 char[] 문자형 배열로 저장
		System.out.println(Arrays.toString(arr)+" "+arr.length);

		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
