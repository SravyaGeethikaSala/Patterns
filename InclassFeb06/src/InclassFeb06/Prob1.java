package InclassFeb06;
import java.util.*;
public class Prob1 { // Conversion of Array List to Linked List 
	public static void main(String[] args) {
        ArrayList<Integer> arrListMarks = new ArrayList<>(); // Creating an array list named arrListMarks of data type Integer 
        Random rand = new Random();  
        
        for (int i = 0; i < 10; i++) { // Generating Random values from 0 to 30 
            arrListMarks.add(rand.nextInt(31)); 
        }
        arrListMarks.set(4, 99); // Replacing the fifth value with 99 
        LinkedList<Integer> linkedListMarks = new LinkedList<>(); // Creating a Linked list named linkedListMarks 

        for (int mark : arrListMarks) { // Insert values from array list to Linked list
            linkedListMarks.add(mark);
        }
        System.out.println("ArrayList: " + arrListMarks); // Printing array list 
        System.out.println("LinkedList: " + linkedListMarks); // Printing Linked List 
	}
}
