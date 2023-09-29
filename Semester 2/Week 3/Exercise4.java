import java.util.Scanner;

public class Exercise4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int speed, hours;

		System.out.print("Enter the vehicle's speed: ");
		speed = keyboard.nextInt();

		System.out.print("Enter number of hours the vehicle was in motion: ");
		hours = keyboard.nextInt();

		distance(speed, hours);
	}
	public static void distance(int speed, int hours)
	{
		System.out.println("-------------------------------------");
		for (int i = 1; i <= hours; i++)
		{
			System.out.println(i + "\t\t" + (speed*i));
		}
	}
}