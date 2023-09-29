import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class Joption18
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		int rand;
		int choice1;

		rand = randomNumber.nextInt(10);

		choice1 = JOptionPane.showConfirmDialog(null, "Is the following number greater than 5?\n\n" + rand, "Greater than 5", JOptionPane.YES_NO_OPTION);

		if (choice1 == 0 && rand > 5)
		{
			JOptionPane.showMessageDialog(null, "That is correct !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else if (choice1 == 1 && rand < 5)
		{
			JOptionPane.showMessageDialog(null, "That is correct !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}





	}
}
