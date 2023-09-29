import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile7
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("file7.txt");

		String input;

		input = JOptionPane.showInputDialog("How many lines of text in file?");

		for (int i = 0; i <= 10; i++)
		{
			outputFile.println("Hello world");
		}

		outputFile.close();
	}
}