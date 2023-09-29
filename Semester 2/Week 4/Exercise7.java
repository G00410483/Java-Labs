public class Exercise7
{
	public static void main (String[] args)
	{
		Employee employee1 = new Employee();
		employee1.setEmployee("Susan Mayers", 101010, "Accounting", "Vice President");
		Employee employee2 = new Employee();
		employee2.setEmployee("Mark Jones", 202020, "IT", "Programmer");
		Employee employee3 = new Employee();
		employee3.setEmployee("Joe Rogers", 303030, "Manufacturing", "Engineer");

		System.out.println("Employee 1");
		System.out.println("Name: " + employee1.getName());
		System.out.println("ID Number: " + employee1.getidNumber());
		System.out.println("Department: " + employee1.getDepartment());
		System.out.println("Position: " + employee1.getPosition());
		System.out.println("");

		System.out.println("Employee 2");
		System.out.println("Name: " + employee2.getName());
		System.out.println("ID Number: " + employee2.getidNumber());
		System.out.println("Department: " + employee2.getDepartment());
		System.out.println("Position: " + employee2.getPosition());
		System.out.println("");

		System.out.println("Employee 3");
		System.out.println("Name: " + employee3.getName());
		System.out.println("ID Number: " + employee3.getidNumber());
		System.out.println("Department: " + employee3.getDepartment());
		System.out.println("Position: " + employee3.getPosition());
		System.out.println("");


	}
}
