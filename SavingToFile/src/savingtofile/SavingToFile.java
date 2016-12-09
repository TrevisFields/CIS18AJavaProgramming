package savingtofile;


import java.nio.file.*;
import java.io.*;


public class SavingToFile{
    
    
private static Path fileName = Paths.get("..\\SavingData\\assets\\data.txt");
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
    
    
}
























        }
