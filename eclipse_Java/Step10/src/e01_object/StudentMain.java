package e01_object;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("1111", "홍길동", "컴공", 2.5);
		Student s2 = new Student("1111", "홍길동", "컴공", 2.5);
		Student s3 = new Student("2222", "둘리", "법학", 2.5);
		Student s4 = s3;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
	}

}
