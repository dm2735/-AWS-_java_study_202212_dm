package J16_Object;

public class ToString {

	public static void main(String[] args) {
		
		
		Student student = new Student("조병철",34);
		Student student1 = new Student("김동민",28);
		Student student2 = new Student("김두영",28);
		Student student3 = new Student("강의진",29);
		
		String str = student1.toString();
		
		System.out.println(str);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println();
		
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
	
		
	}

}
