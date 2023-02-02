package 연습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1001, "홍길동"));
		students.add(null);
		students.add(new Student(1003, "김영희"));
		try {
			for (Student student : students) {
				student.showStudent();
			}
		} catch (NullPointerException e) {
			
		 	
		}
		
	}

}
