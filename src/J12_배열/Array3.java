package J12_배열;

import java.util.Random;

public class Array3 {

	public static void main(String[] args) {

		Random random = new Random();

		int[] nums = new int[10];

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < i; j++) {
				
				nums[i] = (random.nextInt(nums.length) + 1);
				
				if(nums[j] == nums[i]) { 
					continue;
				}

			}

		}

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
