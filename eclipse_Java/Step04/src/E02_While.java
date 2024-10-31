
public class E02_While {

	public static void main(String[] args) {
		
//		1 ~ 100까지 출력
		
//		case 1
		int i = 0;
		while(i < 100) { 
			i++; // 0부터 시작 증감을 먼저 해서 1부터 보이게 
			System.out.print(i + " ");
		}
		System.out.println();
		
//		case 2
		int n = 1;
		while(n <= 100) { // n = 1 부터 진행 했을경우
			System.out.print(n + " ");
			n++;
		}
		
		System.out.println();
		
//		case 3
		int y = 0;
		while(y != 100) {
			++y;
			System.out.print(y + " ");
		}
		System.out.println();
		
//		case 4
		int t = 0;
		while(t++ < 100) {
			System.out.print(t + " ");
		}
		System.out.println();
		
//		case 5
		int z = 0;
		while(z < 100) {
			System.out.print(++z + " ");
		}
		
		
		
		
	}

}
