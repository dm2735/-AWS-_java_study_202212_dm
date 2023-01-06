package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String str1;
		String str2;
		int number1;
		double number2;
		
		System.out.print("문자열1: ");
		str1 = scanner.nextLine(); // 띄어쓰기  O
		
		System.out.print("문자열2: ");
		str2 = scanner.next();   // 띄어쓰기  X
		
		System.out.print("정수: ");
		number1 = scanner.nextInt();
		
		System.out.print("실수: ");
		number2 = scanner.nextDouble();
		
	}

}
