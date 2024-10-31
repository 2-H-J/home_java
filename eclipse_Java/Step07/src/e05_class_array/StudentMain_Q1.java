package e05_class_array;

public class StudentMain_Q1 {

	public static void main(String[] args) {
		Student_Q1[] arr = new Student_Q1[5];
		
		arr[0] = new Student_Q1("20120123", "김씨", "컴공", 3.5);
		
		System.out.println(arr[0]);
		System.out.println(arr[0].toString());
	}
	
	
}
