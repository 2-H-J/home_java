package e01_generic;
/*
	Box 클래스
		모든 데이터 타입을 보관할 수 있는 변수를 하나 선언해서 보관
*/
public class Box {
	
	private Object obj;

	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
}
