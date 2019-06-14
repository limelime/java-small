package net.openwritings.java.util.properties;

import java.util.Properties;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class MyProperties
{
    public static void main(String args[]){
        /**
        * Create and save the properties into a file.
        */

        // Create the properties object and add some values.
        Properties oWriteProperties = new Properties();
        oWriteProperties.setProperty("key1", "value1");
        oWriteProperties.setProperty("key2", "value2");
        oWriteProperties.setProperty("chinese", "中文");

        // Save properties into file. 
        try{
            oWriteProperties.store(new FileOutputStream("myproperties.properties"), 
            											"my first properties list");
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        /**
        * Read properties file created.
        */
        Properties oReadProperties = new Properties();
        try{
            oReadProperties.load(new FileInputStream("myproperties.properties"));
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(oReadProperties.getProperty("key2"));
        System.out.println(oReadProperties.getProperty("chinese"));
    }
}