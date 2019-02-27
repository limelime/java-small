package net.openwritings.java.math;

public class OctalToAscii {

    public static void main(String[] args){
        // Note: octal is base 8.
        String sOctal = "355";

        // Convert Octal(base8) to decimal(base 10).
        Integer iOctal = Integer.parseInt(sOctal, 8);
        System.out.println(iOctal); // Output: 237

        // Cast decimal to its corresponding ASCII value.
        char cOctal = (char)iOctal.intValue();
        System.out.println(cOctal); // Output í
    }
}
