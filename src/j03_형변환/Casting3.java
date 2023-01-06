package j03_형변환;

public class Casting3 {

	public static void main(String[] args) {
		double kor = 87.5;
		double eng = 95.7;
		double math = 80.5;
		
		int total;
		double avg;
		
		total = (int) kor + (int) eng + (int) math;
		avg = (double) total / 3.0;
		
		System.out.println("총점:" + total);
		System.out.println("평균:" + avg);		
	}

}
