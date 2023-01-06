package j08_반복문;

public class Method2 {
	
	//클래스 안에 있으면 Method , 바깥에 있으면 함수 
	
	//매개변수: x, 반환: x
	public static void method1() {
		System.out.println("단순 실행");
	}
	
	//매개변수: int, 반환: x
	public static void method2(int num) {
		System.out.println("num: " + num);
		System.out.println();
	}
	
	//매개변수: int 두개 입력, 반환: x
	public static void method3(int num, int num2) {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println();
		
	}
	//void가 아니라String으로 잡아준다.
	public static String method4() {
		return "데이터 반환";
	}
	
	public static String method5(int age) {
		return age + "살";
		
	}
	public static void main(String[] args) {
		method1(); // 함수 호출
		method2(10);
		method3(200,300);
		System.out.println(method4());
		
		System.out.println();
		
		String data1 = method4();
		System.out.println(data1);
		
		System.out.println();

		System.out.println(method5(30));
		System.out.println();
	}

}
