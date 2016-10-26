//Written by Trevis Fields
//Written on 10-7-15
//CIS 18A Mon/Wed 2:20- 3:45 pm


import javax.swing.JOptionPane;


public class Count21 
{
	public static void main(String[] args) 
	{
		
	//datatype(s) and variable
		int            userChoice = 0;
		int            cpuChoice = 1;
		int            total = 0;
		
		boolean        whenGameOver = false;
		
		//Class and object
		String         userInput;
		
		total += cpuChoice;
		JOptionPane.showMessageDialog(null, "Welcome to 21.\nTry not to go over 21.");
		JOptionPane.showMessageDialog(null, "The Computer starts the game and selects: " + cpuChoice);
		
       
		do 
		{
			userInput = JOptionPane.showInputDialog(null, "Enter a number from 1 to 3.");
			userChoice = Integer.parseInt(userInput); //Convert string object to integer
			
			//testing for wrong choices
			if(userChoice >= 4 || userChoice <= 0)
			{
				JOptionPane.showMessageDialog(null, "Invalid Entry");
			}
			else if(userChoice == 1)
			{
				//If the total is 21 and above, set isGameOver to true
				if(total >= 21)
				{
					JOptionPane.showMessageDialog(null, "Sorry but you lose!");
					whenGameOver = true;
				}
				else {
				JOptionPane.showMessageDialog(null, "Your hand: " + userChoice);
				total +=userChoice;
				JOptionPane.showMessageDialog(null, "The current total: " + total);
				cpuChoice = 3;
				JOptionPane.showMessageDialog(null, "Computer pick: " + cpuChoice);
				total += cpuChoice;
				JOptionPane.showMessageDialog(null, "The current total: " + total);
				}
			}
			
			else if(userChoice == 2)
			{
				//If the total is 21 and above, set whenGameOver to true
				if(total >= 21)
				{
					JOptionPane.showMessageDialog(null, "Sorry, you lose");
					whenGameOver = true;
				}
				else {
				JOptionPane.showMessageDialog(null, "You chose " + userChoice);
				total +=userChoice;
				JOptionPane.showMessageDialog(null, "The current total is " + total);
				cpuChoice = 2;
				JOptionPane.showMessageDialog(null, "CPU chose " + cpuChoice);
				total += cpuChoice;
				JOptionPane.showMessageDialog(null, "The current total is " + total);
				}
			}
				
			else if(userChoice == 3)
			{
                //copied from above code with a few changes
				if(total >= 21)
					
				{
					JOptionPane.showMessageDialog(null, "Sorry, you Lose.");
					whenGameOver = true;
				}
				else {
				JOptionPane.showMessageDialog(null, "You chose " + userChoice);
				total +=userChoice;
				JOptionPane.showMessageDialog(null, "The current total is " + total);
				cpuChoice = 1;
				JOptionPane.showMessageDialog(null, "CPU chose " + cpuChoice);
				total += cpuChoice;
				JOptionPane.showMessageDialog(null, "The current total is " + total);
				}
			}
		
			
			System.out.println("Test");
			
		}while (whenGameOver == false);
		
	}
}
