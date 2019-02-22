package net.openwritings.xngo.tutorial.lang;

/**
 * Show the minimum and the maximum value of Java primitive data types.
 * Note: Unlike other languages(e.g. C/C++), Java doesn't provide unsigned types of their integers.
 * @author Xuan Ngo
 *
 */
public class BoundariesOfPrimitiveDataTypes
{
    public static void main(String[] args)
    {
        String s = "";
 
        // Byte
        s = String.format("%-24s: min = %,-27d, max = %,-27d", Byte.class, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(s);
 
        // Short
        s = String.format("%-24s: min = %,-27d, max = %,-27d", Short.class, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(s);
 
        // Integer
        s = String.format("%-24s: min = %,-27d, max = %,-27d", Integer.class, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(s);
 
        // Long
        s = String.format("%-24s: min = %,-27d, max = %,-27d", Long.class, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(s);
 
        // Float
        s = String.format("%-24s: min = %-27s, max = %,f", Float.class, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println(s);
 
        // Double
        s = String.format("%-24s: min = %-27s, max = %s", Double.class, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(s);
 
        // Boolean
        s = String.format("%-24s: min = %-27b, max = %b", Boolean.class, Boolean.FALSE, Boolean.TRUE);
        System.out.println(s);
 
    }
}