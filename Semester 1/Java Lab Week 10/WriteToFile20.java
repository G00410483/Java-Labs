import java.io.*;
import javax.swing.JOptionPane;

public class WriteToFile20
{
	public static void main(String[] args) throws IOException
	{
		int num1 = 11;
		String number;

		while (num1 > 10)
		{
			number = JOptionPane.showInputDialog("Enter value between 1 and 10:");
			num1 = Integer.parseInt(number);
		}

		for (int i = 1; i <= num1; i++)
		{
			PrintWriter outputFile = new PrintWriter("C:/Users/dvlas/OneDrive - GMIT/Java Labs/Java Lab Week 10/Ex 20/Ex20_File" + i + ".txt");
			outputFile.println("This is file number " + i);
			outputFile.close();
		}


	}
}