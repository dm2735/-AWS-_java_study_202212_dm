package J16_Object;

import java.util.Objects;

public class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		// Object 클래스는 모든 클래스의 최상위에 있다.
		// 따로 생성하지 않아도 상속되어있다.
		this.name = name;
		this.age = age;

	}

	@Override                      // 오브젝트 클래스에서 오버라이딩을 해준다.
	public int hashCode() {

		return Objects.hash(name, age);
	}

	@Override                     // 오브젝트 클래스에서 오버라이딩을 해줌
	public boolean equals(Object ob) {
		if (this == ob) {       // this는 Student 클래스에서의 전역변수를 의미한다.
			return true;        // 
		}
		if (ob == null) {
			return false;
		}

		if (!(ob.getClass() == Student.class)) {

			return false;
		}

		Student s = (Student) ob; //다운캐스팅

		boolean result = name.equals(s.name) && age == s.age;

		return result;
	}

	@Override
	public String toString() {

		return "이름:" + name + "\n나이" + age;
	}

}
