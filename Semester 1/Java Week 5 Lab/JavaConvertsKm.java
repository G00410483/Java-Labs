import java.util.Scanner;
public class JavaConvertsKm
{
	public static void main(String[] args)
	{
	double miles;
	double points;

	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter miles: ");
	miles = keyboard.nextDouble();
	System.out.print("Enter decimal points (0, 1, 2 or 3): ");
	points = keyboard.nextDouble();

	if (points == 0)
	{
		System.out.printf("%f miles is %.0f km\n", miles, miles*1.609);
	}
	else if (points == 1)
	{
		System.out.printf("%f miles is %.1f km\n", miles, miles*1.609);
	}
	else if (points == 2)
	{
		System.out.printf("%f miles is %.2f km\n", miles, miles*1.609);
	}
	else if (points == 3)
	{
		System.out.printf("%f miles is %.3f km\n", miles, miles*1.609);
	}
	else if (points > 3)
	{
			System.out.printf("%f miles is %f km\n", miles, miles*1.609);
	}


	}
}