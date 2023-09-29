import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile10
{
	public static void main(String[] args) throws IOException
	{

		String name;
		String numberLines;
		int num1;
		String sum = "";
		String line;

		name = JOptionPane.showInputDialog("Enter file name:");

		numberLines = JOptionPane.showInputDialog("How many lines of text would you like to add:");
		num1 = Integer.parseInt(numberLines);

		for (int i = 1; i <= num1; i++)
		{
			line = JOptionPane.showInputDialog("Enter file content for line: " + i);
			sum = sum + "\n" + line;
		}

		PrintWriter outputFile = new PrintWriter(name);
		outputFile.println(sum);

		outputFile.close();
	}
}