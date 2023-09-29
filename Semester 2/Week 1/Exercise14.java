import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise14
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("rectangle.txt");
		Scanner inputFile = new Scanner(myFile);

		float length1, width1, area1;
		float radius2, area2, circumference2;

		length1 = inputFile.nextFloat();
		width1 = inputFile.nextFloat();
		System.out.println("Length = " + length1 + ", width = " + width1 + ", area = " + (length1*width1));

		radius2 = inputFile.nextFloat();
		System.out.println("Radius = " + radius2 + ", area = " + (radius2*radius2*3.14159) + ", circumference = " + (radius2*3.14159*2));

		inputFile.close();

	}
}