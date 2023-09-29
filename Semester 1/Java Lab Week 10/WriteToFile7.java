import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("file7.txt");

		String input;
		int num1;

		input = JOptionPane.showInputDialog("How many lines of text in file?");
		num1 = Integer.parseInt(input);

		for (int i = 0; i <= num1; i++)
		{
			outputFile.println("Hello world");
		}

		outputFile.close();
	}
}