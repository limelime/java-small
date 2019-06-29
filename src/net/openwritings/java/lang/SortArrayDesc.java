package net.openwritings.java.lang;

import java.util.Arrays;
import java.util.Collections;
 
public class SortArrayDesc {
 
    public static void main(String[] args) {
 
        String[] fruits = new String[]{"banana", "banana 1", "banana 10", "avocado", "guava"};
 
        Arrays.sort(fruits, Collections.reverseOrder()); // Sort in descending order.
 
        for(int i=0; i<fruits.length; i++ ) {
            System.out.println(fruits[i]);
        }
    }
}