
public class E02_ArrayEx2 {

	public static void main(String[] args) {
//		배열 생성과 동시에 초기화 하는 방법 -1
//					 [0,1,2,3,4,5]
		int[] arr1 = {1,2,3,4,5,6,7,8};
				
		System.out.println("배열 개수 확인 : "+ arr1.length);
		
		for(int i = 0; i < 6; i++) { // 배열 길이에 들어가있는 지정값 순서대로 출력하는 반복분
//			0 부터 6번째 반복 출력
			System.out.print(arr1[i]+" ");
		} 
		System.out.println();
		System.out.println("----------------------");
		for(int i = 0; i < arr1.length; i++) { // 0 부터 선언한 배열 길이 만큼 출력 반복하는 반복문
			System.out.println(arr1[i]);
		}
		
		System.out.println("-----------2-----------");
		
//		배열 생성과 동시에 초기화 하는 방법 -2
		int[] arr2 = new int[] {10,11,12,13,14,15,15};
		
		int sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
			sum += arr2[i];
		}
		System.out.println();
		System.out.println(sum);
		
	}
}
