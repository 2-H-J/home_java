package e01_object;

public class Circle implements Cloneable{
	
	private Point pos;
	public int r;
	
	// 필드 초기화 생성자
	public Circle(Point pos, int r) {
		super();
		this.pos = pos;
		this.r = r;
	}

	// set/get
	public Point getPos() {
		return pos;
	}
	public void setPos(Point pos) {
		this.pos = pos;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	//clone
	public Circle clone() {
			Point p = pos.clone(); // 참조형 데이터도 먼저 복제
			return new Circle(pos, r);
	}

	// toString
	@Override
	public String toString() {
		return "Circle [ pos = " + pos + " | r = " + r + " ]";
	}
	
	
}
