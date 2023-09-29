import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption15
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		int choice;

		choice = JOptionPane.showConfirmDialog(null, "Click yes, no or cancel", "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		if (choice == 0)
		{
			JOptionPane.showMessageDialog(null, "You clicked Yes!", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else if (choice == 1)
		{
			JOptionPane.showMessageDialog(null, "You clicked No!", "Messege", JOptionPane.PLAIN_MESSAGE);
		}
		else if (choice == 2)
		{
			JOptionPane.showMessageDialog(null, "You clicked Cancel!", "Messege", JOptionPane.PLAIN_MESSAGE);
		}



	}
}
