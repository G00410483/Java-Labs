import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption16
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		int choice1;
		int choice2;

		choice1 = JOptionPane.showConfirmDialog(null, "Was the java programming language first realised in 1995?", "Yes or No", JOptionPane.YES_NO_OPTION);

		if (choice1 == 0)
		{
			JOptionPane.showMessageDialog(null, "That is correct !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else if (choice1 == 1)
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}


		choice2 = JOptionPane.showConfirmDialog(null, "Is java object- oriented language?", "Yes or No", JOptionPane.YES_NO_OPTION);

		if (choice2 == 0)
		{
			JOptionPane.showMessageDialog(null, "That is correct !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else if (choice2 == 1)
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong answer. Try again !", "Messege", JOptionPane.PLAIN_MESSAGE);
		}


	}
}
