package InclassFeb06;
import java.util.*;

public class Prob2 { // Conversion of Linked List to Array List 
	 public static void main(String[] args) {
	        LinkedList<String> studentsLinkL = new LinkedList<>(); // Creating a Linked list named studentsLinkL of String data type 
	        
	        studentsLinkL.add("John");
	        studentsLinkL.add("Ajay");
	        studentsLinkL.add("Rachel");
	        studentsLinkL.add("Ross");
	        studentsLinkL.add("Sai"); // Inserting the given elements 
	        
	        studentsLinkL.set(0, "Chandler"); // Replace John with Chandler
	        studentsLinkL.add("Phoebe"); // Adding Phoebe to the list 
	        

	        ArrayList<String> studArrayL = new ArrayList<>(); // Creating an array list named studArrayL of String data type 
	        for (int i = 0; i < studentsLinkL.size(); i++) { // Inserting from Linked list to array list 
	            studArrayL.add(studentsLinkL.get(i));
	        }
	        System.out.println("LinkedList: " + studentsLinkL); // Printing Linked list 
	        System.out.println("ArrayList: " + studArrayL); // Printing array list 
	    }
}
