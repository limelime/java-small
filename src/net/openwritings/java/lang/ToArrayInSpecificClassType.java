package net.openwritings.java.lang;

import java.util.ArrayList;

public class ToArrayInSpecificClassType
{
    public static void main(String[] args){
        // Create sample data.
        ArrayList<String> myStrings = new ArrayList<String>();
        myStrings.add("ab");
        myStrings.add("cd"); 
        myStrings.add("ef");

        // This will return an array of object. But is not want to want.
        Object[] oStrings = myStrings.toArray();

        // Now, convert object strings into an array of specific class type(i.e String).
        String[] arrStrings = myStrings.toArray(new String[0]);
    }
}
