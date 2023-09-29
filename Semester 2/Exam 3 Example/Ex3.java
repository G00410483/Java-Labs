import java.util.Scanner;
import java.io.*;

public class Ex3
{
	public static void main (String[] args)
	{
		Model m1 = new Model();
		m1.setModel("Dell optiplex");
		m1.setRAM(4);
		m1.setDiskSize(1.0);

		System.out.println("Name: " + m1.getModel());
		System.out.println("RAM:" + m1.getRAM());
		System.out.println("Disk size: " + m1.getDiskSize());
		System.out.println("Rating: " + m1.getRating());
	}

}

