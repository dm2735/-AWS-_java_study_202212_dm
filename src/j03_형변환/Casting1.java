package j03_형변환;

public class Casting1 {

	public static void main(String[] args) {
		// 업캐스팅 ? 문자 < 정수 < 실수
		
		char a = 'a';
		int num_1 = a;
		
		System.out.println(a);
		System.out.println(num_1);
		
		System.out.println((int) a); // 형변환
		System.out.println((double) a);
		System.out.println((char) 97);
		System.out.println((byte) 300);
	}

}
