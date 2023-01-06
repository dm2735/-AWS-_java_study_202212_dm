package j08_반복문;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int startNumber = 0;
		int endNumber = 0;		
		
		System.out.print("시작: ");
		startNumber = scanner.nextInt();
		
		System.out.print("끝: ");
		endNumber = scanner.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < endNumber - startNumber + 1; i++ ) {
			
			sum  += i + startNumber ;
										
		}
					System.out.println("총합: " + sum);	
		
			}	
		    
		
	}


