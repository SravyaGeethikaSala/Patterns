package InclassFeb06;

public class SingleLinkedList {
	public static void main(String[] args) {

		    // Creating nodes 
		    Node node1 = new Node("Java");
	        Node node2 = new Node("Python");
	        Node node3 = new Node("Ruby");
	        Node node4 = new Node("C++");
	        Node node5 = new Node("Lisp"); 
	        
	        // Linking nodes 
	        node1.next = node2;
	        node2.next = node3;
	        node3.next = node4;
	        node4.next = node5;
	        
	        
	        // Printing the linked list
	        System.out.print("Singly Linked List: ");
	        linkedList(node1);

	        // Converting to Circular Linked List
	        Node circularHead = convert_To_CircularLinkedList(node1);

	        // Printing Circular Linked List
	        System.out.print("Circular Linked List: ");
	        circularLinkedList(circularHead);
	    }

	// Method to print singly linked list
	public static void linkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
	 // Method to convert to Circular Linked List
	public static Node convert_To_CircularLinkedList(Node head) {
        if (head == null) return null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head; 

        return head;
    }
	
    // Printing Circular Linked List 
	public static void circularLinkedList(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        } while (temp != head);

        System.out.println(head.data); // Printing head again to make it circular 
    }
}
