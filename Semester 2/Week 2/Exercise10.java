import java.util.Scanner;

public class Exercise10
{
	public static void main(String[] args)
	{
		age ("Donald", 1946);
		age ("Hillary", 1947);
		age ("Bill Gates", 1955);
	}
	public static void age(String name, int year)
	{
		System.out.println("Hello " + name + ", you are " + (2022 - year) + " year of age.");
	}
}