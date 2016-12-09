
package finalproject;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class createFinalProjectFile 
{
 public static void main( String[] args)
 {
     Scanner input = new Scanner(System.in);
     Path file =
             Paths.get("..\\CreateFinalProjectFile\\assests\\ClassSchedule.rtf");
     String s = "ABC-000" +
             System.getProperty("line.separator");
     final int RECSIZE = s.length();
     FileChannel fc = null;
     String delimiter = ",";
     String classString;
     int id;
     String name;
     
     final String QUIT = "ZZZ";
     try
     {
         fc =(FileChannel)Files.newByteChannel(file, READ, WRITE);
         System.out.print("Enter 3 letter Class >> ");
         classString = input.nextLine();
         while(!(classString.equals(QUIT)))
         {
             id = Integer.parseInt(classString);
             System.out.print("Enter 3 numbers for course >>" +
                     id + " >> ");
             name = input.nextLine();
             
             s = classString + delimiter + name + delimiter +
                      System.getProperty("line.separator");
             byte[] data = s.getBytes();
             ByteBuffer buffer = ByteBuffer.wrap(data);
             fc.position(id * RECSIZE);
             fc.write(buffer);
             System.out.print("Enter next 3 letter course or " +
                     QUIT + " to quit >> ");
             classString = input.nextLine();
         }
         fc.close();
     }
     catch (Exception e)
     {
         System.out.println("Error message: " + e);
     }
 }
}
