package J22_익명클래스;

public class Main {

	public static void main(String[] args) {
		
		
		Calculator c1 = new Addition(); 					 //Calculator 를 생성하려고 하는대 Calculator은 인터페이스라 생성할 수 가 없다.
															//그래서 Addition 클래스를 만들어주고 Calculator를 상속받게 해주고 오버라이드 해준다.
		System.out.println(c1.calc(10, 20));
		
////////////////////////////////////////////////////////////
	//1회성으로 사용할 클래스는 1회성 익명 클래스로 구현한다.
		Calculator c2 = new Calculator() {                   
			
			@Override
			public int calc(int x, int y) {
				return x-y;
			}
		
	};
	System.out.println(c2.calc(200, 100));
	
}
}
