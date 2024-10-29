
public class E11_Switch {

	public static void main(String[] args) {
		
		/*
		 * switch는 case 옆에 있는 값과 일치하면
		 * 일치하는 순간부터 switch 내부의 코드를 전부 순서대로 실행한다.
		 * (switch가 끝나거나, break를 만날때까지)
		 * break는 switch를 강제로 종료시키는 키워드
		 * switch에서 비교가 가능한 값은 정수, 문자, 문자열만 가능
		 * default : 위 case에 맞는 값이 없을때 실행되는 영역
		 * (if문으로 따지면 else와 역할이 동일)
		 * 
		 * switch는 정확하게 값이 정해져 있고 값이 적을때 사용하기 용의하다
		 * 범위가 넓고 값이 많을때는 if 사용
		*/
		
		int no = 4;
		
		switch(no) { // switch(값)
		case 1: // 값 확인
			System.out.println("One");
			break; // 실행되면 break 후 밖으로 실행이 빠져나간다
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default: // else랑 같다 위 case에 맞는게 없다면 실행
			System.out.println("?????");
		}
		
		
		
		
	}

}
