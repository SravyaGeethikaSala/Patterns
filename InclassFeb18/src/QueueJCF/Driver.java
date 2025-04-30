package QueueJCF;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Queue<String> que= new LinkedList<>();
		Queue<String> pque= new PriorityQueue<>();
		Queue<Integer> dque=new ArrayDeque<>();
		que.add("Sai");que.add("Swetha");
		que.offer("Suni");que.offer("Krish");
		System.out.println("Elements in the first queue: "+que);
		System.out.println("First Element in the queue: "+que.peek());
		System.out.println("First Element in the queue Using Element: "+que.element());
		System.out.println("delete first element in the queue: "+que.poll());
		System.out.println("Elements in the queue after delete: "+que);
		System.out.println("Checking the isEmpty: "+que.isEmpty());
		System.out.println("Remove method in the queue: "+que.remove());
		que.remove("Suni");
		System.out.println("Elements in the queue after removing the elements: "+que);
		dque.add(17);dque.offer(14);
		dque.add(16);dque.offer(21);
		System.out.println("Elements in the queue after removing the element: "+dque);
		System.out.println("First element from the Arraydeque: "+dque.peek());
		System.out.println("First element from the Arraydeque: "+dque.element());
		System.out.println("Delete element from the Arraydeque using Element:i "+dque.poll());
		
	}

}
