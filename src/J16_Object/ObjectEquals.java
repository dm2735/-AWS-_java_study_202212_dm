package J16_Object;

public class ObjectEquals {

	public static void main(String[] args) {
		String name1 = "김준일";
		String name2 = "김준일";
		
		String name3 = new String("김준일");
		
		System.out.println(name1);
		System.out.println(name2);
		
		System.out.println(name1 == name2); // 주소값 비교
		System.out.println(name1 == name3);
		
		System.out.println(name1.equals(name3)); 
	////////////////////////////////////////////////////////////
		
		Object obj = null;
		Student s1 = new Student("박은빈", 24);
		Student s2 = new Student("박은빈", 24);
		SubStudent s3 = new SubStudent("박은빈",24);
		obj = s1;
		System.out.println(s1 == s2);		
		System.out.println(s1.equals(null));

		System.out.println(obj.getClass() == SubStudent.class);
		
	}

}
