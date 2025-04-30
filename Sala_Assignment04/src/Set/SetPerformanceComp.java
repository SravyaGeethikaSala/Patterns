 /**
 * Class: 44642-01 (12:30 - 01:50) Application Design Patterns and Frameworks 
 * @author: Sravya Geethika Sala
 * SID: S574309
 */
package Set;
import java.util.*;
public class SetPerformanceComp {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
        // Testing with different sizes
        testWithSize(1000);
        testWithSize(10000);
        testWithSize(1000000);
    }

    public static void testWithSize(int size) {
        Random random = new Random();

        // Create sets
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Track start and end time
        long startTime, endTime;

        // HashSet insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(random.nextInt(10000)); // Random number
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for HashSet: " + (endTime - startTime) + " ns");

        // LinkedHashSet insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashSet.add(random.nextInt(10000));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for LinkedHashSet: " + (endTime - startTime) + " ns");

        // TreeSet insertion
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt(10000));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for TreeSet: " + (endTime - startTime) + " ns");

        // Print separator after each test
        System.out.println("***************************************");

	}

}

//10) 
//In Part 1, we compared the performance of different Set implementations in Java: HashSet, LinkedHashSet, and TreeSet, in terms of insertion time. The output showed that the HashSet was the fastest, followed by LinkedHashSet, and then TreeSet, which had the longest insertion time. This behavior can be attributed to the underlying data structures and operations of each Set implementation.
//HashSet uses a hash table internally, providing average constant-time complexity (O(1)) for insertion and lookup. The absence of any ordering mechanism makes it faster than the others in terms of basic insertion operations.
//LinkedHashSet also uses a hash table but maintains the insertion order using a linked list. This extra overhead of maintaining order results in a slightly slower performance compared to HashSet.
//TreeSet uses a red-black tree, which ensures that elements are always sorted. While this guarantees logarithmic time complexity (O(log n)) for insertion, the sorting process introduces more overhead, making it the slowest of the three.
