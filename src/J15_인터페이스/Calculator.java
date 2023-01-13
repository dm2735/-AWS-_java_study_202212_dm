package J15_인터페이스;

public interface Calculator {
	
	public int ERROR = -9999999;
	
	public double plus(double x, double y);
	
	public double minus(double x, double y);
	
	
	//일반 메소드를 사용하고 싶으면 default 를 넣어라.
	//맴버변수는 가질 수 없다. Only 상수만 가질 수 있다.
	public default double multiplication(double x, double y) {
		
		return x * y;
	}
	
	public double division(double x, double y);

}
