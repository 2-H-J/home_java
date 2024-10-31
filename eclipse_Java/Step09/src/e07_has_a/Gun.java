package e07_has_a;
/*
 * 	- has a
		A has a B
		A가 B를 가지고 있다?
		객체를 이동?
		인스턴스가 다른 인스턴스를 가지고 사용


	- is a
		A is a B
		A 는 B 다?
		부모 자식 관계
		
*	객체와 객체의 Has a 관계를 상속구조로 표현하게되면 문제가 발생
*	플레이어의 경우 다양한 총기를 교체해야되는데, 상속으로 표현하면 총기하나에 귀속, 확장성이 떨어짐
*	총기 교환을 할려면 코드를 수정해야되는 문제가 생김
*	이런 문제 때문에 Has a 관계를 표현할 때는 상속 구조로 표현하면 안됨
*/
public class Gun {
	
	protected int bullet;

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
