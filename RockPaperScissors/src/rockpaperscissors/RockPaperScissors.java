//Written By Trevis Fields
//Rock Paper Scissors
//CIS 18A Mon/Wed 2:20- 3:45 pm
//Homework Game Zone #5 pg 347
//October 10 2016

package rockpaperscissors;

import javax.swing.JOptionPane;

public class RockPaperScissors 
{
	public static void main(String[] args) 
        {
		int rock = 1;
		int paper = 2;
		int scissors = 3;
		String choice;
		int userChoice;
		int randomValue;

		choice = JOptionPane.showInputDialog(null,
				"Please choose between 1 (rock), 2 (paper), and 3 (scissors).");
		userChoice = Integer.parseInt(choice);

		randomValue = ((int) (Math.random() * 3)+1);
		System.out.println(randomValue);

		if (userChoice == randomValue) {
			JOptionPane.showMessageDialog(null, "It is a tie!");
		} else if (userChoice == rock && randomValue == paper) {
			JOptionPane.showMessageDialog(null, "Paper covers rock! You lose!");
		} else if (userChoice == rock && randomValue == scissors) {
			JOptionPane.showMessageDialog(null, "Rock smashes scissors! You win!");
		}

		else if (userChoice == paper && randomValue == rock) {
			JOptionPane.showMessageDialog(null, "Paper beats rock! You win!");
		}

		else if (userChoice == paper && randomValue == scissors) {
			JOptionPane.showMessageDialog(null, "Scissors cuts paper! You lose!");
		}

		else if (userChoice == scissors && randomValue == rock) {
			JOptionPane.showMessageDialog(null, "Rock smashes scissors! You lose!");
		}

		else if (userChoice == scissors && randomValue == paper) {
			JOptionPane.showMessageDialog(null, "Scissors cuts paper! You win!");
		}

	}
}
