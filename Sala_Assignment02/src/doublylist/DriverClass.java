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

import java.util.Scanner;

/**
 * This class represents a driver program for testing the DoublyLinkedList functionality.
 * It allows the user to input student details, add them to a doubly linked list,
 * and then display the list in both forward and reverse order.
 */
public class DriverClass {

    /**
     * The main method of the driver program.
     * It performs the following tasks:
     * - Accepts student details from the user
     * - Inserts the students into a doubly linked list
     * - Prints the list in forward and reverse order. 
     */
    public static void main(String[] args) {
        DoublyLinkedList doublylinkedlist = new DoublyLinkedList();
        Scanner sala = new Scanner(System.in);

        // Creating and inserting the first node
        System.out.print("Enter student ID is: ");
        int sid1 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName1 = sala.next();
        System.out.print("Enter last name: ");
        String lastName1 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad1 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age1 = sala.nextInt();
        Node node1 = new Node(sid1, firstName1, lastName1, isGrad1, age1);
        node1.previous = null;
        Node head = node1;

        // Repeating the process to add more nodes
        System.out.print("Enter student ID is: ");
        int sid2 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName2 = sala.next();
        System.out.print("Enter last name: ");
        String lastName2 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad2 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age2 = sala.nextInt();
        Node node2 = new Node(sid2, firstName2, lastName2, isGrad2, age2);
        doublylinkedlist.insertNode(head, node2);

        // Adding more nodes
        System.out.print("Enter student ID is: ");
        int sid3 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName3 = sala.next();
        System.out.print("Enter last name: ");
        String lastName3 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad3 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age3 = sala.nextInt();
        Node node3 = new Node(sid3, firstName3, lastName3, isGrad3, age3);
        doublylinkedlist.insertNode(head, node3);

        
        System.out.print("Enter student ID is: ");
        int sid4 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName4 = sala.next();
        System.out.print("Enter last name: ");
        String lastName4 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad4 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age4 = sala.nextInt();
        Node node4 = new Node(sid4, firstName4, lastName4, isGrad4, age4);
        doublylinkedlist.insertNode(head, node4);

        System.out.print("Enter student ID is: ");
        int sid5 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName5 = sala.next();
        System.out.print("Enter last name: ");
        String lastName5 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad5 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age5 = sala.nextInt();
        Node node5 = new Node(sid5, firstName5, lastName5, isGrad5, age5);
        doublylinkedlist.insertNode(head, node5);

        System.out.print("Enter student ID is: ");
        int sid6 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName6 = sala.next();
        System.out.print("Enter last name: ");
        String lastName6 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad6 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age6 = sala.nextInt();
        Node node6 = new Node(sid6, firstName6, lastName6, isGrad6, age6);
        doublylinkedlist.insertNode(head, node6);

        // Printing the list in forward order
        System.out.println("******************************************");
        System.out.println("Doubly Linked List: ");
        doublylinkedlist.print(head);

        // Printing the list in reverse order
        System.out.println("******************************************");
        System.out.println("************************************");
        System.out.println("The linked list printed in reverse order is");
        doublylinkedlist.reverseList(head);
    }
}

