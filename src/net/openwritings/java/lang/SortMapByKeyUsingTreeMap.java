package net.openwritings.java.lang;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeyUsingTreeMap {
	
	public static void main(String[] args) {
		
        // Create a HashMap with values.
        Map<String, Double> unsortedMap = new HashMap<String, Double>();
        unsortedMap.put("pineapple", 4.99);
        unsortedMap.put("banana", 1.85);
        unsortedMap.put("guava", 0.85);
 
        // Push all the data from our HashMap into the TreeMap.
        Map<String, Double> treeMap = new TreeMap<String, Double>(unsortedMap);
        
        // Display all elements from treeMap.
        Set< Map.Entry<String, Double> > treeSet = treeMap.entrySet();
        for (Map.Entry<String, Double> entry:treeSet) { 
            System.out.println("key: "+entry.getKey()+", Value: "+entry.getValue()); 
        } 		
	}
}
