import java.util.Scanner;

public class Exercise11
{
	public static void main (String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Check if name is on the list: ");
		String nameUser = s1.nextLine();
		boolean found = false;

		String[] names = {"Emily", "Madison", "Emma", "Olivia", "Hannah", "Abigail", "Isabella", "Samantha", "Elizabeth", "Ashley", "Alexis", "Sarah", "Sophia", "Alyssa", "Grace", "Ava", "Taylor", "Brianna", "Lauren", "Chloe", "Natalie", "Kayla", "Jessica", "Anna", "Victoria", "Mia", "Hailey", "Sydney", "Jasmine", "Julia", "Morgan", "Destiny", "Rachel", "Ella", "Kaitlyn", "Megan", "Katherine", "Savannah", "Jennifer", "Alexandra", "Allison", "Haley", "Maria", "Kaylee", "Lily", "Makayla", "Brooke", "Mackenzie", "Nicole", "Addison", "Stephanie", "Lillian", "Andrea", "Zoe", "Faith", "Kimberly", "Madeline", "Alexa", "Katelyn", "Gabriella", "Gabrielle", "Trinity", "Amanda", "Kylie", "Mary", "Paige", "Riley", "Jenna", "Leah", "Sara", "Rebecca", "Michelle", "Sofia", "Vanessa", "Jordan", "Angelina", "Caroline", "Avery", "Audrey", "Evelyn", "Maya", "Claire", "Autumn", "Jocelyn", "Ariana", "Nevaeh", "Arianna", "Jada", "Bailey", "Brooklyn", "Aaliyah", "Amber", "Isabel", "Danielle", "Mariah", "Melanie", "Sierra", "Erin", "Molly", "Amelia", "Isabelle", "Madelyn", "Melissa", "Jacqueline", "Marissa", "Shelby", "Angela", "Leslie", "Katie", "Jade", "Catherine", "Diana", "Aubrey", "Mya", "Amy", "Briana", "Sophie", "Gabriela", "Breanna", "Gianna", "Kennedy", "Gracie", "Peyton", "Adriana", "Christina", "Courtney", "Daniela", "Kathryn", "Lydia", "Valeria", "Layla", "Alexandria", "Natalia", "Angel", "Laura", "Charlotte", "Margaret", "Cheyenne", "Mikayla", "Miranda", "Naomi", "Kelsey", "Payton", "Ana", "Alicia", "Jillian", "Daisy", "Mckenzie", "Ashlyn", "Caitlin", "Sabrina", "Summer", "Ruby", "Rylee", "Valerie", "Skylar", "Lindsey", "Kelly", "Genesis", "Zoey", "Eva", "Sadie", "Alexia", "Cassidy", "Kylee", "Kendall", "Jordyn", "Kate", "Jayla", "Karen", "Tiffany", "Cassandra", "Juliana", "Reagan", "Caitlyn", "Giselle", "Serenity", "Alondra", "Lucy", "Kiara", "Bianca", "Crystal", "Erica", "Angelica", "Hope", "Chelsea", "Alana", "Liliana", "Brittany", "Camila", "Makenzie", "Veronica", "Lilly", "Abby", "Jazmin", "Adrianna", "Karina", "Delaney", "Ellie", "Jasmin"};

		for (int i = 0; i < names.length; i++)
		{
			if (names[i].equals(nameUser))
			{
				String output = nameUser + " is number " + (i + 1) + " on the list";
				System.out.println(output);
				found = true;
				break;
			}
		}
		if (!found)
		{
			System.out.println(nameUser + " is not on the list.");
		}
	}
}