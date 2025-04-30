package Maps;

import java.util.HashMap;
import java.util.Map;

public class hashMaps {
	public static void main(String[]args) {
		Map<Integer,String> map= new HashMap<>(); 
		map.put(9191234, "Durga"); 
		map.put(9192367, "Suni");
		map.put(9192347, "Sam");
		map.put(9192354, "Surya");
		System.out.println("Elements in the Map"+map); 
		for(Map.Entry<Integer,String> entry: map.entrySet()) {
			System.out.println("HashCode Values in my map:"+entry.hashCode());
		} 
		System.out.println("HashCode for map: "+map.hashCode());
		for(int key:map.keySet()) {
			System.out.println(key);
		}
		System.out.println("Values from the map: "+map.values()); 
	}
}
