package debugthree1;

public class DebugThree1 
{    
    public static void main(String[] args) 
    {
        double myCheck = 50.00;
        double yourCheck = 19.95;
        System.out.println("The tips from: " + myCheck + " and your " 
                + yourCheck);
        calcTip(myCheck);
        calcTip(yourCheck);
    }
    public static double calcTip (double bill)
    {
        final double RATE = 0.15;
        double tip;
        
        tip = bill * RATE;
        System.out.println("The tip should be at least $" + tip);
    return tip;
    }
}
