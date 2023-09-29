import java.util.Scanner;

public class Exercise8
{
	public static void main (String[] args)
	{
		Customer c1 = new Customer("Ada Lovelace");
		Customer c2 = new Customer("Margaret Hamilton", "123 Mainstreet, Dublin", 555465);
		Customer c3 = new Customer("James Gosling", 456789);
		Customer c4 = new Customer("Scott Free", "Shopstreet, Galway");

		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name: " + c1.getName());
		System.out.println("Adress: " + c1.getAdress());
		System.out.println("Phone number: " + c1.getNumber());
		System.out.println("\n");

		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name: " + c2.getName());
		System.out.println("Adress: " + c2.getAdress());
		System.out.println("Phone number: " + c2.getNumber());
		System.out.println("\n");

		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name: " + c3.getName());
		System.out.println("Adress: " + c3.getAdress());
		System.out.println("Phone number: " + c3.getNumber());
		System.out.println("\n");

		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name: " + c4.getName());
		System.out.println("Adress: " + c4.getAdress());
		System.out.println("Phone number: " + c4.getNumber());
		System.out.println("\n");

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter name for customer: ");
		String name = keyboard.nextLine();

		System.out.print("Enter adress for customer: ");
		String adress = keyboard.nextLine();

		System.out.println("Enter number of customer: ");
		long number = keyboard.nextLong();

		Customer c5 = new Customer(name, adress, number);

		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name: " + c5.getName());
		System.out.println("Adress: " + c5.getAdress());
		System.out.println("Phone number: " + c5.getNumber());
		System.out.println("\n");


	}
}
