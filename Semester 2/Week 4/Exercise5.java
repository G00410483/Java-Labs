public class Exercise5
{
	public static void main (String[] args)
	{
		PersonalInfo person1 = new PersonalInfo();
		person1.setPerson("Joe Mahoney", 27, "724 22nd Street", "(555)555-1234");

		PersonalInfo person2 = new PersonalInfo();
		person2.setPerson("Geri Rose", 24, "149 East Bay Street", "(555)555-5678");

		PersonalInfo person3 = new PersonalInfo();
		person3.setPerson("John Carbonni", 28, "724 22nd Street", "(555)555-0123");

		System.out.println("My information:");
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());
		System.out.println("Adress: " + person1.getAdress());
		System.out.println("Phone: " + person1.getName());
		System.out.println("");

		System.out.println("Friend 1 information:");
		System.out.println("Name: " + person2.getName());
		System.out.println("Age: " + person2.getAge());
		System.out.println("Adress: " + person2.getAdress());
		System.out.println("Phone: " + person2.getName());
		System.out.println("");

		System.out.println("Friend 1 information:");
		System.out.println("Name: " + person3.getName());
		System.out.println("Age: " + person3.getAge());
		System.out.println("Adress: " + person3.getAdress());
		System.out.println("Phone: " + person3.getName());
		System.out.println("");

	}
}
