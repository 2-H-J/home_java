import java.util.Arrays;

public class E03_ArrayEx3 {

	public static void main(String[] args) {
//		정수형, 실수형, 문자형, 논리형, 문자열 배열을 길이가 4인 배열로 생성
//		int	  , double , char , boolean, String
		int[] arr1 = new int[4];
		double[] arr2 = new double[4];
		char[] arr3 = new char[4];
		boolean[] arr4 = new boolean[4];
		String[] arr5 = new String[4];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3)); // char - 문자 코드 0 : null문자(화면에 표시되는 언어가아님)
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5)); // String - null : 빈값
		
	}

}
