import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String choice;
		String input;
		double amount;


		choice = JOptionPane.showInputDialog ("Enter G to convert Sterling to euros or E to convert Euros to Sterling: ");

		input = JOptionPane.showInputDialog ("Enter amount: ");
		amount = Double.parseDouble(input);

		if (choice.equalsIgnoreCase("E"))
		{
			JOptionPane.showMessageDialog(null, amount + " Euros is " + (amount*0.8391) + " Sterling.");
		}
		else if (choice.equalsIgnoreCase("G"))
		{
			JOptionPane.showMessageDialog(null, amount + " Sterlings is " + (amount*1.1917) + " Euros.");
		}

		System.exit(0);
	}
}
