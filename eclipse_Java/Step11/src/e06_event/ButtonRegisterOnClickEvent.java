package e06_event;

public class ButtonRegisterOnClickEvent implements View.OnClickListener{

	@Override
	public void onClick(View view) {
		System.out.println(view.name + " 버튼 클릭");
		System.out.println("회원가입 처리를 진행합니다.");
	}

}
