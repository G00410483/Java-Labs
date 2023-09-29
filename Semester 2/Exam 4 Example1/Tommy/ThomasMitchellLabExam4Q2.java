//ThomasMitchell G00400162 05/04/2022
import java.util.*;
public class ThomasMitchellLabExam4Q2
{
	public static void main(String[] args)
	{
		int row = 2, col = 5,x = 0;

		int[][] myCounter = new int[row][col];

		for(int i = 0; i < row; i++)
		{
			for(int k = 0; k < col;k++)
			{
				myCounter[i][k] = 2000+k+x;
			}
			x = 5;
		}

		System.out.println("------------------------------------");

		for(int i = 0; i < row; i++)
		{
			for(int k = 0; k < col;k++)
			{
				System.out.print(myCounter[i][k]+"    ");
			}

			System.out.println();
		}

		System.out.println("------------------------------------");

	}
}