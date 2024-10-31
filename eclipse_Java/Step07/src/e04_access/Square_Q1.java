package e04_access;

/*
사각형 클래스
가로길이, 세로길이
생성자로 초기화
사각형 넓이 리턴하는 메서드
사각형 정보 출력
	- 가로길이, 세로길이, 넓이
필드는 private

가로길이 세로길이 get/set 메서드
*/
public class Square_Q1 {
	private double width;
	private double height;

	// 접근 제어자 : [static] [final] 리턴타입 메서드명() / []은 선택
	public Square_Q1(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// Alt + Shift + s -> r / 인텔리제이 : Alt + Insert 중 선택
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
	
	public double squarArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "[ width = " + width + " / height = " + height + " / squarArea() = " + squarArea() + "] ";
	}
	/*
	 *  
	*/	
}
