
public class E16_Quest {

	public static void main(String[] args) {
//		주사위를 두번 굴려서 더블이 나올때까지 굴리기
//		1 1, 2 2, 3 3, 4 4, 5 5, 6 6
//		주사위를 굴릴때마다 굴린 결과값도 출력
//		4 3
//		2 6
//		....
//		
//		int dice1 = 0, dice2 =0;
//		do {
//			dice1 = (int)(Math.random() * 6)+1;
//			dice2 = (int)(Math.random() * 6)+1;
//			System.out.println(dice1 + " "+ dice2);
//		}while(dice1 != dice2);
		
//		----------------------------------------------
		
		while(true) {
			int d1 = (int)(Math.random() * 6)+1;
			int d2 = (int)(Math.random() * 6)+1;
			System.out.println(d1 + " "+ d2);
			if(d1 == d2)
				break;
		}
		
		
	}

}
