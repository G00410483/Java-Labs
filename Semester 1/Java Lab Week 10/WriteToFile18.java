import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class WriteToFile18
{
	public static void main(String[] args) throws IOException
	{
		String firstName = "";
		String surname = "";
		String occupation = "";
		String year;
		String month;
		String descriptionName = "";
		String descriptionBirth = "";
		String descriptionOccupation = "";
		int choice1 = 0;
		int yearBirth;

		while (choice1 == 0)
		{
			firstName = JOptionPane.showInputDialog ("Enter first name:");
			surname = JOptionPane.showInputDialog ("Enter first surname:");
			occupation = JOptionPane.showInputDialog ("Enter occupation:");

			year = JOptionPane.showInputDialog ("Enter year of birth:");
			yearBirth = Integer.parseInt(year);
			month = JOptionPane.showInputDialog ("Enter month of birth:");

			choice1 = JOptionPane.showConfirmDialog(null, "Add another employee", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);

			descriptionName = "=============PERSONNEL FILE=============\nNAME:" + firstName + " " + surname + "\n==============================";
			descriptionBirth = "DATE OF BIRTH:" + month + ", " + yearBirth + "." + " \nAGE: " + (2021-yearBirth) + "\n==============================";
			descriptionOccupation = "OCCUPATION:" + occupation + "\n==============================";

			PrintWriter outputFile = new PrintWriter("C:\\Users\\dvlas\\OneDrive - GMIT\\Java Labs\\Java Lab Week 10\\PERSONNEL FILES\\" + surname + "- " + firstName + ".txt");
			outputFile.println(descriptionName);
			outputFile.println(descriptionBirth);
			outputFile.println(descriptionOccupation);
			outputFile.close();
		}

	}
}