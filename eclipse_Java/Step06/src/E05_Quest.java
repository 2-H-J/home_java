import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
	/*
		정수형 배열 길이가 7인 배열을 생성한 뒤에
		배열에 숫자를 전부 사용자로 부터 입력을 받아서 저장한 후에
		배열에 있는 모든 값을 출력	
		
		예시 >
		0번째 숫자 입력 : 3
		1번째 숫자 입력 : 4
		....
		6번째 숫자 입력 : 11
		
		3 4 ... 11
		
		단, Arrays.toString 사용하지 않는다.
	*/
		Scanner sc = new Scanner(System.in);
		
//		1. 정수형 배열 길이가 7인 배열을 생성
		int[] arr = new int[7];
		
		for(int i = 0; i < arr.length; i++) {
//		2. 배열에 숫자를 전부 사용자로 부터 입력받을 변수
			System.out.print(i+"번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
//		3. 배열에 입력한 모든 값을 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
