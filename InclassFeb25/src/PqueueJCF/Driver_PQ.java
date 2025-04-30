package PqueueJCF;

import java.util.*;

public class Driver_PQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Queue<Integer> pq= new PriorityQueue<>();
		pq.add(20); pq.add(30); 
		pq.offer(10); pq.offer(1);
		System.out.println("Elements in PQ:"+pq); 
		
		PriorityQueue<Element> pqint= new PriorityQueue<>(); 
		pqint.add(new Element(10,5));
		pqint.add(new Element(50,3));
		pqint.add(new Element(40,1));
		pqint.add(new Element(30,2));
		pqint.add(new Element(20,4));
		
		while(!pqint.isEmpty()) {
			System.out.println("Elements: "+pqint.poll());
		}
	}

}
