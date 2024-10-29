package e04_access;

/*
 * 삼각형 클래스

	가로길이, 높이
	생성자로 초기화
	삼각형 넓이 리턴하는 메서드
	삼각형 정보 출력
	- 가로, 높이, 넓이
	필드는 private
	가로, 높이 set/get 메서드 작성
*/
public class Triangle {
	private double width;
	private double height;
	
	private Triangle(double width, double height) { // 생성자가 private 이면 외부에서 생성이 안된다
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	 
	public double getArea() {
		return (width * height) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [ width = " + width + ", height = " + height + ", getArea() = " + getArea() + "]";
	}
}
