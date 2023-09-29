public class Exercise2
{
	public static void main (String[] args)
	{
		Toy toy1 = new Toy();
		toy1.setToy("Spinner", 10.99);

		Toy toy2 = new Toy();
		toy2.setToy("Baby Yoda", 19.99);

		Toy toy3 = new Toy();
		toy3.setToy("Batmobile", 34.49);

		System.out.println(toy1.getName() + " " + toy1.getPrice());
		System.out.println(toy2.getName() + " " + toy2.getPrice());
		System.out.println(toy3.getName() + " " + toy3.getPrice());

	}
}
