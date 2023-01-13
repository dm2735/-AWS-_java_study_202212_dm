package J17_스태틱;

public class carMain {
	public static void main(String[] args) {
		Car[] car1 = new Car[5];

		car1[0] = new Car("K3");
		car1[1] = new Car("K5");
		car1[2] = new Car("K7");
		car1[3] = new Car("K9");
		car1[4] = new Car("스포티지");

//		for (int i = 0; i < car1.length; i++) {
//			System.out.print(car1[i]);
//		}

		for (Car c : car1) {

			System.out.println(c);
		}
	}

}
