
package finalproject;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.FileReader;

import java.nio.file.*;
import java.io.*;

public class savingToFileFinalProject {
 /*      
 //NOTE Will have to change '.rtf' extension to '.txt' when running on Windows.
    
private static Path fileName = Paths.get("..\\SavingData\\assets\\data.rtf");
//saving data into text file
public static void saveToFile(String textToBeSaved){


OutputStream os; 
try{
    os = new BufferedOutputStream(Files.newOutputStream(fileName, StandardOpenOption.CREATE));
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

writer.write(textToBeSaved);

writer.close();
}catch (IOException e)
{e.printStackTrace();}
}



//////////////////////////////////////////////////////////////////
public static String loadDataToString(){
InputStream is; 
String s ="";
try{
    is = new BufferedInputStream(Files.newInputStream(fileName, StandardOpenOption.READ));
BufferedReader reader = new BufferedReader(new InputStreamReader(is));

 s = reader.readLine();

reader.close();

}catch (IOException e)
{e.printStackTrace();}
return s;
}
    
 */
    public static void main(String[] args) throws Exception
    {
        //Scanner read = new Scanner(System.in)
        FileReader file = new FileReader("..\\finalProject\\assets\\Freshman.rtf");
        BufferedReader reader = new BufferedReader(file);
        
        String text = "";
        String line = reader.readLine();
        while(line != null)
        {
            text += line;
            line = reader.readLine();
            System.out.println(text);
        }
    }
}


