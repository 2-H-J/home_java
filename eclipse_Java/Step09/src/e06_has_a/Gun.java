package e06_has_a;
/*
 * 	- has a
		A has a B
		A가 B를 가지고 있다
		객체를 이동
		인스턴스가 다른 인스턴스를 가지고 사용


	- is a
		A is a B
		A 는 B 다
		부모 자식 관계
		
		자식이 부모가 업캐스팅
		자식이 부모로 다운캐스팅
 * 
 * 	총
 * 		- 필드
 * 			총알 - 12발 --> 초기화 해서 12발 저장
 * 			
 *		- 메서드
 *			총쏘는 기능 - 메서드 실행시 : 1발씩 발사, 총알이 없으면 자동으로 재장전
 *			재장전
 *
 *		
*/
public class Gun {
	
	private int bullet;

	public Gun() {
		bullet = 12;
	}
	
	// 총알 발사 - 총알이 없으면 자동으로 재장전
	public void shot() {
		if(bullet == 0) {
			// 재장전 실행
			reload();
		}else {
		bullet--;
		System.out.println("총알 발사");
		}
	}
	
	// 재장전 메서드
	public void reload() {
		bullet = 12;
		System.out.println("재장전");
	}
	
	
}
