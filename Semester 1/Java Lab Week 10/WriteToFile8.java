import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile8
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("File8.txt");

		String input;
		int num1;
		String output;

		input = JOptionPane.showInputDialog("How many lines of text in file?");
		num1 = Integer.parseInt(input);

		output = JOptionPane.showInputDialog("What will be the output?");

		for (int i = 0; i <= num1; i++)
		{
			outputFile.println(output);
		}

		outputFile.close();
	}
}