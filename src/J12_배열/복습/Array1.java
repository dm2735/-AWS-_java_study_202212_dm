package J12_배열.복습;


public class Array1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		int[] nums2 = new int[] {10, 20, 30, 40, 50};
		
		int[] nums3 = {10, 20, 30, 40, 50} ; // 처음 초기화할 때 or 배열일 때에 뒤에 new int[] 는 생략가능하다.
		
		System.out.println((new int[] {10,20,30,40,50})[0]);
		

	}

}
