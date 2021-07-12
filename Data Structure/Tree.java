class BinarySearchTree {
	class Node {
		// 숫자를 저장하는 변수 -> node
		int data;
		// data보다 작은 node를 담는 변수
		Node left;
		// data보다 큰 node를 담는 변수
		Node right;
		
		//생성자
		public Node (int data) {
			this.data = data;
		}
	}
	//트리의 멤버변수 -> 루트 노드
	Node root;
	
	//배열 정보를 받아서 트리를 만드는 일을 시작하는 함수
	public void makeTree(int[] array) {
		//재귀호출에 필요한 데이터(배열 정보, 시작 인덱스, 마지막 인덱스)를 처음으로 던져주는 일을 한다. 
		root = makeTree(array, 0, array.length - 1);
		//재귀호출이 끝나면 루트노드의 주소를 받아서 멤버변수 root에 저장 
	}
	
	//재귀함수 선언 -> 인자로는 배열정보, 시작인덱스, 끝인덱스
	public Node makeTree(int[] array, int start, int end) {
		//함수를 반복적으로 호출하다가 시작점이 끝나는 점보다 커져버리면  재귀호출을 멈추고 null 반환
		if (start > end) return null;
		//받은 시작점과 끝지점으로 중간값 구하기
		int mid = (start + end) / 2;
		//중간지점에 저장된 값으로 노드를 생성
		Node node = new Node(array[mid]);
		//다시 재귀호출
		//시작점~중간값 바로 앞에있는 값(중간지점보다 작은 node)의 서브트리를 재귀호출을 통해 현재노드의 left에 저장
		node.left = makeTree(array, start, mid - 1);
		//중간값 바로 다음에 있는 값~끝점까지의 데이터(중간지점보다 큰 node)의 서브트리를 재귀호출을 통해 현재 노드의 right에 저장
		node.right = makeTree(array, mid + 1, end);
		//노드 반환
		return node;
	}
	
	//이진검색을 하는 함수 (검색을 할 시작노드 n, 데이터 find)
	public void searchTree (Node n, int find) {
		//찾아야 하는 값(find)이 현재 노드의 데이터(n.data)보다 작은지 비교
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			//찾는 값이 더 작으니까 왼쪽 노드 주소와 찾는 데이터값을 넘기고 반복호출을 한다.
			searchTree(n.left, find);
		} else if (find > n.data) {
			//찾는 값(find)이 현재 노드의 데이터(n.data)보다 큰지 비교
			System.out.println("Data is bigger than " + n.data);
			//찾는 값이 더 크니까 오른쪽 서브트리에 루트주소(데이터값)를 넘긴다.
			searchTree(n.right, find);
		} else {
			System.out.println("Data found!");
		}
	}
}


public class Tree {
	public static void main(String[] args) {
		//정렬이 되어있고 고유한 정수로만 이루어진 배열
		int[] array = new int[10];
		for (int i = 0; i < array.length; i ++) {
			array[i] = i;
		}
		
		//트리 생성
		BinarySearchTree bst = new BinarySearchTree();
		//makeTree함수를 호출하면 해당 배열로 트리를 만들고, 멤버변수 루트에 저장
		bst.makeTree(array);
		//검색할 트리의 시작위치인 루트노드(bst.root)를 알려주고, 찾는값 지정
		bst.searchTree(bst.root, 3);
		
	}

}
