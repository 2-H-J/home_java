package e05_anonymous;

public class PlayerMain {
	/*
		익명 클래스(Anonymous Class)
			일회성으로 사용되는 클래스를 정의할 때 사용
			추상클래스나 인터페이스를 확장하는 용도로 사용
			
			편의성, 일회성으로 사용할 때, 콜백 함수, 가독형 향상
	*/
	public static void main(String[] args) {
		
		Gun k2 = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("K2 Shot");
			}
			@Override
			public void reload() {
				System.out.println("K2 Reload");
			}
		};
		
		Player player = new Player(k2);
		
		player.shot();
		player.reload();
		
		player.setGun(new Gun() {
			
			@Override
			public void shot() {
				System.out.println("M16 Shot");
			}
			@Override
			public void reload() {
				System.out.println("M16 Reload");
			}
		});
		
		player.shot();
		player.reload();
		
		Gun ak47 = new Gun() {
			
			@Override
			public void shot() {
				System.out.println("AK47 Shot");
			}
			@Override
			public void reload() {
				System.out.println("AK47 Reload");
			}
		};
		
		Player player2 = new Player(ak47);
		
		player2.shot();
		player2.reload();
		
	}//main
}// class PlayerMain
