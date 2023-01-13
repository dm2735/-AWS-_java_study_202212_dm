package J14_추상;

public class Main {

	public static void main(String[] args) {
		Transportation transportation = new Airplane();
		Transportation transportation2 = new Subway();
		
		transportation2.go();
	}

}
