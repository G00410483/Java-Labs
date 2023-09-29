public class Exercise4
{
	public static void main (String[] args)
	{
		Product product1 = new Product();
		product1.setProduct("Twix Bar", 0.40);

		Product product2 = new Product();
		product2.setProduct("Das Washing Powder", 6.05);

		Product product3 = new Product();
		product3.setProduct("Colgate Toothpaste", 1.25);

		Product product4 = new Product();
		product4.setProduct("Granny Smiths", 1.10);

		System.out.println("Product details:");
		System.out.println("Product 1 Name: " + product1.getName());
		System.out.println("Product 1 Price: " + product1.getPrice());
		System.out.println("Product 1 Retail Price: " + product1.getrP());
		System.out.println("");

		System.out.println("Product details:");
		System.out.println("Product 2 Name: " + product2.getName());
		System.out.println("Product 2 Price: " + product2.getPrice());
		System.out.println("Product 2 Retail Price: " + product2.getrP());
		System.out.println("");

		System.out.println("Product details:");
		System.out.println("Product 3 Name: " + product3.getName());
		System.out.println("Product 3 Price: " + product3.getPrice());
		System.out.println("Product 3 Retail Price: " + product3.getrP());
		System.out.println("");

		System.out.println("Product details:");
		System.out.println("Product 4 Name: " + product4.getName());
		System.out.println("Product 4 Price: " + product4.getPrice());
		System.out.println("Product 4 Retail Price: " + product4.getrP());
		System.out.println("");
	}
}
