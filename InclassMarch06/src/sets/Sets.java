package sets;

import java.util.Set; 
import java.util.Arrays; 
import java.util.HashSet; 
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet; 

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Set<String> hashSet = new HashSet<>(); 
		Set<String> linkedHashSet = new LinkedHashSet<>(); 
		Set<String> treeSet = new TreeSet<>(); 
		
		List<String> colors = 
				Arrays.asList("Red","Yellow","Violet","Pink","Blue","Orange","Purple","White","Red"); 
		hashSet.addAll(colors);
		linkedHashSet.addAll(colors);
		treeSet.addAll(colors);
		System.out.println("Original Colors: "+colors); 
		System.out.println("Elements in hashset: "+hashSet); 
		System.out.println("Elements in linkedHashSet: "+linkedHashSet); 
		System.out.println("Elements in treeset: "+treeSet); 
		hashSet.add(null);hashSet.add(null); 
		System.out.println("Adding nulls"); 
		System.out.println("Elements in hashset after adding null: "+hashSet); 
		linkedHashSet.add(null); 
		System.out.println("Elements in linkedhashset after adding null: "+linkedHashSet); 
//		treeSet.add(null); 
//		System.out.println("Elements in treeset after adding null: "+treeSet); 
		
		System.out.println("Checking using contains:"+hashSet.contains("Pink")); 
		System.out.println("Checking the linkedhashset and hashset is equal: "+hashSet.equals(linkedHashSet)); 
		
	}

}
