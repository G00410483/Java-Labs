import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class Joption20
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		String input;
		int num1 = 0;
		int rand1 = 0;
		int turn = 0;

		rand1 = randomNumber.nextInt(10);

		for (int i = 1; i <=6 && rand1 != num1; i++)
		{

			input = JOptionPane.showInputDialog("Guess the number between 1 and 100:");
			num1 = Integer.parseInt(input);
			turn++;

			if (rand1 > num1)
			{
				JOptionPane.showMessageDialog(null, "Too Low", "Turn " + turn, JOptionPane.ERROR_MESSAGE);
			}
			else if (rand1 < num1)
			{
				JOptionPane.showMessageDialog(null, "Too High", "Turn " + turn, JOptionPane.ERROR_MESSAGE);
			}
			else if (rand1 == num1)
			{
				JOptionPane.showMessageDialog(null, "Congrats. You won.", "Winner Winner, Chicken Dinner!", JOptionPane.INFORMATION_MESSAGE);
			}
			else if (i > 6 && rand1 != num1)
			{
				JOptionPane.showMessageDialog(null, "Sorry, you didn't win. Answer was " + rand1 , "That's a shame", JOptionPane.WARNING_MESSAGE);
			}
		}







	}
}
