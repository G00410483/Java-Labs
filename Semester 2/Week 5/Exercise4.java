public class Exercise4
{
	public static void main (String[] args)
	{
		Bike b1 = new Bike(599.95, "Red");
		Bike b2 = new Bike(499.99, "Green");
		Bike b3 = new Bike(399.95, "Blue");
		System.out.println("Trek bike costs " + b1.getPrice() + " and the colour is :" + b1.getColour());
		System.out.println("Trek bike costs " + b2.getPrice() + " and the colour is :" + b2.getColour());
		System.out.println("Trek bike costs " + b3.getPrice() + " and the colour is :" + b3.getColour());

	}
}