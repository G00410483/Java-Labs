import java.util.Scanner;

public class Exercise11
{
	public static void main(String[] args)
	{
		calcAnnual ("Hamilton", "Margaret", 1250.00);
		calcAnnual ("Hooper", "Grace", 950.50);
		calcAnnual ("Knuth", "Donald", 912.21);
	}
	public static void calcAnnual(String surname, String name, double pay)
	{
		System.out.println("NAME: " + name + " " + surname);
		System.out.println("WAGE: " + (pay * 12));
		System.out.println("------------------------------\n");
	}
}