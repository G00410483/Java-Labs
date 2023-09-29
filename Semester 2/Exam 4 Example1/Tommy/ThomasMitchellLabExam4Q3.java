//ThomasMitchell G00400162 05/04/2022
import java.util.*;
import java.io.*;
public class ThomasMitchellLabExam4Q3
{
	public static void main(String[] args) throws IOException
	{
		int num1,i = 0,fileSize = 365,numBiggest = 0,numSmallest = 0,day1 = 0,day2 = 0;
		int sumAdd = 0,sumAddQ1 = 0,sumAddQ2 = 0,sumAddQ3 = 0,sumAddQ4 = 0;
		int ave = 0,aveQ1 = 0,aveQ2 = 0,aveQ3 = 0,aveQ4 = 0;

		File file = new File("temp.txt");
		Scanner printwriter = new Scanner(file);

		int[] tempArray = new int[fileSize];

		do
		{
			tempArray[i] = printwriter.nextInt();

			i++;

		}while(printwriter.hasNext());


		for(int k = 0; k <= 91; k++ )
		{
			sumAddQ1 += tempArray[k];

			aveQ1 = sumAddQ1/91;
		}

		for(int k = 92; k <= 182; k++ )
		{
			sumAddQ2 += tempArray[k];

			aveQ2 = sumAddQ2/91;
		}

		for(int k = 183; k <= 273; k++ )
		{
			sumAddQ3 += tempArray[k];

			aveQ3 = sumAddQ3/91;
		}

		for(int k = 274; k < 365; k++ )
		{
			sumAddQ4 += tempArray[k];

			aveQ4 = sumAddQ4/92;
		}

		for(int k = 0; k < fileSize; k++ )
		{
			if(numBiggest < tempArray[k])
			{
				numBiggest = tempArray[k];
				day1 = k+1;
			}

			if(numSmallest > tempArray[k])
			{
				numSmallest = tempArray[k];
				day2 = k+1;
			}

			sumAdd += tempArray[k];

			ave = sumAdd/fileSize;
		}

		System.out.println("Average daily temperature was: "+ave+" celsius");
		System.out.println("Average  temperature for Q1 was: "+aveQ1+" celsius");
		System.out.println("Average  temperature for Q2 was: "+aveQ2+" celsius");
		System.out.println("Average  temperature for Q3 was: "+aveQ3+" celsius");
		System.out.println("Average  temperature for Q4 was: "+aveQ4+" celsius");
		System.out.println(day1+" "+numBiggest);
		System.out.println(day2+" "+numSmallest);
	}

	/*public static int getFileSize(Scanner inputFile)
	{
		System.out.println("stopped");
		int i = 0;

		do
		{
			i++;
			System.out.println(i);
		}while(inputFile.hasNext());

		inputFile.close();

		return i;
	}*/
}