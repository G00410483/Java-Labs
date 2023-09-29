import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile4
{
	public static void main(String[] args) throws IOException
	{
		String name = "";
		String content = "";

		name = JOptionPane.showInputDialog("Enter file name: ");
		content = JOptionPane.showInputDialog("Enter file content: ");

		PrintWriter outputFile = new PrintWriter(name);

		outputFile.print(content);

		outputFile.close();
	}
}