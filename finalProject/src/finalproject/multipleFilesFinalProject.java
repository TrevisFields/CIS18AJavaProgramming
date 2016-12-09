package finalproject;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;
public class multipleFilesFinalProject {
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    Path incompleteClassesFile =
            Paths.get("C:\\Java\\Chapter.13\\IncompleteClasses.rtf");
    Path completeClassesFile =
            Paths.get("..\\finalProject\\assets\\CompleteClasses.rtf");
    final String DEPARTMENT_FORMAT ="ABC";
    final String SECTION_FORMAT = "   ";
    final int SECTION_LENGTH = SECTION_FORMAT.length();
    final String GENERAL_CLASS ="ENG";
    final String CREDITS_FORMAT = "0.0";
    String delimiter = ",";
    String s = DEPARTMENT_FORMAT + delimiter + SECTION_FORMAT + delimiter + GENERAL_CLASS
            + CREDITS_FORMAT + System.getProperty("line.separator");
    final int RECSIZE = s.length();
    
    FileChannel fcIn = null;
    FileChannel fcOut = null;
    String depString;
    int section;
    String name;
    String state;
    double credit;
    final String QUIT = "000";
    
    createEmptyFile(incompleteClassesFile,s);
    createEmptyFile(completeClassesFile,s);
    }
  public static void createEmptyFile(Path file, String s)
  {
  final int NUMRECS = 10;
  try
  {
  OutputStream outputStr = new
          BufferedOutputStream(Files.newOutputStream(file, CREATE));
  BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStr));
  
  for(int count = 0; count < NUMRECS; ++count)
      writer.write(s, 0, s.length());
  writer.close();
  }
  catch(Exception e)
  {
  System.out.println("Error message: " + e);
  }
  }
}
