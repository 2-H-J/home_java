import java.util.Arrays;

public class E19_Lotto {

	public static void main(String[] args) {
//		로또번호 1세트 랜덤으로 생성해서 출력, 번호는 1 ~ 45
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또번호 : "+Arrays.toString(arr));
	}

}
