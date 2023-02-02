package 연습;

import java.util.Arrays;
import java.util.List;

class Calculator {
	private List<String> subjects;

	public Calculator(List<String> subjects) {
		this.subjects = subjects;
	}

	public void showSubjects() {
		int length = 4;
		try {
			for (int i = 0; i < length; i++) {
				System.out.println(subjects.get(i));
			}
		} catch (IndexOutOfBoundsException e) {

		}

	}
}

public class Main3 {
	public static void main(String[] args) {
		List<String> subjects = Arrays.asList(new String[] {"C", "Java", "Python"});
		
		Calculator subjectService = new Calculator(subjects);
		subjectService.showSubjects();
	}
}
