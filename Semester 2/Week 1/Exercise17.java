import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise17
{
	public static void main(String[] args) throws IOException
	{
		String fileName;

		fileName = JOptionPane.showInputDialog("Enter your name: ");

		File myFile  = new File(fileName);
		Scanner inputFile = new Scanner(myFile);

		while (inputFile.hasNext())
		{
			String output = inputFile.nextLine();
			System.out.println(output);
		}

		inputFile.close();

		FileWriter fwriter = new FileWriter(fileName + "-COPY", true);
		PrintWriter outputFile = new PrintWriter(fwriter);

	}
}