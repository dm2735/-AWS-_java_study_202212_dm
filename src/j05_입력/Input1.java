package j05_입력;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterIsAcceptingJobs;

public class Input1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		int inputNum = 0;
		char inputNum2 = 0;
		int inputNum3 = 0;
		int inputNum4 = 0;
		int inputNum5 = 0;
		
	
        System.out.print("입력1: ");
		inputNum = scanner.nextInt();
		System.out.print("입력2: ");
		inputNum2 = scanner.next().charAt(0);
		System.out.print("입력3: ");
		inputNum3 = scanner.nextInt();
		System.out.print("입력4: ");
		inputNum4 = scanner.nextInt();
		System.out.print("입력5: ");
		inputNum5 = scanner.nextInt();
		System.out.println("입력값:" + (inputNum + inputNum2 + inputNum3 + inputNum4 + inputNum5));
		
		String ant = new String ("가나다라");
		System.out.println(ant);
				

}

}	