import java.util.Scanner;

public class Exercise13
{
	public static void main (String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int number1;

		System.out.println("Pool data");
		System.out.print("\tLength: ");
		double length = keyboard.nextDouble();

		System.out.print("\tWidth: ");
		double width = keyboard.nextDouble();

		System.out.print("\tDepth: ");
		double depth = keyboard.nextDouble();

		SwimmingPool s1 = new SwimmingPool(length, width, depth);
		System.out.println("\tTotal capacity: " + s1.getCapacity());
	}
}
