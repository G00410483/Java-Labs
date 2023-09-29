import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercise6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double length1 = 1;
		double width = 1;

		double length = getLength(length1);
		width = getWidth(width);
		double area = getArea(length, width);
		displayData(length, width, area);

	}
	public static double getLength(double lengthInput)
	{
		String lengthString;

		lengthString = JOptionPane.showInputDialog("Enter the recitangle's length:");
		lengthInput = Integer.parseInt(lengthString);
		return lengthInput;
	}
	public static double getWidth(double widthInput)
	{
		String widthString;

		widthString = JOptionPane.showInputDialog("Enter the recitangle's length:");
		widthInput = Integer.parseInt(widthString);
		return widthInput;
	}
	public static double getArea(double length, double width)
	{
		double totalArea = length * width;
		return totalArea;
	}
	public static void displayData(double length, double width, double area)
	{
		JOptionPane.showMessageDialog(null, "Length: " + length + "\n" + "Width: " + width + "\n" + "Area: " + area);

	}

}