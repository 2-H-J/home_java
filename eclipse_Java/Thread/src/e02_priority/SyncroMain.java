package e02_priority;

import java.util.ArrayList;

import e03_syncronized.Player;

public class SyncroMain {

	public static void main(String[] args) {
		ArrayList<Player> list = new ArrayList<Player>();
		for(int i = 0; i < 5; i++) {
			list.add(new Player());
		}
		list.forEach(t -> t.start());
	}

}
