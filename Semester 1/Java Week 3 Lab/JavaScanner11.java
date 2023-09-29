import java.util.Scanner;

public class JavaScanner11
{
	public static void main(String[] args)
	{
		System.out.println("Population density calculator");
		System.out.println("---------------------------------------");

		Scanner keyboard = new Scanner(System.in);
		String name;
		int population;
		int area;

		System.out.print("Enter country name: ");
		name = keyboard.nextLine();
		System.out.print("Enter country population: ");
		population = keyboard.nextInt();
		System.out.print("Enter country area in square KM: ");
		area = keyboard.nextInt();

		System.out.println(name + " has " + (population / area) + " people per sqaure kilometer");




	}
}

