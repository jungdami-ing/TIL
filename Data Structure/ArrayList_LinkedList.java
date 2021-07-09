import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {	
	
	long startTime;
	long endTime;
	int listSize = 100000;

	
	public void arrayListTest() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		/* 순차적 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < listSize; i++) {
			arrayList.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList add(i) : " + (endTime - startTime) + " ns");
		
		/* 중간 추가*/
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList.add(1000, i);	//1000번째 위치에 i 데이터 추가
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList add(index, i) : " + (endTime - startTime) + " ns");
		
		
		/* 검색 */
		startTime = System.nanoTime();
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList get : " + (endTime - startTime) + " ns");
		
		/* 중간 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList remove : " + (endTime - startTime) + " ns");	
		
		/* 순차적 삭제 */
		startTime = System.nanoTime();
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList removeAll : " + (endTime - startTime) + " ns");	

	}
	
	public void linkedListTest() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		
		/* 순차적 추가 */
		startTime = System.nanoTime();
		for (int i = 0; i < listSize; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList add(i) : " + (endTime - startTime) + " ns");
		
		/* 중간 추가*/
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList.add(1000, i);	//1000번째 위치에 i 데이터 추가
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList add(index, i) : " + (endTime - startTime) + " ns");
		
		/* 검색 */
		startTime = System.nanoTime();
		for (int i = 0; i < linkedList.size(); i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList get : " + (endTime - startTime) + " ns");
		
		/* 중간 삭제 */
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList remove : " + (endTime - startTime) + " ns");	
		
		/* 삭제 */
		startTime = System.nanoTime();
		for (int i = linkedList.size() - 1; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList removeAll : " + (endTime - startTime) + " ns");
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList_LinkedList al = new ArrayList_LinkedList();
		
		al.arrayListTest();
		al.linkedListTest();
		
	}
	


}
