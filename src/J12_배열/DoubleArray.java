package J12_배열;

public class DoubleArray {

	public static void main(String[] args) {

		int num = 0;

		int[] nums = new int[2];

		int[][] d_nums = new int[3][2];

		d_nums[0][0] = 1;
		d_nums[0][1] = 2;

		d_nums[1][0] = 1;
		d_nums[1][1] = 4;

		d_nums[2][0] = 6;
		d_nums[2][1] = 9;

		//for (int i = 0; i < 2; i++) {
		//	for (int j = 0; j < 3; j++) {
		//		System.out.println(d_nums[j][i]);

		//	}
		//}

		int[][] d_nums2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				System.out.println(d_nums2[i][j]);

//			}

//		}

		System.out.println(d_nums2[1].length);

		for (int i = 0; i < d_nums2.length; i++) {
			for (int j = 0; j < d_nums2[i].length; j++) {
				System.out.println();

			}
		}

	}
}
