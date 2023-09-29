import java.util.Scanner;

public class Exercise7
{
	public static void main (String[] args)
	{
		Sandwich s1 = new Sandwich("tuna", "wheat", 4.99);
		Sandwich s2 = new Sandwich("cheese", "sliced white", 3.50);
		Sandwich s3 = new Sandwich("cheese");
		Sandwich s4 = new Sandwich(3.99);
		Sandwich s5 = new Sandwich();

		System.out.println("You have ordered a " + s1.getIngredient() + " on " + s1.getBread() + " and the price is " + s1.getPrice());
		System.out.println("You have ordered a " + s2.getIngredient() + " on " + s2.getBread() + " and the price is " + s2.getPrice());
		System.out.println("You have ordered a " + s3.getIngredient() + " on " + s3.getBread() + " and the price is " + s3.getPrice());
		System.out.println("You have ordered a " + s4.getIngredient() + " on " + s4.getBread() + " and the price is " + s4.getPrice());
		System.out.println("You have ordered a " + s5.getIngredient() + " on " + s5.getBread() + " and the price is " + s5.getPrice());
	}
}
