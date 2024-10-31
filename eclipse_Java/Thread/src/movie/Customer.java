package movie;

import java.util.Random;

/*
 * 고객명, 예매할 좌석 번호
 * 
 * 스레드 상속 받음
 * 생성자로 전부 초기화 - 고객명만 외부에서 받아옴, 예매할 좌석번호는 1~5사이의 숫자를 랜덤으로 생성
 * run() -> 좌석 예매 진행
 * 
 */
public class Customer extends Thread {
	private String name;
	private int seatNo;

	public Customer(String name) {
		this.name = name;
		Random r = new Random();
		seatNo = r.nextInt(5) + 1;
	}

	@Override
	public void run() {
		Cinema.getInstance().reservation(seatNo, name);
	}

}







