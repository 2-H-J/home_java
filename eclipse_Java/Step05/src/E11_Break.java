
public class E11_Break {

	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		
//		while(true) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum); 
//		Unreachable code : 반복문이 끝나지 않아서 실행될수 있는 코드가 아니다.
		
		while(true) {
			sum += i;
			i++;
			
			if(sum > 2000) {
				break; // 반복문 안에서 또는 switch에서 사용하고 반복문{ }하나당 하나만 사용 가능하다
//						  break를 직접 감싸고 있는 반복문 및 switch 1개만 종료
//						  일반적으로는 반복문에서는 if문과 같이 사용(특정 조건을 만족할 때 종료하기 위해)
			}
		}
		System.out.println(sum); 
	}

}
