import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile16
{
	public static void main(String[] args) throws IOException
	{
		String name;
		String payroll = "";
		int choice1;
		int choice2 = 0;

		PrintWriter outputFile = new PrintWriter("Payroll.txt");

		while (choice2 == 0)
		{
			name = JOptionPane.showInputDialog("Enter employee name:");

			choice1 = JOptionPane.showConfirmDialog(null, "Is this employee permanent", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);
			FileWriter fwriter = new FileWriter("Payroll.txt", true);

			if (choice1 == 0)
			{
				payroll = "===============\nEmployee: " + name + "\nWage: $250\n===============";
				System.out.println(payroll);
				outputFile.println(payroll);
			}
			else if (choice1 == 1)
			{
				payroll = "===============\nEmployee: " + name + "\nWage: $150\n===============";
				System.out.println(payroll);
				outputFile.println(payroll);
			}
			choice2 = JOptionPane.showConfirmDialog(null, "Add another record", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);
		}
		outputFile.close();
	}
}