import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOrder {  
	
	public static void main(String[] args) {
    
		HashSet<String> hashSet = new HashSet<>();
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		TreeSet<String> treeSet = new TreeSet<>();
		
		/* HashSet */
		hashSet.add("Seoul");
		hashSet.add("Paris");
		hashSet.add("Washington");
		hashSet.add("Beijing");
		hashSet.add("Ottawa");
		hashSet.add("London");
		hashSet.add("Dublin");
		hashSet.add("Nairobi");
		hashSet.add("Accra");
		hashSet.add("Santiago");
		// 중복값 추가
		hashSet.add("Nairobi");
		hashSet.add("Accra");
		hashSet.add("Santiago");
		
		for(String set : hashSet) {
			System.out.println("HashSet : " + set);
		}
		
		/* LinkedHashSet */
		linkedHashSet.add("Seoul");
		linkedHashSet.add("Paris");
		linkedHashSet.add("Washington");
		linkedHashSet.add("Beijing");
		linkedHashSet.add("Ottawa");
		linkedHashSet.add("London");
		linkedHashSet.add("Dublin");
		linkedHashSet.add("Nairobi");
		linkedHashSet.add("Accra");
		linkedHashSet.add("Santiago");
		// 중복값 추가
		linkedHashSet.add("Nairobi");
		linkedHashSet.add("Accra");
		linkedHashSet.add("Santiago");
		
		for(String set : linkedHashSet) {
			System.out.println("LinkedHashSet : " + set);
		}
		
		/* TreeSet */
		treeSet.add("Seoul");
		treeSet.add("Paris");
		treeSet.add("Washington");
		treeSet.add("Beijing");
		treeSet.add("Ottawa");
		treeSet.add("London");
		treeSet.add("Dublin");
		treeSet.add("Nairobi");
		treeSet.add("Accra");
		treeSet.add("Santiago");
		// 중복값 추가
		treeSet.add("Nairobi");
		treeSet.add("Accra");
		treeSet.add("Santiago");
		
		for(String set : treeSet) {
			System.out.println("TreeSet : " + set);
		}

	}

}
