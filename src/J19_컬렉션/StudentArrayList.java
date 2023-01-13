package J19_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentArrayList {
	/*
	 * public static void updateYear( List<Student> students, String searchName, int
	 * newYear) {
	 * 
	 * for(Student student : students) { if(student.getName().equals(searchName)) {
	 * student.setYear(newYear); return; } }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Student> students = new ArrayList<>();
		students.add(new Student("김종환", 1));
		students.add(new Student("고병수", 2));
		students.add(new Student("손민재", 3));
		students.add(new Student("황창욱", 4));

		/*
		 * System.out.printf("이름을 입력하세요: "); String searchName =
		 * scanner.next().toString();
		 * 
		 * 
		 * boolean flag = true; 
		 * for (int i =0; i < students.size(); i++) { 
		 * Student student = students.get(i); 
		 * if(student.getName().equals(searchName)) {
		 * student.setYear(4); flag = false; break; 
		 * } 
		 * } if(flag) {
		 * System.out.println("검색 실패"); 
		 * } 
		 * System.out.println(students);
		 * updateYear(students, "황창욱", 1); 
		 * System.out.println(students);
		 */

		System.out.printf("이름을 입력하세요: ");
		String searchName = scanner.next().toString();

		boolean flag = true;

		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(searchName)) {

				students.get(i).setYear(4);
				System.out.println(students.get(i));

				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("검색실패");

		}

		// 이름이 searchName 학생을 찾아서 학년을 4학년으로 바꿔라
		// 만약 동일한 이름이 없으면 "검색 실패" 메세지 출력

	}

}
