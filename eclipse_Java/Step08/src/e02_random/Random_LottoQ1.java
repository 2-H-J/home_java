package e02_random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Random_LottoQ1 {
	//로또번호 한세트 리턴하는 메서드

	public static int[] generateLotto() {
	    int[] arr = new int[6];
	    Random r = new Random();
	    
	    for(int i = 0; i < arr.length; i++) {
	        int n = r.nextInt(45) + 1; // 1부터 45 사이의 숫자 생성
	        
	        // 중복 체크
	        if (checkNumber(arr, n)) {
	            i--; // 중복되면 인덱스를 감소시켜 재시도
	            continue;
	        }
	        arr[i] = n; // 중복되지 않으면 배열에 추가
	    }
	    return arr; // 완성된 로또 번호 배열 반환
	}
	// 중복 체크하는 메서드
	public static boolean checkNumber(int[] arr, int n) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == n) // 배열에 숫자 n이 존재하면
	            return true;
	    }
	    return false; // 중복이 없으면 false
	}
	
	
	// 로또번호 한세트 출력하는 메서드
	// 예) 1 20 3 10 5 17
	public static void printLottoNumber(int[] arr) {
	    for (int n : arr) {
	        System.out.print(String.format("%02d ", n)); // 두 자리 형식으로 출력
	    }
	    System.out.println(); // 줄바꿈
	}
	
	/*
	 * 개선사항:
			성능 최적화: 현재 중복 체크는 모든 요소를 순회하는 방식으로, 숫자가 많아질 경우 성능이 저하될 수 있습니다. 
			이를 개선하기 위해 HashSet을 사용하는 방법도 고려해볼 수 있습니다.

			중복 체크를 Set으로 개선:
	*/
//------------------ GPT 풀이------------------------
//	public static int[] generateLotto() {
//	    int[] arr = new int[6];
//	    Random r = new Random();
//	    Set<Integer> set = new HashSet<>(); // 중복검사 하는 GPT 풀이식
//	    
//	    for (int i = 0; i < arr.length; ) {
//	        int n = r.nextInt(45) + 1;
//	        if (set.add(n)) { // Set에 성공적으로 추가된 경우
//	            arr[i++] = n; // 배열에 추가하고 인덱스 증가
//	        }
//	    }
//	    return arr;
//	}	
//-----------------------------------------------------------

	
		public static void main(String[] args) {
		    for (int c = 0; c < 5; c++) {
		        printLottoNumber(generateLotto()); // 로또 번호 세트 생성 및 출력
		    }
		}
        
}
