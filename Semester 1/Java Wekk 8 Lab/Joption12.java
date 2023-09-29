import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption12
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		String input;
		int amount;

		input = JOptionPane.showInputDialog ("Enter a number to generate multiplication tables for: ");
		amount = Integer.parseInt(input);

		for (int i = 1, i <= 10, i++)
		{
		JOptionPane.showMessageDialog(null, amount + " times " + i + " is" + (i*amount), amount + " times table", JOptionPane.PLAIN_MESSAGE);
		}


	}
}
