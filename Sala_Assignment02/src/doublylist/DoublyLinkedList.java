/**
 * Class: 44642-01 (12:30 - 01:50) Application Design Patterns and Frameworks 
 * @author Sravya Geethika Sala
 * SID: S574309
 * Description: Making sure everything works
 * Due: 02/17/2025
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */

package doublylist;

/**
 * This class represents a doubly linked list of student nodes.
 * It provides functionality to:
 * - Print the list from the head to the tail
 * - Insert a new node at the end of the list
 * - Print the list in reverse order
 */
public class DoublyLinkedList {


     // Prints the details of all nodes in the doubly linked list from the head to the tail.
    public void print(Node head) {
        while (head != null) {
            System.out.println("The student ID is: " + head.std_ID);
            System.out.println("First Name: " + head.firstName);
            System.out.println("Last Name: " + head.lastName);
            System.out.println("isGraduated?: " + head.isGradOrNot);
            System.out.println("Age: " + head.age);
            System.out.println("******");
            head = head.next;
        }
    }

     // Inserts a new node at the end of the doubly linked list.

    public Node insertNode(Node head, Node newNode) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
        return head;
    }


     // Prints the details of all nodes in the doubly linked list in reverse order (from tail to head).
    
    public void reverseList(Node head) {
        Node current = head;

        // Move to the tail of the list
        while (current != null && current.next != null) {
            current = current.next;
        }

        // Print nodes from tail to head
        while (current != null) {
            System.out.println("The student ID is: " + current.std_ID);
            System.out.println("First Name: " + current.firstName);
            System.out.println("Last Name: " + current.lastName);
            System.out.println("isGraduated?: " + current.isGradOrNot);
            System.out.println("Age: " + current.age);
            System.out.println("*****");
            current = current.previous;
        }
    }
}


