package j08_반복문;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*String name = "김준일";
		System.out.println(name.charAt(0)); */
		
		boolean loopFlag1 = true;
				
		while(loopFlag1) {  						//loopFlag = true이니까 while문 실행
			char select = ' ';
			
			System.out.println("========<<식당>>========");
			System.out.println("1. 김밥천국");
			System.out.println("2. 탄탄면");
			System.out.println("3. 홍대개미");
			System.out.println("4. 밥앤밥");
			System.out.println("========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("========================");
			
			System.out.print("식당 선택: ");
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == '0') {
				loopFlag1 = false;
			}
			
				else if (select == '1') {
					boolean loopFlag2 = true;
				
					while (loopFlag2) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 김밥");
					System.out.println("2. 라면");
					System.out.println("3. 떡볶이");
					System.out.println("4. 돈가스");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
			
					System.out.print("메뉴 번호 선택: ");
					select = scanner.next().charAt(0);
				
					if(select == 'b') {
					loopFlag2 = false;
					}else if(select == 'q' || select =='Q') {
						loopFlag1 = false;
						loopFlag2 = false;
					}else if (select == '1') {
						System.out.println("라면을 선택했습니다.");
					}else if (select == '2') {
						System.out.println("탄탄면을 선택했습니다.");
					}else if (select == '3') {
						System.out.println("홍대개미을 선택했습니다.");
					}else if (select == '4') {
						System.out.println("밥앤밥을 선택했습니다.");
					}else {
						System.out.println("");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("샤용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					}
				}
			
			
			}else if(select == '2') {
				boolean loopFlag3 = true;
				while(loopFlag3) { 
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 땅콩소스");
					System.out.println("2. 빨간소스");
					System.out.println("3. 마라소스");
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
					
					System.out.println("메뉴 선택");
					select = scanner.next().charAt(0);
					
					if(select == 'b') { 
						loopFlag3 = false;
					}else if (select == 'q'|| select == 'Q') {
						loopFlag3 = false;
						loopFlag1 = false;
					}else if (select == '1') {
						System.out.println("땅콩소스를 선택했습니다.");
						loopFlag3 = false;
						loopFlag1 = false;
					}else if (select == '2') {
						System.out.println("빨간소스를 선택했습니다.");
						loopFlag3 = false;
						loopFlag1 = false;
					}else if (select == '3') {
						System.out.println("마라소스 선택했습니다.");
						loopFlag3 = false;
						loopFlag1 = false;
					}else {
						System.out.println("");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("샤용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
					
					}
					
				}
			}
			else if(select == '3') {
				boolean loopFlag4 = true;
				while(loopFlag4) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 소고기 덮밥");
					System.out.println("2. 장어 덮밥");
					System.out.println("3. 낙지 덮밥");
					System.out.println("4. 두루치기 덮밥");		
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
					
					System.out.println("메뉴 선택");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag4 = false;
					}else if (select == 'q' || select == 'Q') {
						loopFlag4 = false;
						loopFlag1 = false;
					}else if (select == '1') {
						System.out.println("소고기 덮밥을 선택했습니다.");
						loopFlag4 = false;
						loopFlag1 = false;
					}else if (select == '2') {
						System.out.println("장어 덮밥을 선택했습니다.");
						loopFlag4 = false;
						loopFlag1 = false;
					}else if (select == '3') {
						System.out.println("낙지 덮밥을 선택했습니다.");
						loopFlag4 = false;
						loopFlag1 = false;
					}else if (select == '4') {
						System.out.println("두루치기 덮밥을 선택했습니다.");
						while(loopFlag4) {
							System.out.println("1. 순한맛");
							System.out.println("2. 매운맛");
							System.out.println("b. 뒤로가기");
							
							System.out.println("메뉴 선택");
							select = scanner.next().charAt(0);
							if(select == '1') { 
								System.out.println("순한 맛을 선택했습니다.");
								loopFlag4 = false;
								loopFlag1 = false;
							}
							else if (select == '2') { 
								System.out.println("매운 맛을 선택했습니다.");
								loopFlag4 = false;
								loopFlag1 = false;						
							}
							else if (select =='b') {
								loopFlag4 = false;
							}
						}
					}else {
						System.out.println("");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
						System.out.println("샤용할 수 없는 번호입니다.");
						System.out.println("다시 입력하세요.");
						System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
				}
				
		}
			}		
			else if(select == '4') {
				boolean loopFlag5 = true;
				while (loopFlag5) {
					System.out.println("========<<메뉴>>========");
					System.out.println("1. 된장찌개");
					System.out.println("2. 김치찌개");
					System.out.println("3. 순두부찌개");
					System.out.println("3. 두루치기 정식");		
					System.out.println("========================");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("========================");
					
					System.out.println("메뉴 선택");
					select = scanner.next().charAt(0);
					
					if (select == 'b') {
						loopFlag5 = false;
					}else if (select == 'q' || select == 'Q') {
						loopFlag5 = false;
						loopFlag1 = false;
					}else if (select == '1') {
						System.out.println("된장찌개를 선택했습니다.");
						loopFlag5 = false;
						loopFlag1 = false;
					}else if (select == '2') {
						System.out.println("김치찌개를 선택했습니다.");
						loopFlag5 = false;
						loopFlag1 = false;
					}else if (select == '3') {
						System.out.println("순두부 찌개를 선택했습니다.");
						loopFlag5 = false;
						loopFlag1 = false;
					}else if (select == '4') {
						System.out.println("두루치기 정식을 선택했습니다.");
						loopFlag5 = false;
						loopFlag1 = false;
					
					
				}
			}
				
			}else {		
				System.out.println("");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
				System.out.println("샤용할 수 없는 번호입니다.");
				System.out.println("다시 입력하세요.");
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
				
			}
			
			
			System.out.println();
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	
				
		
		
	
		
 
}
}		
		
		
	


