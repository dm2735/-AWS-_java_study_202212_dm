package J12_배열;

import java.util.Random;

public class 연습장 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] nums = new int[10]; // 10개의 공간을 만들어준다.

		for (int i = 0; i < nums.length; i++) {
			while (true) {
				boolean findFlag = true;

				int randomNum = random.nextInt(nums.length) + 1;

				for (int j = 0; j < nums.length; j++) {
					if (nums[j] == randomNum) {
						findFlag = false;
						break; // for문을 멈춰주는 브레이크
					}
				}

				if (findFlag) {
					nums[i] = randomNum;
					break; // while을 멈춰주는 브레이크
				}

			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
