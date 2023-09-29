import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise18
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		String fileName1 = "";
		String fileName2 = "";

		System.out.print("Enter first file to merge: ");
		fileName1 = keyboard.nextLine();
		System.out.print("Enter second file to merge: ");
		fileName2 = keyboard.nextLine();

		File myFile  = new File(fileName1);
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext())
		{
			String output1 = inputFile.nextLine();
		}
		inputFile.close();

		File myFile2  = new File(fileName2);
		Scanner inputFile2 = new Scanner(myFile2);

		while (inputFile2.hasNext())
		{
			String output2 = inputFile2.nextLine();
		}
		inputFile.close();

		System.out.println(output1 + output2);

	}
}