import java.util.Scanner;

public class Exercise13
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter radius of circle: ");
		double radius = keyboard.nextDouble();

		Circle object = new Circle();
		object.setRadius(radius, 3.14);

		System.out.println("The circle's area is: " + object.getArea());
		System.out.println("The circle's diameter is: " + object.getDiameter());
		System.out.println("The circle's circumference is: " + object.getCircumference());
	}
}
