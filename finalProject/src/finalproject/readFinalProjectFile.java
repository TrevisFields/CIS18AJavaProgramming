
package finalproject;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class readFinalProjectFile 
{
    public static void main(String[] args)
    {
        Scanner keyBoard = new Scanner(System.in);
        Path file =
                Paths.get("..\\CreateFinalProjectFile\\assests\\ClassSchedule.rtf");
        String s = "000,       ,00.00" +
                System.getProperty("line.separator");
        final int RECSIZE = s.length();
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc = null;
        String idString;
        int id;
        final String QUIT = "ZZZ";
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            System.out.print("Enter 3 letter class or " +
                    QUIT + " to quit >> ");
            idString = keyBoard.nextLine();
            while(!idString.equals(QUIT))
            {
                id = Integer.parseInt(idString);
                buffer = ByteBuffer.wrap(data);
                fc.position(id * RECSIZE);
                fc.read(buffer);
                s = new String(data);
                System.out.println("ID #" + id + " " + s);
                System.out.printf("Enter employee ID number or " +
                        QUIT + "to quit >> ");
                idString = keyBoard.nextLine();
            }
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Erroe message: " + e);
        }
    }
}

