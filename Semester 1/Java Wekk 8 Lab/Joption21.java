import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class Joption21
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		String name;
		int randUser = 0;
		int randDealer;
		int result = 0;

		name = JOptionPane.showInputDialog("Enter your name:");

		for (int i = 0; i <=10; i++)
		{
			randUser = randomNumber.nextInt(6)+1;
			randDealer = randomNumber.nextInt(6)+1;

			JOptionPane.showMessageDialog(null, "Rolling the dice", "Messege", JOptionPane.INFORMATION_MESSAGE);

			if (randUser > randDealer)
			{
				JOptionPane.showMessageDialog(null, "You win!\nThe dealer rolled " + randDealer + "\n" + name + " rolled a " + randUser, "Messege", JOptionPane.INFORMATION_MESSAGE);
				result++;
			}
			else if (randUser < randDealer)
			{
				JOptionPane.showMessageDialog(null, "You lose!\nThe dealer rolled " + randDealer + "\n" + name + " rolled a " + randUser, "Messege", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (randUser == randDealer)
			{
				JOptionPane.showMessageDialog(null, "No winner!\nThe dealer rolled " + randDealer + "\n" + name + " rolled a " + randUser, "Messege", JOptionPane.INFORMATION_MESSAGE);
			}
		}

		JOptionPane.showMessageDialog(null, "You won " + result + " games", "Messege", JOptionPane.INFORMATION_MESSAGE);














	}
}
