package patterns;

import java.util.*;

public class Sets { 
	
	 public static void main(String[] args) {
	        Set<String> set1 = new HashSet<>();
	        Set<String> set2 = new HashSet<>();

	        set1.add("Apple");
	        set1.add("Banana");
	        set1.add("Cherry");
	        set1.add("Orange");
	        set1.add("Plum");
	        set1.add("Watermelon");
	        set1.add("Nectarine");

	        System.out.println("Set1 contains Apple: " + set1.contains("Apple"));
	        System.out.println("Set1 contains Banana: " + set1.contains("Banana"));

	        set2.add("Banana");
	        set2.add("Cherry");
	        set2.add("Pineapple");
	        set2.add("Plum");
	        set2.add("Blueberry");

	        System.out.println("\nHashCodes of elements in set1:");
	        for (String fruit : set1) {
	            System.out.println(fruit + " : " + fruit.hashCode());
	        }

	        System.out.println("\nHashCodes of elements in set2:");
	        for (String fruit : set2) {
	            System.out.println(fruit + " : " + fruit.hashCode());
	        }

	        System.out.println("\nHashCode of set1: " + set1.hashCode());
	        System.out.println("HashCode of set2: " + set2.hashCode());

	        System.out.println("\nCustom Hash Codes (Length-based):");
	        for (String fruit : set1) {
	            int hash = myOwnHashCode(fruit);
	            System.out.println(fruit + " : " + hash);
	        }
	        for (String fruit : set2) {
	            int hash = myOwnHashCode(fruit);
	            System.out.println(fruit + " : " + hash);
	        }

	        Set<String> unionSet = new HashSet<>(set1);
	        unionSet.addAll(set2);
	        System.out.println("\nUnion of set1 and set2: " + unionSet);

	        Set<String> intersectionSet = new HashSet<>(set1);
	        intersectionSet.retainAll(set2);
	        System.out.println("Intersection of set1 and set2: " + intersectionSet);

	        Set<String> differenceSet = new HashSet<>(set1);
	        differenceSet.removeAll(set2);
	        System.out.println("Difference of set1 - set2: " + differenceSet);
	    }

	    public static int myOwnHashCode(String fruit) {
	        return fruit.length();
	        }
}
