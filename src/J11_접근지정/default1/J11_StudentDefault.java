package J11_접근지정.default1;

public class J11_StudentDefault {

	private String name;
	public int age;

	public J11_StudentDefault() {
		System.out.println("기본 생성자");
	}

	J11_StudentDefault(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
	//Getter
	public String getName() {
		return name;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
}
