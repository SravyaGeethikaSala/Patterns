package List;
import java.util.*;

public class list_Driver {
	public static void main(String[]args) {
		List<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>(); 
		String[] arr1 = {"Geethika","Aditya","Mukund"};
		List<String> list3 = new LinkedList<>(Arrays.asList(arr1));
		System.out.print(list3);
		
		String[] arr2 = {"satya","sanju","vinay"};
		List<String> list4 = new LinkedList<>();
		for(int i=0;i<arr2.length;i++) {
			String name= arr2[i];
			list4.add(name);
		}
		System.out.println(list4);
	
	List<String> list5 = new LinkedList<>();
	list5.add("durga"); list5.add("varsha"); list5.add("ashwith");
	
	String[] arr5= list5.toArray(new String[0]);
	System.out.println("Elements in the array");
	
//	for(int i=0;i<list5.size();i++) {
//		String name = arr2[i];
//		list4.add(name);
//	}
//	System.out.println(list4);
//	}
	
	for (String name : list5) {
		int i = 0;
		arr5[i] = name;
		i++;
	}
	
	System.out.println("Elements in the Array:");
	for (int i = 0; i < list5.size(); i++) {
		System.out.println(arr5[i] + "");
	}
	}
}
