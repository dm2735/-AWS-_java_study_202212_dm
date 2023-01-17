package J19_컬렉션;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStringMain {

	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("이종현", "a");     // a = key , A = Value
		strMap.put("진채희", "b");
		strMap.put("김재영", "c");
		strMap.put("이상현", "d");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		for(String k : strMap.keySet()) {
			System.out.println("ket : "+ k);
			System.out.println(strMap.get(k));
			
		}
		
		for(String v : strMap.values()) {
			System.out.println("vaulue : " + v);
		}
		
		Set<Entry<String,String>> s = null;
		
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value : " + entry.getValue());
			System.out.println();
		}
		
		strMap.forEach((k,v) -> {
			System.out.println("key:" + k);
			System.out.println("value:" + v);
		});
	}

}
