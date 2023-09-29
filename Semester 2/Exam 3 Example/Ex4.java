import java.util.Scanner;
import java.io.*;

public class Ex4
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter customer first name: ");
		String name = keyboard.nextLine();

		System.out.print("Enter customer second name: ");
		String surname = keyboard.nextLine();

		System.out.print("Enter customer age: ");
		int age = keyboard.nextInt();


		Customer c1 = new Customer("Jane");
		Customer c2 = new Customer("Charlie", "Smith");
		Customer c3 = new Customer();
		Customer c4 = new Customer(name, surname, age);

		System.out.println(c1.getName());
		System.out.println(c1.getSurname());
		System.out.println(c1.getAge());
		System.out.println("");

		System.out.println(c2.getName());
		System.out.println(c2.getSurname());
		System.out.println(c2.getAge());
		System.out.println("");

		System.out.println(c3.getName());
		System.out.println(c3.getSurname());
		System.out.println(c3.getAge());
		System.out.println("");

		System.out.println(c4.getName());
		System.out.println(c4.getSurname());
		System.out.println(c4.getAge());
		System.out.println("");

	}

}

