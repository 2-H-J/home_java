
public class E14_Quest {

	public static void main(String[] args) {
		/*
		 * 삼각함수 표 출력 각도 사인 코사인 탄젠트 1 0.000 0.000 0.000 2 ... ... ...
		 * 
		 * 정수는 %d , 실수 %f
		 */
		

		for (int i = 1; i <= 90; i++) {
			double radian = Math.toRadians(i);
			
			if(i<90)
			System.out.printf("%4d %10.4f %10.4f %10.4f \n" , i, Math.sin(radian), Math.cos(radian), Math.tan(radian)); 
			// 4d:양수는 오른쪽 정렬 , -4d:음수는 왼쪽정렬 , 10.4 : 소수점4자리 까지
			else
				System.out.printf("%4d %10.4f %10.4f     ∞ \n" , i, Math.sin(radian), Math.cos(radian));
		}
		
//		
	}

}
