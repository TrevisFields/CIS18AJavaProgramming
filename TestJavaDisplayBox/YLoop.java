public class First  
{
    public static void main (String[] args)
    {
        System.out.println(“First Java Application”);
    }
}

/*The First class*/

//************************************************************************

public class AnyClassName
{
    public static void main(String[] args)
    {
        /*****************/
    }
}

/*Shell code*/

//******************************************************************


public class Hello
{
    public static void main (String[] args)
    {
        System.out.println(“Hello World!”);
    }
}

/*You Do It */



//*******************************************************************

public class HelloErrors
{
    public static void main (String[] args)
    {
        System.out.println(“Hello!”);
        System.out.println(“This is a test”);
    }
}

/*You Do it Part 2*/


//******************************************************************

public class First
{
    public static void main (String[] args)
    {   
        System.out.println ("My New and improved");
        System.out.println ("Java application");
    }
}

/*New and improved Java application*/


//**********************************************************

//FileName Hello2.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]

/* This class demonstrates the use of the println()
 method to print the message Hello World! */

public class Hello2
{
    public static void main(String[] args)
    {/* Comments can be placed anywhere within the code and the compiler will over look it and only print out the text seen after println() */
        System.out.println("Hello World!")//This shows that only the message Hello World! will be printed to the screen
    }
}

//***********************************************************

import javax.swing.JOptionPane;
public class FirstDialog
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "First Java Dialog");
    }
}

/*First Dialog box to be displayed to screen*/


//*******************************************************************

//FileName HelloDialog.java
//Written By: Trevis J Fields SID#: 2276714
//Written on: [DATE HERE]

import javax.swing.JOptionPane;

public class HelloDialog
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Hello World!");
    }
}


/*You do it part 3*/

//***************************************************************


/*Look up the Printstream hyperlink*/

/* www.oracle.com/technetwork/
 java/index.html
*/

/*You do it part 4*/


//************************************************************
//FileName: FullName.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]



public class FullName
{
    public static void main(string[] args)
    {
        System.out.println("Hello Trevis J Fields, and Welcome to Java CIS 18A!");
    }
}
/* Chapter:1 
   exercise:5 
*/


//****************************************************************


//FileName PersonalInfo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]


import javax.swing.JOptionPane;

public class PersonalInfo
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Name: Trevis J. Fields");
        JOptionPane.showMessageDialog(null,"Cell: (951)-623-9599");
        JOptionPane.showMessageDialog(null,"Email Primary: Tfields3@studnet.rcc.edu");
        JOptionPane.showMessageDialpg(null,"Email Secondary: Trevis42@gmail.com");
    }
}


/*
 Chapter:1
 Exercise:6
*/


//**************************************************************************



//FileName TableAndChairs.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]





public class TableAndChairs
{
    public static void main(String[] args)
    {
        System.out.println("X                    X");
        System.out.println("X                    X");
        System.out.println("X     XxxxxxxxxX     X");
        System.out.println("XxxxX X        X XxxxX");
        System.out.println("X   X X        X X   X");
        System.out.println("X   X X        X X   X");
    }
}



/*
 Chapter: 1
 Exercise: 7
 */




//**************************************************************************************



//FileName RandomGuess.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]

import javax.swing.JOptionpane;
import java.util.Random;

public class RandomGuess
{
    public static void main(String[] args)
    {
        Random guess = new Random();
        final int Limit =5;
        JOptionPane.showMessageDialog(null,"The number is "  + (1 + (int)(Math.random() * 10)));
        System.out.println(guess);
    }
}


//*******************************************************************************************



//FileName DataDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]



public class DataDemo
{
    public static void main(String[] args)
    {
        int aWholeNumber = 315;
        System.out.print("The number is ");
        System.out.println(aWholeNumber);
    }
}


/*initialized data demo */



//**********************************************************************************


//FileName DataDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]


public class DataDemo
{
    public static void main(String[] args)
    {
        int aWholeNumber = 315;
        final int STATES_IN_US = 50;
        System.out.print("The number is ");
        System.out.println(aWholeNumber);
        System.out.println("the number of states is "+ STATES_IN_US);
    }
}


//******************************************************************************


//FileName IntegerDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]



public class IntegerDemo
{
    public static void main(String[] args)
    {
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;
        
        System.out.println("The int is "+ anInt);
        System.out.println("The byte is "+ aByte);
        System.out.println("The short is "+ aShort);
        System.out.println("The long is "+ aLong);
    }
}




//*********************************************************************************









//FileName CharDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]


public class CharDemo
{
    public static void main(String[] args)
    {
        char initital = 'A';
        System.out.println(initial);
        System.out.println("\t\"abc\\def\\bghi\n\njkl");
    }
}



//***********************************************************************************




//FileName IntegerDemoInteractive.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]


import java.util.Scanner;

public class IntegerDemoInteractive
{
    public static void main(String[] args)
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
    }
}


//****************************************************************************************





//FileName IntegerDemoInteractiveWithName.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]


import java.util.Scanner;

public class IntegerDemoInteractive
{
    public static void main(String[] args)
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();
        input.nextline();
        
        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.print("Thank you, " + name);
    }
}

//********************************************************************************************





//FileName ArithmeticDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]

import java.util.Scanner;

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        int fistNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum/2;
        System.out.print(firstNumber + "+" secondNumber + "is" + sum);
        System.out.print(firstNumber + "-" secondNumber + "is" + difference);
        System.out.print("The average of" + firstNumber + "and" + secondNumber + "is" + average);
        
    }
}



//********************************************************************************************






//FileName ArithmeticDemo2.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]

import java.util.Scanner;

public class ArithmeticDemo2
{
    public static void main(String[] args)
    {
        double fistNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum/2;
        System.out.print(firstNumber + "+" secondNumber + "is" + sum);
        System.out.print(firstNumber + "-" secondNumber + "is" + difference);
        System.out.print("The average of" + firstNumber + "and" + secondNumber + "is" + average);
        
    }
}


//***************************************************************************************************

//FileName ArithmeticDemo3.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]

import java.util.Scanner;

public class ArithmeticDemo3
{
    public static void main(String[] args)
    {
        int fistNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) (sum/2);
        System.out.print(firstNumber + "+" secondNumber + "is" + sum);
        System.out.print(firstNumber + "-" secondNumber + "is" + difference);
        System.out.print("The average of" + firstNumber + "and" + secondNumber + "is" + average);
        
    }
}


//******************************************************************************************************


//FileName ArithmeticDemo.java
//Written By: Trevis J. Fields SID#:2276714
//Written on: [DATE HERE]



























































