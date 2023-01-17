package 연습;

public class 다이아몬드연습 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 17 - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
