
package division;
import java.util.Scanner;

public class Division 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        float numerator, denominator, result;
        System.out.println("Welcome to the Division application!");
        System.out.println("Please begin by entering a numerator followed by a denominator.");
        System.out.print("Enter a numerator now >> ");
        numerator =input.nextInt();
        
        //use a do-while loop for the denominator if the user inputs 0 
        //inform the user that you can not divide by 0 and then have the user re-enter a proper value
        do{
        System.out.print("Enter a denominator now >> ");
        denominator = input.nextInt();
        //if denominator is 0 inform the user that cannot be done and have them try again 
        if(denominator == 0)
        {
            System.out.println("Cannot divide by 0");
            System.out.println("Please enter in a proper value");
        }
            else
        {
            result = numerator / denominator;
            System.out.println(numerator + " / " + denominator +
                    " = " + result);
        }
          }while(denominator == 0);
        }
}
