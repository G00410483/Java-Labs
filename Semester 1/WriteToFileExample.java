//Import Java Input-output
import java.io.*;

public class WriteToFileExample
{
	public static void main(String[] args) throws IOException //Add throws
	{
		//Create instance of PrintWriter - this will create a file called file1.txt
		PrintWriter outputFile = new PrintWriter("File1.txt");

		//Output to file using println
		outputFile.println("This is a line of text!");
		outputFile.println("This is a second line of text!");

		//Close file
		outputFile.close();
	}