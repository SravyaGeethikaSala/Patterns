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
 * This class represents a node in a doubly linked list of students.
 * Each node contains the following information:
 * - Student ID
 * - First name and last name
 * - Graduation status (boolean)
 * - Age
 * - Pointers to the next and previous nodes
 */
public class Node {
    int std_ID;
    int age;
    String firstName;
    String lastName;
    boolean isGradOrNot;
    Node next;
    Node previous;

   // Constructs a new Node object with the specified student details.
    
    public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age) {
        this.std_ID = std_ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isGradOrNot = isGradOrNot;
        this.age = age;
    }
}
