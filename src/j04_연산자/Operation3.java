package j04_연산자;

/*
 * 논리연산자 0이 아니면 모두 참이다.
 * 
 * AND (곱) T && T = 1 , T && F = 0
 *  
 * OR (합) T || T = 1, T || F = 1,  F || F = 0
 * 
 * NOT (부정) !T
 * 
 */

public class Operation3 {

	public static void main(String[] args) {
	int num = 10;
		
	boolean flag1 = true;
	boolean flag2 = true;
	boolean flag3 = num % 2 == 1;
	
	System.out.println(flag1 && flag2);
	System.out.println(flag1 && flag3);
	System.out.println(flag2 || flag3);
	System.out.println(!(flag2 || flag3 && flag1));
	

	}

}
