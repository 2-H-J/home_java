package e01_string;

public class StringBuildTest {

	public static void main(String[] args) {
//		작업이 이뤄지면 메모리를 새로 만들어 저장한다
		String str = "     Hello     ";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str += 100;
		System.out.println(str); 
		System.out.println(System.identityHashCode(str));
		
		str = str.replace("l", "a");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println("---------------------------");
		//-----------------------------------------------
		// StringBuilder : 저장한 문자열 메모리를 계속 사용할 수 있게
		StringBuilder builder = new StringBuilder("Hello");
		System.out.println(System.identityHashCode(builder));
		
		builder.append("AAAA"); // 문자열 뒤에 AAAA를 추가
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.replace(0, 4, "BBBB"); // 문자열 앞 인덱스 0 부터 4까지 해당 문자열로 A로 변경
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.delete(0, 4); //문자열 앞 인덱스 0부터 4까지 삭제
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("---------------------------");
		//-----------------------------------------------
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append("TEST");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		
		int[][] arr = new int[5][5];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.printf("%2d "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
