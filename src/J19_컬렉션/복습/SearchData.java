package J19_컬렉션.복습;

import java.util.HashMap;
import java.util.Map;

public class SearchData {

	public static void main(String[] args) {
		Map<String, Object> searchData = new HashMap<>();
		
		searchData.put("category", "소설");
		searchData.put("searchValue", "불편한 편의점");

		System.out.println(searchData);
		System.out.println(searchData.get("category")); // 맵에서는 순서가 없어서 값을 꺼내고 싶으면 키값을 통해서 값을 얻을 수 있다.
		System.out.println(searchData.get("searchValue"));
		
		System.out.println(searchData.keySet());          // keySet, values, entrySet 이 세개는 반복이 가능하다.
		System.out.println(searchData.values());		
		System.out.println(searchData.entrySet());
		
//		for(int i = 0; i<searchData.size(); i++) {             //인덱스로는 포문을 돌릴 수 없다
//			System.out.println(searchData.get(null));
//			
//			
//		}
		
		for (String key : searchData.keySet()) {             
			System.out.println(searchData.get(key));
		}
	}

}
