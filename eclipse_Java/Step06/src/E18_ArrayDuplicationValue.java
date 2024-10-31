import java.util.Arrays;

public class E18_ArrayDuplicationValue {

	public static void main(String[] args) {

		int[] arr = new int[7];
		
//		int random = 0;

//		랜덤으로 배열에 숫자를 저장, 저장할 범위 : 1 ~ 10
		
		for (int i = 0; i < arr.length; i++) { // arr 배열의 길이 만큼 반복 
			arr[i] = (int)(Math.random() * 10) + 1; // arr에 랜덤 번호 1 ~ 10 저장
				
			for(int j=0; j<i; j++) { // i 진행한 길이 만큼 반복
				
//									arr = { 0, 0, 0, 0, 0, 0, 0}
				if(arr[i]==arr[j]) { // 진행한 i 인덱스 번호에 
					i--; // 동일한 숫자가 들어가면 i를 다시 빼면서 브레이크 하면 j증감식은 멈추고 다시 i가 진행된다
					break; // 
				}
			}
		}

//		출력
		System.out.println(Arrays.toString(arr));
	}

}
