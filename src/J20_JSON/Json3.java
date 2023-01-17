package J20_JSON;

import com.google.gson.Gson;

public class Json3 {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		System.out.println(Integer.valueOf("100")+ 50);
		System.out.println(Integer.parseInt("100")+ 50);
		
		gson.toJson(null); // object를 Json으로 바꿔준다.
		gson.fromJson("", Object.class); // Json을 object로 바꿔준다.
	}
}
