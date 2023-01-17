package J19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetStringMain {

	public static void main(String[] args) {
		Set<String> setStr = new HashSet<>();
		List<String> listStr = new ArrayList<>();
		listStr.add("김동민");
		listStr.add("김동민");
		listStr.add("김동민");
		listStr.add("김동민");

		setStr.add("김상현");
		setStr.add("강대협");
		setStr.add("손지호");
		setStr.add("최해혁");
		setStr.addAll(listStr);  //set은 자동으로 중복제거를 해준다.

		System.out.println(setStr);
		String searchName = "손지호";

		for (String name : setStr) {
			if (name.equals(searchName))
				System.out.println(name);
		}

	}

}
