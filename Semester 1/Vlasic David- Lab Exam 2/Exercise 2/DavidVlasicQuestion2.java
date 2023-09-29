//David Vlasic, G00410483
import javax.swing.JOptionPane;

public class DavidVlasicQuestion2
{
	public static void main(String[] args)
	{

		JOptionPane.showMessageDialog(null, "Welcome to Java Conversion Program.", "Messege", JOptionPane.INFORMATION_MESSAGE);

		String dollarAmount;//String dollars which will be converted to double
		double dollar;
		int choiceContinue = 0;//Value of choice is Yes (0), so the loop can start

		while (choiceContinue == 0)// Loop start
		{
			dollarAmount = JOptionPane.showInputDialog("Enter dollar amount to be converted:");
			dollar = Double.parseDouble(dollarAmount);
			choiceContinue = JOptionPane.showConfirmDialog(null, dollar + " dollar is " + (dollar*0.88) + " euros.\n\nDo you want to perform another conversion?", "Choose an Option", JOptionPane.YES_NO_OPTION);
		}

		if (choiceContinue == 1)// If user wants loop to finish
		{
			System.exit(0);
		}
	}
}
