package e02_random;

import java.util.Arrays;
import java.util.Random;

public class GachaBox {
	private final int[] GRADE_EA;
	private int BOX_EA = 10000;
	
	public GachaBox() {
		GRADE_EA = new int[] {
			(int)(0.04 * BOX_EA),
			(int)(0.18 * BOX_EA),
			(int)(0.78 * BOX_EA)
		};
	}
	
	public String[] generateGachaBox() {
		//가챠 박스
		String[] arr = new String[BOX_EA];
		//아이템
		String[] grade = {"특수", "달인", "정예"};
		
		for(int i=0, idx = 0;i<grade.length;i++) {
			for(int j=0;j<GRADE_EA[i];j++)
				arr[idx++] = grade[i];
		}
		Random r = new Random();
		//arr내용을 랜덤으로 섞음
		for(int i=0;i<arr.length;i++) {
			int n = r.nextInt(arr.length);
			String temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		return arr;
	}
	
	public String[] drawItem(int ea) {
		final String[] gacha = generateGachaBox();
		//결과값 리턴할 배열
		String[] result = new String[ea];
		//원하는 개수만큼 뽑아서 배열로 만들고
		//뽑은 결과를 리턴
		Random r = new Random();
		for(int i=0;i<ea;i++) {
			//0~gacha 길이 - 1 숫자를 랜덤으로 뽑음 - 인덱스
			int n = r.nextInt(ea);
			//해당 gacha 배열의 위치값이 null 이미 뽑힌값
			//인덱스 번호를 다시 뽑음
			if(gacha[n] == null) {
				i--;
				continue;
			}
			
			result[i] = gacha[n];
			gacha[n] = null;
		}

		return result;
	}
	
	public static void main(String[] args) {
		GachaBox box = new GachaBox();
		for(int i=0;i<10;i++) {
			String[] arr = box.drawItem(10);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
}