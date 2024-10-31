package test1;

public class Man {
	
	// 멤버변수
	int age;
	String name;
	boolean married;
	int children;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}

	public void Info() {
		String mar;
		if(married != true) {
			mar = "안";
		}else {
			mar = "했";
		}
		String chi = null;
		switch (children) {
		case 1 :
			chi = "하나";
			break;
		case 2 :
			chi = "둘";
			break;
		case 3 :
			chi = "셋";
			break;
		}
		
		System.out.println("나이가 "+age+"살, 이름이 "+name+"라는 남자가 있습니다. 이 남자는 결혼을 "+mar+"고, 자식이 "+chi+" 있습니다.");
	}
	

}
