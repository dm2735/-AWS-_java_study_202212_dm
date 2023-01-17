package J22_익명클래스;

public class Main {

	public static void main(String[] args) {
		
		
		Addition c1 = new Addition();
	
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
