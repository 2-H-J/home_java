
public class E06_Quest {

	public static void main(String[] args) {
		/*
			1 ~ 100 까지 숫자들의 합을 출력
		*/
		
//		변수 2개 필요 : 1 ~ 100까지 실행할 변수 , 1 ~ 100의 합을 넣을 변수
		
//		1. 변수 선언
		int n = 0;
		int sum = 0;
		
//		2. 1 ~ 100 까지 반복
		while(n < 100) {
//		3. 반복할일 작성 : 변수에 더해서 저장
			n++;
			sum += n;
			
			System.out.println("n : "+n+" / sum : "+sum);
		}
//		4. 결과 출력
		System.out.println("1 ~ 100까지 총합 : "+sum);
		
		

		


	}

}
