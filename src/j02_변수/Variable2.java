package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '동';
		char firstName2 = '민';
		
		char alphabetA = 'A';
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳A:" + alphabetA);
		
		
		/*아스키코드
		 * 0~127 
		 */
		
		System.out.println(alphabetA);
		System.out.println(alphabetA + 1 ); 
		System.out.println(alphabetA + 'B');
		System.out.println("\uAC00");
		System.out.println(firstName1 + 0);
	
	}

}
