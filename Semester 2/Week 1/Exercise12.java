import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise12
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		String fileName;
		fileName = JOptionPane.showInputDialog("Enter the name of the file: ");

		System.out.println("\n");

		File myFile  = new File(fileName);
		Scanner inputFile = new Scanner(myFile);

		int wordCount = 0;

		while (inputFile.hasNext())
		{
			inputFile.next();
			wordCount++;
		}
		JOptionPane.showMessageDialog(null, "This file has " + wordCount + " words");

		inputFile.close();

	}
}