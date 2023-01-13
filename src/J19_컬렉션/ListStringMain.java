package J19_컬렉션;

import java.util.ArrayList;

public class ListStringMain {

	public static void main(String[] args) {
		String[] strArray = new String[] {"java", "python", "C++"};
		
		String[] strArray2 = new String[4];
		for(int i = 0; i < strArray.length; i++) {
			strArray2[i] = strArray[i];
		}
			strArray2[strArray.length]= "html";
		
			
		System.out.println("[strArray]");
		for(String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println("[strArray2]");
		for(String str2 : strArray2) {
			System.out.println(str2);
		}
		
		/////////////////////////////////////////////////////////
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("Java");	
		strList.add("Python");
		strList.add("Python");
		strList.add("Python");
		strList.remove("Python");
		strList.add(1, "Java");
		strList.remove(1);
		
		
		for(int i = 0; i <strList.size(); i++) {
			System.out.print("["+ i + "]");
			System.out.println(strList.get(i));
		}
		
		for(String str : strList) {
			System.out.println(str);
		}

	}

}
