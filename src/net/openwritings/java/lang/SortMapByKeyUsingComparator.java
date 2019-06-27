package net.openwritings.java.lang;

import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeyUsingComparator {
	
	// My comparator with my own order logic:
	//		Sort on 2nd character of fruit name in descending order.
	public static class SortOn2ndChar implements Comparator<String>
	{
	  public int compare(String s1, String s2)
	  {
		  char s1char = s1.charAt(1); // Get 2nd character of 1st string.
		  char s2char = s2.charAt(1); // Get 2nd character of 2nd string.
		  if (s1char > s2char)
			  return -1;
		  else if(s1char < s2char)
			  return 1;
		  else
			  return 0;
	  }
	}
	
	public static void main(String[] args) {
		
        // Create a HashMap with values.
        Map<String, Double> unsortedMap = new HashMap<String, Double>();
        unsortedMap.put("pineapple", 4.99);
        unsortedMap.put("banana", 1.85);
        unsortedMap.put("guava", 0.85);
 
        // Add my own comparator & push all the data from our HashMap into the TreeMap.
        Map<String, Double> treeMap = new TreeMap<String, Double>(new SortOn2ndChar());
        treeMap.putAll(unsortedMap);
        
        // Display all elements from treeMap.
        Set< Map.Entry<String, Double> > treeSet = treeMap.entrySet();
        for (Map.Entry<String, Double> entry:treeSet) { 
            System.out.println("key: "+entry.getKey()+", Value: "+entry.getValue()); 
        } 		
	}
}
