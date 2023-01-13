package windowBuilder;

import java.util.Random;

public class B {
	public static void manin(String[] args) {
		Random random = new Random();
		System.out.println("결과는");

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			while (true) {
				boolean findFlag = true;

				int randomNum = random.nextInt(num.length) + 1;

				for (int j = 0; j < num.length; j++) {
					if (num[j] == randomNum) {
						findFlag = false;
						break;
					}

				}

				if (findFlag) {
					num[i] = randomNum;
					break;
				}

			}

		}
		for (int i = 0; i < 1; i++) {
			if (num[i] / 2 == 0) {
				System.out.println("Banker");
			} else if (num[i] / 2 == 1) {
				System.out.println("Player");
			}
		}
	}

}
