package J17_스태틱;

public class StaticMaim {
	
	public static void main(String[] args) {
		
		TestA a = new TestA();
		
		System.out.println("출력1:" + TestA.getNum());
		System.out.println();
		
		TestA.setNum(100);
		System.out.println("출력1:" + TestA.getNum());
		
		
		
		System.out.println("출력1:" + a.getNum());
		System.out.println();
		
		TestA.setNum(100);
		System.out.println("출력1:" + a.getNum());
		
		

	}
}
