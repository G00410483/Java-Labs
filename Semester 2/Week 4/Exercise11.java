import java.util.Scanner;

public class Exercise11
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the Farenheit temparture: ");
		double temp = keyboard.nextDouble();

		Temperature temp1 = new Temperature();
		temp1.setFarenheit(temp);

		System.out.println("Celsius: " + temp1.getCelsius());
		System.out.println("Kelvin: " + temp1.getKelvin());

	}
}
