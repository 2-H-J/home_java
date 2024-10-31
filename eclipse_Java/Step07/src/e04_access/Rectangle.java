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
package e04_access;

import java.util.Scanner;

public class Rectangle {
	Scanner sc = new Scanner(System.in);
	// 필드 private
	private double width; // 가로 길이
	private double height; // 세로 길이

// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

//	가로(밑변) get/set
	public double getWidth() {
		return width;
	}
	// 외부에서 입력 받은 가로 값
	public void setWidth(double width) {
		System.out.print("밑변 : ");
		width = sc.nextDouble();
		this.width = width;
	}

//	세로 get/set
	public double getHeight() {
		return height;
	}
	// 외부에서 입력 받은 세로 값
	public void setHeight(double height) {
		System.out.print("세로 : ");
		height = sc.nextDouble();
		this.height = height;
	}

	// 외부로 반환 넓이를 구한 메서드
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() { 
		return "넓이 [가로 = " + width + ", 세로 = " + height + ", 넓이  = " + getArea() + "]";
	}
	
	

	
}
