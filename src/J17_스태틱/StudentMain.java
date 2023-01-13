package J17_스태틱;

public class StudentMain {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		Teacher[] teachers = new Teacher[5];

		students[0] = new Student("이현수");
		students[1] = new Student("김재영");
		students[2] = new Student("이상현");
		students[3] = new Student("박성진");
		students[4] = new Student("윤선영");

		teachers[0] = new Teacher("김준일");
		teachers[1] = new Teacher("김준이");
		teachers[2] = new Teacher("김준삼");
		teachers[3] = new Teacher("김준사");
		teachers[4] = new Teacher("김준오");

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].toString()); // .toString은 생략가능
			System.out.println(teachers[i]); //
		}

		/* int j = 0;
		 * for(Student student : students) { // for : each는 인덱스가 없어서 이중for문을 사용할 수 없다
		 * System.out.println(student); 
		 * System.out.println(teachers[j]);
		 * j++;
		 * }
		 */

		System.out.println(Student.getAutoIncrement());

	}

}
