package J24_람다;
@FunctionalInterface             // 이것은 람다용 인터페이스다 라고 지정해준다. 메소드 두개를 쓰게 되면 빨간 줄이 뜬다.
public interface Instrument {
	
	public String play(String instrument);
		
	
	//default 메소드는 구현된 메소드이기 떄문에 몇개를 써도 영향을 주지 않는다.
	public default void testPrint() {
		System.out.println("테스트");
	}
	}


