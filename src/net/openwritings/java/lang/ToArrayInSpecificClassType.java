package net.openwritings.java.lang;

import java.util.ArrayList;

public class ToArrayInSpecificClassType
{
    public static void main(String[] args){
        // Create sample data.
        ArrayList<String> lStrings = new ArrayList<String>();
        lStrings.add("ab"); lStrings.add("cd"); lStrings.add("ef");

        // This will return an array of object. It isn't what we want.
        Object[] oStrings = lStrings.toArray();

        // This will return an array of specific class type(i.e String).
        String[] aStrings = lStrings.toArray(new String[0]);
    }
}
