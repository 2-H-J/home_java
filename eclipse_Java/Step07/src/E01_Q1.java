
public class E01_Q1 {

	public static void main(String[] args) {
		  int n = 5;  // 5x5 배열변수
	        int[][] snail = new int[n][n];  // 2차원 배열 생성

	        int num = 1;  // 배열에 넣을 숫자
	        int row = 0, col = 0;  // 시작 위치는 (0,0)
	        int direction = 0;  // 0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위
	        int[] dr = {0, 1, 0, -1};  // 행의 변화 (오른쪽, 아래, 왼쪽, 위)
	        int[] dc = {1, 0, -1, 0};  // 열의 변화 (오른쪽, 아래, 왼쪽, 위)

	        while (num <= n * n) {
	            snail[row][col] = num++;  // 현재 위치에 숫자 채우기
	            int nextRow = row + dr[direction];
	            int nextCol = col + dc[direction];

	            // 배열 끝에 도달하거나, 이미 숫자가 있는 칸이면 방향을 바꿈
	            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || snail[nextRow][nextCol] != 0) {
	                direction = (direction + 1) % 4;  // 방향 변경 (오른쪽 -> 아래 -> 왼쪽 -> 위)
	                nextRow = row + dr[direction];
	                nextCol = col + dc[direction];
	            }
	            row = nextRow;
	            col = nextCol;
	        }

	        // 배열 출력
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(snail[i][j] + "\t");  // 탭으로 간격 맞추기
	            }
	            System.out.println();
	        }
	}

}
