package movie;
/*
 * 	1. 싱글톤 패턴 적용
 *  2. 좌석 정보는 문자열 배열로 생성 - 길이는 5
 *  3. 좌석을 예매하는 메서드 reservation(좌석번호, 예매자 이름)
 *  	좌석번호는 배열의 인덱스, 인덱스에 해당하는 배열 요소에 예매자 이름을 저장 ---> 예매가 완료
 *  	만약에 예매할려는 배열 인덱스에 이미 예매가 되어있다면 예매에 실패했다고 값을 린턴해서 알려주면 됨
 *  	좌석 예매 성공시 - true, 좌석 예매 실패시 - false 리턴 
 *  4. 전체 예매 내역을 조회
 *  	배열 내용을 전부 출력
 */
public class Cinema {
	private static Cinema instance = new Cinema();
	private String[] seat;
	
	private Cinema() {
		seat = new String[5];
	}

	public static Cinema getInstance() {
		if(instance == null)
			instance = new Cinema();
		return instance;
	}

	public synchronized boolean reservation(int seatNo, String name) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(seatNo < 1 || seatNo > 5) {
			System.out.println("올바른 좌석 번호를 입력하세요");
			return false;
		}
		
		if(seat[seatNo-1] == null) {
			seat[seatNo-1] = name;
			System.out.println(name + " 손님 " + seatNo + "좌석 예매에 성공하셨습니다.") ;
			return true;
		}
		System.out.println(name + " 손님 " + seatNo + "좌석 예매에 실패하셨습니다.") ;
		
		return false;
	}
	
	/*
	 * 1 - 홍길동
	 * 2 - 김철수
	 * 3 - 빈좌석
	 * ... 
	 */
	public void allSeatPrintInfo() {
		for(int i=0;i<seat.length;i++) {
			System.out.println(String.format("%d - %s", i+1, 
					(seat[i] == null ? "빈좌석" : seat[i])));
		}
	}
}








