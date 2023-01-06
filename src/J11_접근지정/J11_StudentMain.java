package J11_접근지정;

import J11_접근지정.default1.J11_StudentDefault;

public class J11_StudentMain {

	public static void main(String[] args) {
		
		J11_Student s1 = new J11_Student();
		s1.name = "김동민";

		s1.printInfo();
		
		J11_StudentDefault s2 = new J11_StudentDefault();
		
		
		
		System.out.println("이름 : " + s2.getName());
	}

}
