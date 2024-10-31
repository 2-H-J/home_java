package e04_object_io;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	//transient : 직렬화 대상에서 제외, 파일에 저장하지 않게 제외
	private transient int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
