import java.util.Scanner;

public class Exercise9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		double temp = keyboard.nextDouble();

		Temperature t1 = new Temperature(temp);

		if (t1.isWaterFreezing())
		{
			System.out.println("Water is freezing");
		}
		else if (t1.isWaterBoiling())
		{
			System.out.println("Water is boiling");
		}

		if (t1.isEthylFreezing())
		{
			System.out.println("Ethyl is freezing");
		}
		else if (t1.isEthylBoiling())
		{
			System.out.println("Ethyl is boiling");
		}

		if (t1.isOxygenFreezing())
		{
			System.out.println("Oxygen is freezing");
		}
		else if (t1.isOxygenBoiling())
		{
			System.out.println("Oxygen is boiling");
		}




	}
}
