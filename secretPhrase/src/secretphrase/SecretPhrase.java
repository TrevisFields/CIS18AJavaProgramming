package secretphrase;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SecretPhrase 
{
    public static void main(String[] args) 
    {
        //Class         object          = new constructor()
        final String    SECRET_PHRASE   = "GO TEAM";
        StringBuilder   sb              = new StringBuilder("G* T***");
        
        do
        {
            String input = JOptionPane.showInputDialog(null,
                                sb.toString() + "\nGuess the phrase:").toUpperCase();
            
            if(input.equals(SECRET_PHRASE))
                {
                    sb = new StringBuilder(input);
                }else
                {
                    for(int i = 0; i < SECRET_PHRASE.length(); i++)
                    {
                        if(input.charAt(0) == SECRET_PHRASE.charAt(i))
                        {
                            sb.replace(i, i+1, String.valueOf(input.charAt(0)));
                        }
                    }
                }
            
        }while(!sb.toString().equals(SECRET_PHRASE));
        //keep looping WHILE the StringBuilder is NOT equal to SECERT PHRASE
        
        JOptionPane.showMessageDialog(null, "WELCOME TO THE JUSTICE LEAUGE, " + sb.toString());
    }
    
}