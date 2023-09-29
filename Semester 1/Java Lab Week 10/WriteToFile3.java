import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile3
{
	public static void main(String[] args) throws IOException
	{
		String name = "";

		name = JOptionPane.showInputDialog("Enter file name: ");

		PrintWriter outputFile = new PrintWriter(name);

		outputFile.print("This is java.");

		outputFile.close();
	}
}