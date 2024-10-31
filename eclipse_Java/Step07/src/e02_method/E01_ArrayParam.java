package e02_method;

public class E01_ArrayParam {
	
//		배열의 내용을 출력하는 메서드
	static void printArray(int[] ary) { //static void (int[] ary) main의 배열 주소를 받아 메서드 작성을 할 수 있다.
		ary[2] = 6; //---------------------------arr[2] 값을 3에서 6으로 변경
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println(ary);
	}
	
	/*
	 * 여러개의 값을 받는 방법 ...
	 * printArgs(1,2,3,4,5,6,7,8,9,10);
	 * 해당 값들을 ary 배열로 만들어서 처리한다.
	 * 추가적으로 다른 데이터가 필요하면 가변길이로 선언한 매개변수 앞에 변수 선언을 해야 한다.
	 * printArgs(String str, int ... ary)
	 */
	
	// 배열의 내용을 1씩 증가시키는 메서드
	static void printArgs(String str, int ... ary) { // int ... 받은 배열의 모든 값을 배열로 만들어 준다
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println(ary);
	}
	static void addArray(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			ary[i]++;
//			System.out.print(ary[i]+" ");
		}
//		System.out.println(ary);
	}
	
	public static void main(String[] args) {
		// 정수형 배열 길이가 5인 배열 생성, 임의의 값으로 초기화
		int[] arr = {1,2,3,4,5};
		//static void (int[] ary) main의 배열 주소를 받아 메서드 작성을 할 수 있다.
		printArray(arr);
		
		printArray(new int[] {1,2,3,4,5,6,7,8,9}); // new를 붙여 주소를 새로 할당해서 출력
		printArray(new int[] {1,2,3,4,5,6,7,8,9}); // 
		addArray(arr);
		
		// int... 받은 배열의 모든 값을 배열로 만들어 준다
		printArgs(" "+arr);
//		printArgs(1,2,3,4,5,6,7,8,9,10);
//		printArgs(1,2,3,4,8,9,10);
		
//		
	}

}
