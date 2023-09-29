public class Exercise6
{
	public static void main (String[] args)
	{
		Car s1 = new Car();
		Car s2 = new Car("Toyote", "Corolla", 1.4, 2019, "Red");
		Car s3 = new Car("Skoda", "Octavia", 1.9, 2019, "Gold");
		Car s4 = new Car("Toyota", "Avensis", "Green");
		Car s5 = new Car("Nissan", "Quashqai", 1.6, 2012, "Black");


		System.out.println(s1.getMake());
		System.out.println(s1.getModel());
		System.out.println(s1.getColour());
		System.out.println(s1.getSize());
		System.out.println(s1.getYear());
		System.out.println("\n\n");

		System.out.println(s2.getMake());
		System.out.println(s2.getModel());
		System.out.println(s2.getColour());
		System.out.println(s2.getSize());
		System.out.println(s2.getYear());
		System.out.println("\n\n");

		System.out.println(s3.getMake());
		System.out.println(s3.getModel());
		System.out.println(s3.getColour());
		System.out.println(s3.getSize());
		System.out.println(s3.getYear());
		System.out.println("\n\n");

		System.out.println(s4.getMake());
		System.out.println(s4.getModel());
		System.out.println(s4.getColour());
		System.out.println(s4.getSize());
		System.out.println(s4.getYear());
		System.out.println("\n\n");

		System.out.println(s5.getMake());
		System.out.println(s5.getModel());
		System.out.println(s5.getColour());
		System.out.println(s5.getSize());
		System.out.println(s5.getYear());
		System.out.println("\n\n");


	}
}