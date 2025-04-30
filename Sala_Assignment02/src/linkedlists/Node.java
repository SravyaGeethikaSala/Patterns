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
package linkedlists;

/**
 * Represents a node in a singly linked list. Each node contains student details
 * and a reference to the next node in the list.
 */
public class Node {
    int std_ID;
    String firstName;
    String lastName;
    boolean isGradOrNot;
    int age;
    Node next;

    /**
     * Constructs a new `Node` object with the specified student details.
     * The `next` reference is initialized to null by default.
     */
    public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age) {
        this.std_ID = std_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGradOrNot = isGradOrNot;
        this.age = age;
        this.next = null;
    }
}
