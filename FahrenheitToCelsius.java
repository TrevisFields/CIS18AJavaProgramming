/*
WB:Trevis Fields
WO:09/18/16
WF:CIS18A M/W 3:00-5:10PM

*/
package fahrenheittocelsius;
import javax.swing.*;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        //
	double tempFahrenheit;
	String temps;
	temps = JOptionPane.showInputDialog(null, "Please enter a temperature in "
                + "fahrenheit?", "Fahrenheit Temperature", JOptionPane.QUESTION_MESSAGE);
	tempFahrenheit = Double.parseDouble(temps);
        
	double tempCelsius = (tempFahrenheit - 32) * (.55555556);
	JOptionPane.showMessageDialog(null, "Today's temperature in celsius is " + tempCelsius + ".",
	"celsius temperature", JOptionPane.PLAIN_MESSAGE);
    }
}
