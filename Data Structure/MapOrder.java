import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapOrder {  
	
	public static void main(String[] args) {
    
		HashMap<String, String> hashMap = new HashMap<>();
		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		TreeMap<String, String> treeMap = new TreeMap<>();
		
		/* HashMap */
		hashMap.put("Seoul", "Korea");
		hashMap.put("Paris", "France");
		hashMap.put("Washington", "USA");
		hashMap.put("Beijing", "China");
		hashMap.put("Ottawa", "Canada");
		hashMap.put("London", "UK");
		hashMap.put("Dublin", "Ireland");
		hashMap.put("Nairobi", "Kenya");
		hashMap.put("Accra", "Ghana");
		hashMap.put("Santiago", "Chile");
		
		for(String key : hashMap.keySet()) {
			System.out.println("HashMap : " + key + " = " + hashMap.get(key));
		}
		
		/* LinkedHashMap */
		linkedHashMap.put("Seoul", "Korea");
		linkedHashMap.put("Paris", "France");
		linkedHashMap.put("Washington", "USA");
		linkedHashMap.put("Beijing", "China");
		linkedHashMap.put("Ottawa", "Canada");
		linkedHashMap.put("London", "UK");
		linkedHashMap.put("Dublin", "Ireland");
		linkedHashMap.put("Nairobi", "Kenya");
		linkedHashMap.put("Accra", "Ghana");
		linkedHashMap.put("Santiago", "Chile");
		
		for(String key : linkedHashMap.keySet()) {
			System.out.println("LinkedHashMap : " + key + " = " + linkedHashMap.get(key));
		}
		
		/* TreeMap */
		treeMap.put("Seoul", "Korea");
		treeMap.put("Paris", "France");
		treeMap.put("Washington", "USA");
		treeMap.put("Beijing", "China");
		treeMap.put("Ottawa", "Canada");
		treeMap.put("London", "UK");
		treeMap.put("Dublin", "Ireland");
		treeMap.put("Nairobi", "Kenya");
		treeMap.put("Accra", "Ghana");
		treeMap.put("Santiago", "Chile");
		
		for(String key : treeMap.keySet()) {
			System.out.println("TreeMap : " + key + " = " + treeMap.get(key));
		}

	}

}
