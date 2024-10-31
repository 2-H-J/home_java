package e03_constructor;

public class Company {

	String companyName;
	String companyTel;
	int employeeCount;
	String companyURL;

	public Company(String companyName, String companyTel, int employeeCount, String companyURL) {
		this.companyName = companyName;
		this.companyTel = companyTel;
		this.employeeCount = employeeCount;
		this.companyURL = companyURL;
	}

	public Company(String companyName, String companyTel) {
		// this. : 자기 자신 객체를 나타내는 키워드 / 매개변수와 필드명이 같으면 사용
		this(companyName, companyTel, 100, "https://test.com"); // this() 다른 객체를 선언 하지 않아도 다른 생성자도 옆과 같이 호출 할 수 있다.
	}
	

	public String toString() { // 알트 + 쉬프트 + S = toString
		return "Company [companyName = " + companyName + ", companyTel = " + companyTel + ", employeeCount = "
				+ employeeCount + ", companyURL = " + companyURL + "]";
	}
	
	

}