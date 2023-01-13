package J12_배열;

import java.util.Scanner;

public class J12_UserService {
	private J12_UserRepository userRepository;
	private Scanner scanner;

	private char inputSelect(String menuName) {
		System.out.println(menuName + "메뉴 선택");
		char select = scanner.next().charAt(0);
		scanner.nextLine();
		return select;
	}

	public J12_UserService(J12_UserRepository userRepository) {
		scanner = new Scanner(System.in);
		this.userRepository = userRepository;
	}

	public void run() {
		boolean loopFlag = true;
		char select = '\0';
		while (loopFlag) {
			showMainMenu();
			select = inputSelect("메인");
			loopFlag = mainMenu(select);
			System.out.println();
		}
	}

	public void stop() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("프로그램 종료중...(" + (i + 1) + "/10");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

	private void showMainMenu() {
		System.out.println("========<<메인메뉴>>========");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 등록");
		System.out.println("3. 사용자 이름으로 사용자 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("============================");
		System.out.println("q. 프로그램 종료");

	}

	private void showUsers() {
		J12_User[] users = userRepository.getUserTable();

		System.out.println("========<<회원 전체 조회>>========");

		for (J12_User user : users) {
			System.out.println(user.toString());

		}

		System.out.println("==================================");
	}

	private void resisterUser() {
		J12_User user = new J12_User();

		System.out.println("========<<회원 등록>>========");
		System.out.println("사용자이름");
		user.setUsername(scanner.nextLine());

		System.out.println("비밀번호");
		user.setPassword(scanner.nextLine());

		System.out.println("성명");
		user.setName(scanner.nextLine());

		System.out.println("이메일");
		user.setEmail(scanner.nextLine());

		userRepository.saveuser(user);

	}

	private void UpdatePassword(J12_User user) {
		String oldPassword = null;
		String newPassword = null;
		String confirmPassword = null;

		System.out.println("========<<비밀번호 변경>>========");

		System.out.println("기존 비밀번호 입력");
		oldPassword = scanner.nextLine();

		if (comparePassword(user.getPassword(), oldPassword)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			return;
		}

		System.out.println("새로운 비밀번호 입력");
		newPassword = scanner.nextLine();
		System.out.println("새로운 비밀번호 확인");
		confirmPassword = scanner.nextLine();

		if (comparePassword(newPassword, confirmPassword)) {
			System.out.println("새로운 비밀번호가 일치하지 않습니다.");
			return;

		}

		user.setPassword(newPassword);
		System.out.println("비밀번호 변경 완료");

	}

	private boolean comparePassword(String prePassword, String nextPassword) {
		return prePassword.equals(nextPassword);

	}

	private void showUser() {
		J12_User user = null;

		System.out.println("========<사용자 조회>>========");

		user = verifyUsername();

		if (user == null) {
			System.out.println("존재하지 않는 사용자입니다.");
			return;
		}
		System.out.println(user.toString());

		System.out.println("===============================");

	}

	private J12_User verifyUsername() {
		String username = null;
		System.out.println("사용자이름");
		username = scanner.nextLine();
		return userRepository.findUserByUsername(username);

	}

	private void updateUser() {
		J12_User user = verifyUsername();
		if (user == null) {
			System.out.println("존재하지 않는 사용자이름입니다.");
			return;
		}

		boolean loopFlag = true;
		char select = '\0';

		while (loopFlag) {
			showUpdateMenu(user);
			select = inputSelect("수정");
			loopFlag = updateMenu(user, select);

		}
	}

	private void showUpdateMenu(J12_User user) {
		System.out.println("======<<수정메뉴>>=====");
		System.out.println("사용자이름 : " + user.getUsername());
		System.out.println("=======================");
		System.out.println("1.비밀번호 변경");
		System.out.println("2.이름 변경");
		System.out.println("3.이메일 변경");
		System.out.println("========================");
		System.out.println("b.뒤로가기");
		System.out.println();
	}

	private boolean updateMenu(J12_User user, char select) {
		boolean flag = true;

		if (isBack(select)) {
			flag = false;
		} else {
			if (select == '1') {
				UpdatePassword(user);
			} else if (select == '2') {

			} else if (select == '3') {

			} else {
				System.out.println(getSelectedErrorMessage());
			}
		}
		System.out.println();

		return flag;

	}

	private boolean mainMenu(char select) {
		boolean flag = true;

		if (isExit(select)) {
			flag = false;
		} else {
			if (select == '1') {
				showUsers();

			} else if (select == '2') {
				resisterUser();

			} else if (select == '3') {
				showUser();

			} else if (select == '4') {
				updateUser();

			} else {
				System.out.println(getSelectedErrorMessage());

			}

		}

		return flag;
	}

	private boolean isExit(char select) {
		return select == 'q' || select == '0';
	}

	private boolean isBack(char select) {
		return select == 'b' || select == '0';
	}

	private String getSelectedErrorMessage() {
		return "잘못된 입력입니다. 다시 입력하세요.";
	}

}
