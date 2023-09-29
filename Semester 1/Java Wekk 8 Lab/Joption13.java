import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption13
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String input;
		int amount;
		String output = "";

		input = JOptionPane.showInputDialog ("Multiplication Table\n\nEnter a number to generate multiplication tables for: ");
		amount = Integer.parseInt(input);

		for (int i = 1; i <= 10; i++)
		{
			output =  output + amount + " times " + i + " is " + (amount*i) + "\n";
		}

		JOptionPane.showMessageDialog(null, output, amount + " times table", JOptionPane.PLAIN_MESSAGE);

	}
}
