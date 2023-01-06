package j08_반복문;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		// 1 ~ 100 까지 더하기
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
			
			
			
			
	
		
	
		/*for (int i = 0; i <10; i++ ) {
			for(int a = 0; a < 10; a++) {
				
				int b = 0;
				
				b = i * a ;
				
				System.out.println(i + "*" + a + "=" + b);
				*/



/**/