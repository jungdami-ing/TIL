import java.util.EmptyStackException;

class ArrayListStack<S> {
	
	//Stack 저장을 위한 인덱스 변수
	int top;
	//배열의 크기
	int size;
	//요소를 담을 배열
	Object[] array;
	
	
	//생성자
	public ArrayListStack(int size) {
		//스택 인덱스 초기화
		top = 0;
		this.size = size;
		this.array = new Object[size];
	}
	
	//스택에 데이터 추가
	public S push(S data) {
		//스택이 꽉 차 있는 경우
		if (top == size) {
			throw new IndexOutOfBoundsException();
		}
		array[top++] = data;			
		return data;
	}
	
	//스택의 최상위(마지막) 데이터 추출 후 삭제
	public S pop() {
		//스택이 비어있는 경우 예외를 던져준다.
		if(array == null) {
			throw new EmptyStackException();
		}
		
		size--;
		return (S) array[--top];
	}
	
	//스택에 가장 최근에 들어간(최상위=마지막) 데이터 확인하기
	public S peek() {
		//스택이 비어있는 경우 예외를 던져준다.
		if (array == null) {
			throw new EmptyStackException();
		}
		
		return (S) array[top-1];
	}
	
	//스택이 비어있는지 확인하기
	public boolean isEmpty() {
		return top == 0;
	}
	
	
	//검색하려는 value가 스택의 top으로부터 떨어져 있는 거리 찾기
	//예를 들어, 마지막으로 들어간 데이터는 1을 반환하고, 제일 처음으로 들어간 데이터는 배열의 사이즈를 반환한다. 
	public int search(Object value) {
		for(int idx = size - 1; idx >= 0; idx--) {
			//같은 객체를 찾았을 경우 size - idx 값 반환
			if(array[idx].equals(value)) {
				return size - idx;
			}
		}
		//일치하는 데이터를 찾지 못했을 경우 -1 반환
		return -1;
	}
	
	//스택의 모든 요소 비우기
	public void clear() {
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
		
		top = 0;
		size = 0;
	}
	
}



public class Stack {
	public static void main(String[] args) {
		
		ArrayListStack<Integer> als = new ArrayListStack<>(5);
		
		als.push(1);
		als.push(2);
		als.push(3);
		als.push(4);
		als.push(5);
		System.out.println(als.search(1));
		System.out.println(als.pop());
		System.out.println(als.peek());
		System.out.println(als.isEmpty());
		System.out.println(als.pop());
		System.out.println(als.peek());
		als.clear();
		System.out.println(als.isEmpty());
		
	}

}
