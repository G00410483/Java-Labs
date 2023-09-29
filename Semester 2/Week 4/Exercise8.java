public class Exercise8
{
	public static void main (String[] args)
	{
		RetailItem item1 = new RetailItem();
		item1.setRetailItem("Jacket", 12, 59.95);

		RetailItem item2 = new RetailItem();
		item2.setRetailItem("Jeans", 40, 34.95);

		RetailItem item3 = new RetailItem();
		item3.setRetailItem("Shirt", 20, 24.95);

		System.out.println("Item 1");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Units on hand: " + item1.getunitsOnHand());
		System.out.println("Price: " + item1.getPrice());
		System.out.println("");

		System.out.println("Item 2");
		System.out.println("Description: " + item2.getDescription());
		System.out.println("Units on hand: " + item2.getunitsOnHand());
		System.out.println("Price: " + item2.getPrice());
		System.out.println("");

		System.out.println("Item 3");
		System.out.println("Description: " + item3.getDescription());
		System.out.println("Units on hand: " + item3.getunitsOnHand());
		System.out.println("Price: " + item3.getPrice());
		System.out.println("");


	}
}
