import java.util.Arrays;

public class E20_ArrayCopy {

	public static void main(String[] args) {
		
//		배열의 길이는 할당되면 늘리거나 줄이는걸 못한다. 단, 임시 배열을 만들어 길이를 늘려 놓거나 줄이거나 하고 기존 값을 다시 복사 한다.
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------------------");
		
//		1. 공간을 늘린 임시 배열 작성
		int[] temp = new int[arr.length+5];
		System.out.println(Arrays.toString(temp));
		System.out.println("------------------------------------------------");
		
//		2. 기존 배열의 값을 새 배열로 각각 복사
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
//		3. 임시 배열을 기존 arr로 연결
		arr = temp;
		
//		4. 결과 출력
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------------------------------------------");
//		-----------------------------------------------------------------------------------------
//		자동으로 값 복사해주는 기능
		
		int[] arr2 = {1,2,3,4,5};
		
		int[] arr3 = new int[arr2.length+5];
		
		System.arraycopy(arr2, 0, arr3, 0,arr2.length); // 
//	  인덱스 0번째 처음부터 복사 / 0번째 부터 추가 
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}

}
