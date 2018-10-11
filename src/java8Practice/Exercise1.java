package java8Practice;

import java.util.ArrayList;

/*
 * Given a String[] with strings in a random format; 
 * remove all string longer than 2 in length
 * remove all string that would not parse as numbers
 * multiply all remaining by 10
 * Add them all together
 * print out the sum
 */
public class Exercise1 {

	public void exercise(String[] strArray)
	{
		ArrayList<String> stringArray = new ArrayList<String>();
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		int g = 0;
		
		for(String b:strArray)
		{
			if(b.length() <= 2)
			{
				System.out.println("less than 2");
				System.out.println(b);
				stringArray.add(b);
			}
		}
		
		try {
		for(String c:stringArray)
		{
			{
				System.out.println("integer");
				int d = Integer.parseInt(c);
				int f = d * 10;
				System.out.println(d);
				integerList.add(f);
			}
		}}
		catch(NumberFormatException e) {}
		
		for(int e:integerList)
		{
			g += e;
		}
		System.out.println("Total: " + g);
	}
}
