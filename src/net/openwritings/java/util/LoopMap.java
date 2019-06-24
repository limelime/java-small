package net.openwritings.java.util;


import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class LoopMap {

	public static void main(String[] args) {

		// Create a map with values.
		Map<String, Double> hmap = new HashMap<String, Double>();
		hmap.put("pineapple", 4.99);
		hmap.put("banana", 1.85);
		hmap.put("guava", 0.85);
		
		// Get the Set.
		Set< Map.Entry<String,Double> > smap = hmap.entrySet();
		
		// Loop through the Set.
		for (Map.Entry<String,Double> mentry:smap) { 
			System.out.println(mentry.getKey()+": "+mentry.getValue()); 
		} 
	}
}
