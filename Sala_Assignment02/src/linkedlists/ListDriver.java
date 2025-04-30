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

import java.util.Scanner;

/**
 * The ListDriver class is the main driver program for performing operations on a singly linked list
 * containing student data. This includes adding students to the list, updating their information,
 * swapping nodes, and merging two linked lists together.
 */
public class ListDriver {

    /**
     * The main method is the entry point of the program. It demonstrates various operations on a 
     * singly linked list, such as inserting nodes, updating details, swapping nodes, and merging 
     * two linked lists.
     */
    public static void main(String[] args) {
        SinglyLinkedList studentsList = new SinglyLinkedList();
        Scanner sala = new Scanner(System.in);

        // Input and node creation for the first student
        System.out.print("Enter student ID: ");
        int sid = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName = sala.next();
        System.out.print("Enter last name: ");
        String lastName = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age = sala.nextInt();
        Node node1 = new Node(sid, firstName, lastName, isGrad, age);
        Node head = node1;

        // Input and creation of more student nodes
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid1 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName1 = sala.next();
        System.out.print("Enter last name: ");
        String lastName1 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad1 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age1 = sala.nextInt();
        Node node2 = new Node(sid1, firstName1, lastName1, isGrad1, age1);
        studentsList.insertNode(node1, node2);

        // Repeat similar input and creation process for additional students
        System.out.println();
        System.out.print("Enter student ID: ");
        int sid2 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName2 = sala.next();
        System.out.print("Enter last name: ");
        String lastName2 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad2 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age2 = sala.nextInt();
        Node node3 = new Node(sid2, firstName2, lastName2, isGrad2, age2);
        studentsList.insertNode(node1, node3);

        System.out.println();
        System.out.print("Enter student ID: ");
        int sid3 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName3 = sala.next();
        System.out.print("Enter last name: ");
        String lastName3 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad3 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age3 = sala.nextInt();
        Node node4 = new Node(sid3, firstName3, lastName3, isGrad3, age3);
        studentsList.insertNode(node1, node4);

        System.out.println();
        System.out.print("Enter student ID: ");
        int sid4 = sala.nextInt();
        System.out.print("Enter first name: ");
        String firstName4 = sala.next();
        System.out.print("Enter last name: ");
        String lastName4 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean isGrad4 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int age4 = sala.nextInt();
        Node node5 = new Node(sid4, firstName4, lastName4, isGrad4, age4);

        // Printing the linked list after inserting nodes
        System.out.println("******************************************");
        studentsList.insertNode(node1, node5);
        studentsList.print(head);

        // Updating details for a student with a given ID
        System.out.print("Enter the student ID you want to update: ");
        int sID = sala.nextInt();
        studentsList.updateDetails(head, sID);
        studentsList.print(head);

        System.out.print("Enter the student ID you want to update: ");
        int sID1 = sala.nextInt();
        studentsList.updateDetails(head, sID1);
        studentsList.print(head);

        // Swapping two nodes in the list
        studentsList.swap(head, 3, 5);
        studentsList.print(head);
        System.out.println("******************************************");
        System.out.println("After swapping the student: ");
        studentsList.print(head);
        System.out.println("******************************************");

        // Creating a second linked list for students
        System.out.println("Reading inputs for second linked list:");
        SinglyLinkedList secondStudentsList = new SinglyLinkedList();

        // Input and node creation for the first student in the second list
        System.out.print("Enter student ID: ");
        int ssid = sala.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName = sala.next();
        System.out.print("Enter last name: ");
        String slastName = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int s_age = sala.nextInt();
        Node snode1 = new Node(ssid, sfirstName, slastName, sisGrad, s_age);
        Node head1 = snode1;

        // Repeat similar input and creation process for additional students in the second list
        System.out.print("Enter student ID: ");
        int ssid1 = sala.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName1 = sala.next();
        System.out.print("Enter last name: ");
        String slastName1 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad1 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int sage1 = sala.nextInt();
        Node snode2 = new Node(ssid1, sfirstName1, slastName1, sisGrad1, sage1);
        secondStudentsList.insertNode(snode1, snode2);

        System.out.print("Enter student ID: ");
        int ssid2 = sala.nextInt();
        System.out.print("Enter first name: ");
        String sfirstName2 = sala.next();
        System.out.print("Enter last name: ");
        String slastName2 = sala.next();
        System.out.print("Enter student is graduated?: ");
        boolean sisGrad2 = sala.nextBoolean();
        System.out.print("Enter student age: ");
        int sage2 = sala.nextInt();
        Node snode3 = new Node(ssid2, sfirstName2, slastName2, sisGrad2, sage2);
        secondStudentsList.insertNode(snode1, snode3);

        // Merging the two linked lists and printing the result
        System.out.println("Linked List after merging is");
        System.out.println("******************************************");
        System.out.println("After merging the two linked list: ");
        head = studentsList.merge(head, head1);
        studentsList.print(head);
    }
}
