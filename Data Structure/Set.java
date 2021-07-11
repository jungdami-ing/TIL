import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
	
	long startTime;
	long endTime;
	int setSize = 10000000;
	
	
	public void HashSet() {
		HashSet<Integer> hashSet = new HashSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			hashSet.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("HashSet add : " + (endTime - startTime) + " ns");

		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int set : hashSet) {
		}
		endTime = System.nanoTime();
		System.out.println("HashSet access : " + (endTime - startTime) + " ns");			
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < hashSet.size(); i++) {
			hashSet.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("HashSet remove : " + (endTime - startTime) + " ns");			
	}
	
	
	public void LinkedHashSet() {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			linkedHashSet.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int set : linkedHashSet) {
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet access : " + (endTime - startTime) + " ns");			
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < linkedHashSet.size(); i++) {
			linkedHashSet.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedHashSet remove : " + (endTime - startTime) + " ns");			
	}
	
	
	public void TreeSet() {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		/* 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < setSize; i++) {
			treeSet.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet add : " + (endTime - startTime) + " ns");
		
		
		/* 탐색 */
		startTime = System.nanoTime();
		for (int set : treeSet) {
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet access : " + (endTime - startTime) + " ns");			
		
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < treeSet.size(); i++) {
			treeSet.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("TreeSet remove : " + (endTime - startTime) + " ns");			
	}
	
	public static void main(String[] args) {
		Set set = new Set();
		
		set.HashSet();
		set.LinkedHashSet();
		set.TreeSet();
	}

}
