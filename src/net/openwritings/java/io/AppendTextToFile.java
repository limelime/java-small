package net.openwritings.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTextToFile {

	public static void main(String[] args) {

	    try
	    {
	        final String filename="file.txt";

	        // FileWriter(File file, boolean append): 
	        //	Set append boolean to true to append text.
	        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename, true)));
	        writer.println("Some text to append");
	        writer.close();
	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	}
}
