package e03_constructor;

public class CompanyMain {

	public static void main(String[] args) {
		Company cp1 = new Company("철강소", "02-123-1234", 300, "https://home.com");
		
		Company cp2 = new Company("목공소", "031-123-1234");
		
		System.out.println(cp1);
		System.out.println(cp2);
		
		cp1.toString();
		
	}
	
}
