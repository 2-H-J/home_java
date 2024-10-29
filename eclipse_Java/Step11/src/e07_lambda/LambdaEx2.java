package e07_lambda;

import e06_event.Button;

public class LambdaEx2 {
	public static void calc(int x, int y, Calcirator cal) {
		System.out.println(cal.calc(x, y));
	}
	
	public static void main(String[] args) {
		
		calc(10, 20, new Calcirator() {
			
			@Override
			public int calc(int x, int y) {

				return x + y;
			}
		});// calc
		
		calc(20, 20, (x, y) -> x + y);
		
		Button btnOk = new Button("확인");
		btnOk.setOnClickListener(x -> System.out.println("확인버튼 클릭"));
		btnOk.onClick();
		btnOk.setOnClickListener(x -> System.out.println(x.getName() + " 버튼 클릭 "));
		btnOk.onClick();
		
	}// main
}// class
