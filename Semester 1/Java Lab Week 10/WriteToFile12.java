import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile12
{
	public static void main(String[] args) throws IOException
	{
		String name;
		String startCount;
		String finishCount;
		int num1;
		int num2;
		int choice1;
		int choice2;

		name = JOptionPane.showInputDialog("Enter file name:");

		startCount = JOptionPane.showInputDialog("Start count at:");
		num1 = Integer.parseInt(startCount);

		finishCount = JOptionPane.showInputDialog("Finish count at:");
		num2 = Integer.parseInt(finishCount);

		choice1 = JOptionPane.showConfirmDialog(null, "Output to screen",
		"Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);

		choice2 = JOptionPane.showConfirmDialog(null, "Output to file",
		"Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);


		if (choice1 == 0)
		{
			for (int i = num1; i <= num2; i++)
			{
				System.out.println(i);
			}
		}
		if (choice2 == 0)
		{
			for (int i = num1; i <= num2; i++)
			{
				PrintWriter outputFile = new PrintWriter(name);
				i = i + i;
				outputFile.println(i);
				outputFile.close();
			}
		}
	}
}