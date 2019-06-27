package net.openwritings.java.lang;

import java.util.Arrays;
import java.util.Comparator;

public class SortArrayUsingComparator {
	
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
		
		String[] fruits = new String[]{"banana", "avocado", "guava"};
		
		Arrays.sort(fruits, new SortOn2ndChar());
		
		for(int i=0; i<fruits.length; i++ ){
			System.out.println(fruits[i]);
		}
	}
}
