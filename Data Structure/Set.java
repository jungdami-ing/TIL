import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	long startTime;
	long endTime;
	int setSize = 10000000;
	
	
	public void hashSet() {
		HashSet<String> hashSet = new HashSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			hashSet.add("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("HashSet add : " + (endTime - startTime) + " ns");

		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int i = 0; i < hashSet.size(); i++) {
			hashSet.contains("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("HashSet contains : " + (endTime - startTime) + " ns");			
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < hashSet.size(); i++) {
			hashSet.remove("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("HashSet remove : " + (endTime - startTime) + " ns");			
	}
	
	
	public void linkedHashSet() {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			linkedHashSet.add("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int i = 0; i < linkedHashSet.size(); i++) {
			linkedHashSet.contains("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet contains : " + (endTime - startTime) + " ns");		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < linkedHashSet.size(); i++) {
			linkedHashSet.remove("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet remove : " + (endTime - startTime) + " ns");			
	}
	
	
	public void treeSet() {
		TreeSet<String> treeSet = new TreeSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			treeSet.add("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int i = 0; i < treeSet.size(); i++) {
			treeSet.contains("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet contains : " + (endTime - startTime) + " ns");		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < treeSet.size(); i++) {
			treeSet.remove("i" + i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet remove : " + (endTime - startTime) + " ns");			
	}
	
	public static void main(String[] args) {
		Set set = new Set();
		
		set.hashSet();
		set.linkedHashSet();
		set.treeSet();
	}

}
