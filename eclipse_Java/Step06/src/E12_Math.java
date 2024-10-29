
public class E12_Math {

	public static void main(String[] args) {
/*
		Math. : 클래스
*/
		System.out.println("-----절대값-----");
		//절대값
		System.out.println(Math.abs(-100));
		
		System.out.println("-----소수점 올림-----");
		//소수점 올림
		System.out.println(Math.ceil(3.4)); //4
		System.out.println(Math.ceil(-3.4));//-3
		
		System.out.println("-----소수점 내림-----");
		//소수점 내림
		System.out.println(Math.floor(3.4));//3
		System.out.println(Math.floor(-3.4));//-4
		
		System.out.println("-----소수점 반올림-----");
		//소수점 반올림
		System.out.println(Math.round(3.4));//3
		System.out.println(Math.round(-3.4));//-3
		
		System.out.println("----------");
		//삼각함수, 사인, 코사인, 탄젠트 각각 40도에 해당하는 결과를 출력
		System.out.println(Math.toRadians(40));
		System.out.println(Math.sin(Math.toRadians(40)));
		System.out.println(Math.cos(Math.toRadians(40)));
		System.out.println(Math.tan(Math.toRadians(40)));
		
		System.out.println("-----PI-----");
		//PI
		System.out.println(Math.PI);
		
		System.out.println("-----랜덤-----");
		//랜덤
		System.out.println(Math.random());
		
		System.out.println("-----큰값, 작은값-----");
		//큰값, 작은값
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		System.out.println("-----파워-----");
		//파워 
		System.out.println(Math.pow(2, 10)); // 2의 10승
	}

}
