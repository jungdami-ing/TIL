import java.util.NoSuchElementException;


class LinkedQueue<Q> {
	
	class Node<Q> {
		Q data;
		Node<Q> next;	//다음 노드를 가리키는 역할을 하는 변수
		
		Node(Q data) {
			this.data = data;
		}
	}
	
	Node<Q> head;	//큐에서 가장 앞에 있는 노드 객체를 가리키는 변수
	Node<Q> tail;	//큐에서 가장 뒤에 있는 노드 객체를 가리키는 변수
	
	//맨 끝에 데이터 하나 넣기
	public void add(Q value) {
		Node<Q> q = new Node<Q>(value);
		
		//마지막 노드가 비어있지 않다면, 마지막 노드의 다음 노드가 새 노드를 가리키도록 한다.
		if (tail != null) {
			tail.next = q;
		}
		//마지막 노드를 새 노드로 바꿔준다.
		tail = q;
		//첫번째 노드가 비어있다면(데이터가 없는 경우), 위에서 받은 새 노드(q)를 첫번째 노드에 할당해준다. 
		if (head == null) {
			head = tail;
		}
	}
	
	//맨 앞에서 데이터 하나 꺼내기
	public Q remove() {
		//데이터가 없는 경우(큐가 비어있는 경우), NoSuchElementException 예외를 던져준다.
		if (head == null) {
			throw new NoSuchElementException();
		}
		
		//첫번째 데이터를 반환하기 전에 그 다음 주소에 있는 요소를 첫번째 요소로 만들어 주어야 하기 때문에
		//삭제될 요소의 데이터를 반환하기 위한 임시 변수(데이터 백업)
		Q data = head.data;
		//첫번째 요소의 다음요소(head.next)를 첫번째 요소(head)로 만들어준다.
		head = head.next;
		
		
		//첫번째 요소가 null이 되면, 마지막 요소도 null을 만들어 준다. (모든 데이터가 삭제되었을 경우)
		if (head == null) {
			tail = null;
		}
		
		return data;
		
	}
	
	//맨 앞에 있는 데이터 확인하기
	public Q peek() {
		
		//데이터가 없을 경우 NoSuchElementException 예외 던지기
		if (head == null) {
			throw new NoSuchElementException();
		}
		
		//첫번째 요소 반환
		return head.data;
	}
	
	//큐가 비어있는지 확인하기
	public boolean isEmpty() {
		//데이터가 없는 경우 true 반환, 데이터가 있는 경우 false 반환
		return head == null;
	}
	
	//검색하려는 value가 큐에 있는지 확인하기
	public boolean contains(Object value) {
		//첫번째 요소부터 null이 될 때까지 각 요소마다 비교
		for (Node<Q> i = head; i != null; i = i.next) {
			//value랑 데이터랑 같다면 true를 반환
			if(value.equals(i.data)) {
				return true;
			}
		}
		return false;
	}
	
	//큐의 모든 요소 비우기
	public void clear() {
		//모든 데이터를 명시적으로 null 처리 해주기
		for(Node<Q> i = head; i != null; ) {
			Node<Q> next = i.next;
			i.data = null;
			i.next = null;
			i = next;
		}
		
		head = null;
		tail = null;
	}
	
}

public class Queue {
	
	
	public static void main (String[] args) {
		
		LinkedQueue<Integer> lq = new LinkedQueue<Integer>();
		lq.add(1);
		lq.add(2);
		lq.add(3);
		lq.add(4);
		lq.add(5);
		System.out.println(lq.remove());
		System.out.println(lq.remove());
		System.out.println(lq.peek());
		System.out.println(lq.remove());
		System.out.println(lq.isEmpty());
		System.out.println(lq.contains(4));
		System.out.println(lq.peek());
		lq.clear();
		System.out.println(lq.isEmpty());
	}

}
