package J09_클래스;

public class J09_StudentMain {
		public static void main(String[] args) {			
		// 자료형     변수명          값(생성자)
		J09_Student s1 = new J09_Student();  //생성자는 클래스명과 일치한다 (불변)
		J09_Student s2 = new J09_Student();  //형태는 메소드 형태로 !
		
		s1.name = "김준일";
		s1.age = 30;
		
		s1.printInfo();
		
		s2.printInfo();
				
			}

}
