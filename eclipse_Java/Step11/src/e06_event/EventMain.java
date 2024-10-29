package e06_event;

public class EventMain {

	public static void main(String[] args) {
		Button btnRegister = new Button("회원가입");
		btnRegister.setOnClickListener(new ButtonRegisterOnClickEvent());
		btnRegister.onClick();
		
		Button btnLogin = new Button("로그인");
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.name + " 버튼 클릭");
				System.out.println("로그인 처리");
			}
		});
		
		btnLogin.onClick();
		
		Button btnB = new Button("뒤로");
		btnB.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				System.out.println(view.name + "버튼");
				System.out.println("뒤로가기");
			}
		});
		btnB.onClick();
		
	}

}
