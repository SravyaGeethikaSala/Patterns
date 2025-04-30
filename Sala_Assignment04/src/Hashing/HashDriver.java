 /**
 * Class: 44642-01 (12:30 - 01:50) Application Design Patterns and Frameworks 
 * @author: Sravya Geethika Sala
 * SID: S574309
 */
package Hashing;
import java.util.*;
public class HashDriver { 
	static int collision = 0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Initialize the hash table with 31 slots
		        LinkedList<Integer>[] hashTable = new LinkedList[31];

		        // Initialize the array using arrayInitialize method
		        arrayInitialize(hashTable);

		        // Generate 1000 unique random numbers between 0 and 9999
		        Set<Integer> set1 = new HashSet<>();
		        Random random = new Random();

		        //  Generate unique random numbers and insert into hash table
		        while (set1.size() < 1000) {
		            set1.add(random.nextInt(10000));
		        }

		        //  Insert the numbers into hash table
		        for (Integer num : set1) {
		            hashing(num, hashTable);
		        }

		        // Print total number of collisions
		        System.out.println("Total number of collisions: " + collision);

		        // Print the contents of the hash table (with chaining)
		        System.out.println("Hash table with chaining:");
		        for (int i = 0; i < hashTable.length; i++) {
		            if (hashTable[i] != null && !hashTable[i].isEmpty()) {
		                System.out.print("Index " + i + " : ");
		                System.out.println(hashTable[i]);
		            }
		        }
		    }

		    // Method to initialize the array positions (initialize as empty linked lists)
		    public static void arrayInitialize(LinkedList<Integer>[] hashTable) {
		        for (int i = 0; i < hashTable.length; i++) {
		            hashTable[i] = new LinkedList<>();
		        }
		    }

		    //  Hashing method with chaining for collision handling
		    public static void hashing(int val, LinkedList<Integer>[] hashTable) {
		        //  Compute hash index using val % 31
		        int index = val % 31;

		        //  If the position is empty, store the number; else, handle collision
		        if (hashTable[index].isEmpty()) {
		            hashTable[index].add(val);
		        } else {
		            collision++;
		            hashTable[index].add(val);  // Collision handled by chaining
		        }
		    }
}

//11)
//In Part 2, we implemented a hash table with chaining to handle collisions. The output indicated that there were a total of 969 collisions during the insertion of 1000 random numbers. This result highlights a few key points about hash tables and collision handling:
//Collisions occurred because multiple keys were mapped to the same index in the hash table. Since the hash function used (val % 31) is relatively simple, the random distribution of numbers may result in several values hashing to the same index. As a result, the numbers that collide are stored in linked lists at the same index, thus implementing chaining.
//The total number of collisions is significant because it reflects the effectiveness of the hash function and the size of the hash table (31 slots). With only 31 slots for 1000 numbers, the hash table quickly became congested, leading to more collisions. Ideally, increasing the size of the table or using a more complex hash function would reduce collisions and improve performance.
//Chaining as a collision resolution technique ensures that the hash table can still function despite collisions. However, if the linked lists grow too long, performance could degrade to O(n) for some operations. Thus, while chaining provides a robust way to handle collisions, the efficiency of the hash table is directly tied to the quality of the hash function and the load factor.
