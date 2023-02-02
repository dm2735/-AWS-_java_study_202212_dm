package J12_배열.복습;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

class User {
	private String username;
	private String password;
	
}

public class Array2 {

	public static void main(String[] args) {
		
		User user1 = new User("aaa", "1234");
		User user2 = new User("bbb", "2222");
		User user3 = new User("ccc", "3333");
		User[] users = new User[] {new User("aaa" , "1234"), new User("bbb" , "2222"), new User("ccc" , "3333")};
		
		Integer[] integers = new Integer[] {10,20,30};
		
		List<Integer> integerList = Arrays.asList(integers);
		System.out.println("출력>>>>>" + integerList);
		
		
		int num1 =10;
		int num2 = 20;
		int num3 = 30;
		int[] num4  = new int[] {10, 70, 30};
		
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		
		
		for(int i=0; i<users.length; i++) {
			System.out.println(users[i].getUsername());
		}
		
		for(User u : users) {
			System.out.println(u);
		}
		
		List<User> userList = Arrays.asList(users);
		
		System.out.println(userList);
	

}
}

