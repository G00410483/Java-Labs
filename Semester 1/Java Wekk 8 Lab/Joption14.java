import javax.swing.JOptionPane;
import java.util.Scanner;

public class Joption14
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		String output;
		String title;
		int amount;
		String num1;

		output = JOptionPane.showInputDialog ("What words will be output: ");
		title = JOptionPane.showInputDialog ("What is the messege title: ");
		num1 = JOptionPane.showInputDialog ("Enter number of times word should be entered: ");
		amount = Integer.parseInt(num1);

		for (int i = amount; i >= 1; i--)
		{
			JOptionPane.showMessageDialog(null, output + " " + i, title, JOptionPane.PLAIN_MESSAGE);
		}


	}
}
