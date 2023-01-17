package 연습;

import java.util.Scanner;

public class 메뉴_연습 {

	// Ctrl + Shift + F = 줄정리
	// Ctrl + Shift + P = 해당 괄호 이동
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean loop1 = true;

		while (loop1) {
			char select = ' ';

			System.out.println("========<<식당>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 중국반점");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("========================");

			System.out.print("식당 선택: ");
			select = scanner.next().charAt(0);

			if (select == 'q' || select == 'Q') {
				System.out.println("프로그램 종료");
				loop1 = false;
			} else if (select == '1') {

				boolean loop2 = true;

				while (loop2) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 김밥");
					System.out.println("2. 돈가스");
					System.out.println("3. 떡볶이");
					System.out.println("4. 라면");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("========================");

					System.out.print("메뉴선택: ");
					select = scanner.next().charAt(0);

					if (select == 'b') {
						loop2 = false;
					} else if (select == '1' || select == '2' || select == '3' || select == '4') {
						System.out.println("주문이 완료되었습니다.");
						loop2 = false;
					}

				}

			} else if (select == '2') {
				boolean loop3 = true;
				while (loop3) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 짜장면");
					System.out.println("2. 짬뽕");
					System.out.println("3. 깐풍기");
					System.out.println("4. 탕수육");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("========================");

					System.out.print("메뉴선택: ");
					select = scanner.next().charAt(0);

					if (select == 'b') {
						loop3 = false;
					} else if (select == '1' || select == '3' || select == '4') {
						System.out.println("주문이 완료되었습니다.");
						loop3 = false;
					} else if (select == '2') {
						boolean loop4 = true;
						while (loop4) {
							System.out.println("1. 순한맛");
							System.out.println("2. 매운맛");
							System.out.println("b. 뒤로가기 ");
							System.out.print("맵기선택: ");

							select = scanner.next().charAt(0);

							if (select == '1' || select == '2') {
								System.out.println("주문이 완료되었습니다.");
								loop4 = false;
								loop3 = false;

							} else if (select == 'b') {
								loop4 = false;
							}

						}

					}

				}

			}
			if (select == '3') {
				boolean loop5 = true;
				while (loop5) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 소고기 덮밥");
					System.out.println("2. 장어 덮밥");
					System.out.println("3. 두루치기 덮밥");
					System.out.println("4. 낙지 덮밥");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("========================");

					System.out.print("메뉴선택: ");
					select = scanner.next().charAt(0);

					if (select == '1' || select == '2' || select == '3' || select == '4') {
						System.out.println("주문이 완료되었습니다.");
						loop5 = false;
					} else if (select == 'b') {
						loop5 = false;
					}

				}
			}
			if (select == '4') {
				boolean loop6 = true;

				while (loop6) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 된장찌개");
					System.out.println("2. 김치찌개");
					System.out.println("3. 순두부찌개");
					System.out.println("4. 두루치기 정식");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("========================");
					System.out.print("메뉴 선택: ");
					select = scanner.next().charAt(0);

					if (select == '1' || select == '2' || select == '3' || select == '4') {
						System.out.println("주문이 완료되었습니다.");
						loop6 = false;
					} else if (select == 'b') {
						loop6 = false;

					}

				}

			}

		}

	}
}