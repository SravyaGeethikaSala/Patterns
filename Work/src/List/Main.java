package List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       CircularLinkedList list = new CircularLinkedList();
		        list.insert(1);
		        list.insert(2);
		        list.insert(3);
		        list.display(); // Output: 1 -> 2 -> 3 -> (back to head)
	}
}
