
public class E07_ArrayEx4 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6}; // 0 ~ 5
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		
//		향상된 for문(Enhanced for loop) 또는 for-each 문이라고 불리는 반복문 구조
		for(int i : arr) { // 배열의 각 요소를 순차적으로 반복합니다.
			System.out.print(i+" ");
		}
		
		
	}
	
}
