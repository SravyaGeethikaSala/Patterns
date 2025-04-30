package patterns;
import java.util.*;

public class Maps { 
	public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "HTML");
        map1.put(2, "CSS");
        map1.put(3, "JAVA");
        map1.put(4, "PYTHON");

       
        System.out.println("Map contains 'HTML': " + map1.containsValue("HTML"));

        System.out.println("Map contains key 1: " + map1.containsKey(1));

        System.out.println("\nKey-Value pairs in the map:");
        map1.forEach((key, value) -> System.out.println(key + " -> " + value));

        Set<Integer> keys = map1.keySet();
        System.out.println("\nKeys in the map: " + keys);

        System.out.println("Values in the map: " + map1.values()); 
    }
} 
