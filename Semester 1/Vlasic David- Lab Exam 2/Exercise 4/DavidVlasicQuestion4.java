//David Vlasic, G00410483
import javax.swing.JOptionPane;
import java.io.*;

public class DavidVlasicQuestion4
{
	public static void main(String[] args) throws IOException
	{
		String fileName;// String name of the file
		int choice1;// User can chose between overwritting and eppending
		String numberOfLines;// String number of lines which will be Int
		int numberLines;// Number of lines
		String content = "";// File output content

		fileName = JOptionPane.showInputDialog("Enter a file name: ");// User enters file name

		choice1 = JOptionPane.showConfirmDialog(null, "Do you want to overwrite the file?\n\n(Click YES overwrite, NO to append)", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);//User chose the option to overwrite or append

		if (choice1 == 0)// If user choses to overwrite
		{
			numberOfLines = JOptionPane.showInputDialog("How many lines of text would you like to add: ");
			numberLines = Integer.parseInt(numberOfLines);//Number of lines in a file

			PrintWriter outputFile = new PrintWriter(fileName);

			for (int i = 1; i <= numberLines; i++)// Start of the loop for content in case user wants to overwrite
			{
				content = JOptionPane.showInputDialog("Enter a content: ");
				outputFile.println(content);
			}
			JOptionPane.showMessageDialog(null, "Program complete.", "Messege", JOptionPane.INFORMATION_MESSAGE);
			outputFile.close();
		}
		else if (choice1 == 1)// If user choses to append
		{
			numberOfLines = JOptionPane.showInputDialog("How many lines of text would you like to add: ");
			numberLines = Integer.parseInt(numberOfLines);//Number of lines appended

			FileWriter fwriter = new FileWriter(fileName, true);
			PrintWriter appendFile = new PrintWriter(fwriter);

			for (int i = 1; i <= numberLines; i++)// Start of the loop for content in case user want to append
			{
				content = JOptionPane.showInputDialog("Enter a content: ");
				appendFile.println(content);
			}
			JOptionPane.showMessageDialog(null, "Program complete.", "Messege", JOptionPane.INFORMATION_MESSAGE);
			appendFile.close();
		}
	}
}
