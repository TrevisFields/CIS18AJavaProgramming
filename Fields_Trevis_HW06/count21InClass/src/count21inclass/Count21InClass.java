
package count21inclass;
import java.util.Scanner;
public class Count21InClass 
{

    
    public static void main(String[] args) 
    {
       int player, cpu, total = 0;
       Scanner input = new Scanner(System.in);
       
       cpu = 1;
       System.out.println("CPU chose " + cpu);
       total += cpu;
       System.out.println("TOTAL: " + total);
       
       
               
       do
       {
           System.out.print("Enter a number from 1-3 >> ");
           player = input.nextInt();
           
           if(player > 3 || player < 0)
           {
               System.out.println("INVALID ENTRY. TRY AGAIN");
           }else 
           {
               switch(player)
               {
                   case 1:
                       total += player;
                       System.out.println("PLAYER chose "+ player);
                       System.out.println("TOTAL: " + total);
                       if (total <= 21)
                       {
                        cpu = 3;
                        System.out.println("CPU chose " + cpu);
                        total += cpu;
                        System.out.println("TOTAL: " + total);
                       }
                       break;
                       
                   case 2:
                       total += player;
                       System.out.println("PLAYER chose "+ player);
                       System.out.println("TOTAL: " + total);
                       if (total <= 21)
                       {
                        cpu = 2;
                        System.out.println("CPU chose " + cpu);
                        total += cpu;
                        System.out.println("TOTAL: " + total);
                       }
                       break;
                   case 3:
                       total += player;
                       System.out.println("PLAYER chose "+ player);
                       System.out.println("TOTAL: " + total);
                       if (total <= 21)
                       {
                        cpu = 1;
                        System.out.println("CPU chose " + cpu);
                        total += cpu;
                        System.out.println("TOTAL: " + total);
                       }
                       break;
               }
           }
           
       }while(total <= 21);
       if(total > 21){
           System.out.println("You lose");
       }
    }
    
}
