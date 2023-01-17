package J19_컬렉션;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data

class User {
	private String username;
	private String name;

}

public class ArrayUserMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User[] userArray = { 
				new User("aaa", "김종환"), 
				new User("bbb", "고병수"), 
				new User("ccc", "손민재"),
				new User("ddd", "황창욱") };

		List<User> userList = Arrays.asList(userArray);

		String searchUsername = "aaa";
		System.out.print("UserName을 입력하세요 : ");
		searchUsername = scanner.next();
		User user = searchUser(userList, searchUsername);
		
		if(user == null) {
			System.out.println("검색실패");
		}else {
			System.out.println("검색 성공");
			System.out.println(searchUsername + "님의 이름은" + user.getName() + "입니다");
		}
/*
		boolean flag = true;

		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUsername().equals(searchUsername)) {
				System.out.println(userList.get(i).getUsername() + "님의 이름은 " + userList.get(i).getName() + "입니다.");

				flag = false;
				break;

			}

		}
		if (flag) {
			System.out.println("검색실패! 존재하지 않는 계정입니다.");

		}
*/
	}

	private static User searchUser(List<User> userList, String username) {
		User user = null;
		for (User u : userList) {
			if (u.getUsername().equals(username)) {
				user = u;
				break;

			}
		}
		return user;
	}
}
