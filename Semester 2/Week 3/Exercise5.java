import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercise5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int cost, percentage;
		String costString, percentageString;

		costString = JOptionPane.showInputDialog("Enter the items's wholesale cost:");
		cost = Integer.parseInt(costString);
		percentageString = JOptionPane.showInputDialog("Enter the items's markup percentage:");
		percentage = Integer.parseInt(percentageString);

		int total = result (cost, percentage);

		JOptionPane.showMessageDialog(null, "The item's retail price is " + total);
		System.out.println(total);

	}
	public static int result(int cost, int percentage)
	{
		int sum = cost + percentage;
		return sum;
	}
}