package J24_람다;

public class Lamda1 {
	
	public static void main(String[] args) {
		Instrument instrument = new Instrument() {
			
			@Override
			public String play(String instrument) {
				
				return instrument + "을(를) 연주합니다.";
			}
			
		};
		
		// 람다를 쓸 수 있는 조건
		// 람다를 쓸 수 있는 인터페이스는 무조건 (추상)메소드를 딱 하나만 가지고 있어야 한다.
		
		Instrument instrument2 = (String itm) -> {
			return itm + "을 연주합니다";
		};
		
		//사용할 인터페이스 안에 추상메소드는 한개 뿐이기 떄문에 매개변수의 자료형을 생략할 수 있다.
		//매개변수의 이름을 바꿀 수 있다. 
		Instrument instrument3 = (a) -> {
			return a + "을 연주합니다";
		};
		
		
		//매개변수가 하나!! 이면 매개변수를 감싸는 괄호를 생략할 수 있다.		
		Instrument instrument4 = a -> {
			return a + "을 연주합니다";
		};
		
		//구현부의 명령이 하나일 때 중괄호를 생략할 수 있다. (중괄호를 생략하게 되면 리턴을 적어주면 안된다.)
		//이때 리턴자료형이 정해져있으면 리턴값으로 사용이 된다.
		Instrument instrument5 = a ->  a + "을 연주합니다";
				
		
		//외부에서 사용하던 지역변수를 람다 안에서 쓸 수 있다는 장점이 있다.
		//익명클래스와 동일하다 (= 한번만 사용한다.)
		//하지익명클래스는 메소드를 여러개 정의해서 쓸 수 있다는 장점이 있다. 
		int result = 10 + 20;
		Instrument instrument6 = a ->  a + "을 연주합니다" + result;
		
		

		
		System.out.println(instrument2.play("피아노") );
		
		String playText = instrument2.play("드럼");
		System.out.println(playText);
		
		
		System.out.println(instrument6.play("기타"));
		
	
	}

}
