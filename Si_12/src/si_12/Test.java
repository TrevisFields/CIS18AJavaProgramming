package si_12;
import java.util.Scanner;
public class Test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userInput;
        Member member;
        
       System.out.println("ONLINE BANKING\nTHE NEW WAY TO HAVE PEACE OF MIND");
       System.out.println("DO YOU WANT TO MAKE A PERSONAL ACCOUNT? Y/N");
       userInput = input.nextLine().toUpperCase();
       
       if(userInput.charAt(0) == 'Y')
       {
           System.out.print("ENTER NAME >> ");
           userInput = input.nextLine().toUpperCase();
           int id = 19;
           member = new PersonalAccount(id, userInput, 25);
       } else{
           System.out.print("ENTER NAME >>");
           userInput = input.nextLine().toUpperCase();
           int id = 1000;
           member = new Member(id, userInput, 100);
       }
       member.displayInfo();
    }
    
}
