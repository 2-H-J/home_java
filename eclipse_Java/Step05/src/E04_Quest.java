
public class E04_Quest {

	public static void main(String[] args) {
	/*
		1 ~ 10까지의 숫자의 약수 목록을 아래와 같은 형태로 출력
		
		1
		1 2
		1 3
		1 2 4
		1 5
		1 3 6
		1 7
		1 2 3 4 8
		1 3 9
		1 2 5 10
	*/
		
	for (int i = 1; i <= 10; i++) { // 1 부터 10 까지 반복
		for (int j = 1; j <= i; j++) { // i가 반복할 동안 j도 동일하게 반복
			if (i % j == 0) { // j가 반복 되는 동안 i 나머지 j 가 0 이면 출력
				System.out.print(j + " ");
			}
		}
		System.out.println(); // 다음줄
	}
		
	}

}
