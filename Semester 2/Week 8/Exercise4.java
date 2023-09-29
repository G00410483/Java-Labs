public class Exercise4
{
	public static void main(String[] args)
	{
		Person a = new Person ("Grace", "Hopper");
		Person b = new Person ("Ivan", "Milan");
		Person c = new Person ("Jack", "Sparrow");
		Person d = new Person ("David", "Beckham");

		System.out.println("Number of instances: " + Person.count());
	}
}