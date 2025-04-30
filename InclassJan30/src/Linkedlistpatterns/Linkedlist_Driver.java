package Linkedlistpatterns;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_Driver {
	
	public static void main (String[]args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("java");
		list.add("python"); list.add("ruby"); 
		list.add("html");
		System.out.print("Linked list "+list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"");
		}
	}
}
