
public class E08_ArrayEx5 {

	public static void main(String[] args) {
		
		String str = "Hello World";

//		String 문자형 배열로 변경
		char[] arr = str.toCharArray();
		
		for(char ch : arr) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("문자열 길이 : "+ arr.length);
		
//		World의 W를 A로 변경
		
		arr[6] = 'A';
		for(char ch : arr) {
			System.out.print(ch);
		}
		System.out.println();
		
		// 문자형 배열을 String 으로 변환
		str = new String(arr);
		System.out.println(str);
		
		
	}

}
