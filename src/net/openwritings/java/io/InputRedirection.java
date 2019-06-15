package net.openwritings.java.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class InputRedirection
{
 
  public static void main(String[] args)
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
 
    try
    {
      while( (line = reader.readLine()) != null )
      {
        if(line.length()==0)// Quit if user presses Enter. 
          System.exit(0);
 
        System.out.println(line);
      }
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
  }
 
}
