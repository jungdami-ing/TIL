import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
	
	long startTime;
	long endTime;
	int mapSize = 1000000;
	
	
	public void hashMap() {
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for(int i = 0; i < mapSize; i++) {
			hashMap.put(i, "value" + i);
		}
		endTime = System.nanoTime();
		System.out.println("HashMap add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for(int i = 0; i < hashMap.size(); i++) {
			hashMap.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("HashMap get : " + (endTime - startTime) + " ns");
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for(int i = 0; i < hashMap.size(); i++) {
			hashMap.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("HashMap remove : " + (endTime - startTime) + " ns");
	}
	
	public void linkedHashMap() {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for(int i = 0; i < mapSize; i++) {
			linkedHashMap.put(i, "value" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashMap add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for(int i = 0; i < linkedHashMap.size(); i++) {
			linkedHashMap.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashMap get : " + (endTime - startTime) + " ns");
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for(int i = 0; i < linkedHashMap.size(); i++) {
			linkedHashMap.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashMap remove : " + (endTime - startTime) + " ns");
		
	}
	
	public void treeMap() {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for(int i = 0; i < mapSize; i++) {
			treeMap.put(i, "value" + i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeMap add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for(int i = 0; i < treeMap.size(); i++) {
			treeMap.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeMap get : " + (endTime - startTime) + " ns");
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for(int i = 0; i < treeMap.size(); i++) {
			treeMap.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeMap remove : " + (endTime - startTime) + " ns");
		
	}
	
	public static void main(String[] args) {
		
		Map map = new Map();
		
		map.hashMap();
		map.linkedHashMap();
		map.treeMap();
	}

}
