package e05_anonymous;

public class Player{
	private Gun gun;

	public Player(Gun gun) {
		this.gun = gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
} // class Player
