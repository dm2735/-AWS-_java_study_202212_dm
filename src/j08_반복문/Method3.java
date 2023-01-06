package j08_반복문;

public class Method3 {
	
	//메소드 오버로딩 : 메소드명은 같지만 매개변수가 다름.
	//메소드 오버라이딩 : 덮어쓰기 (재정의)
	
	public static void ov1() {
		System.out.println("매개변수 없음.");
	}
	
	public static void ov1(int a) {
		System.out.println("매개변수 int");
		
	}
	public static void ov1(int a, String b) {
		System.out.println("int 먼저 그 다음 String");
	}
	
	public static void ov1(String a, int b) {
		System.out.println("String 먼저 그 다음 int");
	}
	
	public static void main(String[] args) {
		ov1(10);
		
	}

}
