package J17_스태틱;

public class Student {
	
	private static final int CODE = 20230000;
	private static int ai = 1;  // auto_increment
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = CODE + ai;
		ai++;
		this.name = name;
		
	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 AI : " + ai);
	
		return ai;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	
}
