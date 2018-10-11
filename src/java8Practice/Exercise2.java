package java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise2 {

	public void exercise2(String [] input)
	{
	List<String> inputStrings = Arrays.asList(input);
	
	inputStrings.stream()
			.filter(word -> word.charAt(0) != 'D')
				.map((word) -> 
					{if(word.charAt(0) == 'A')
						{
							int a = Integer.parseInt(word.substring(1));
							return a * 2;
						}
					
					if(word.charAt(0) == 'B')
					{
						int b = Integer.parseInt(word.substring(1));
						return b + 100;
					}
					
					if(word.charAt(0) == 'C')
					{
						int c = Integer.parseInt(word.substring(1));
						return c - 100;
					}
					
					return null;
					}
					
					)
				.filter(word -> {
				
						if(word % 5 == 0)
							{
								return false;
							}
						return true;
				}
				).reduce((current, max) -> {
					
					if(current >= max)
					{
						max = current; 
					}
					return max;
				}).ifPresent(System.out::print);
					
		
				
	
	
	//myStream.map((word) -> 1 + word);
	//myStream.forEach(System.out::print);
	//myStream.reduce((current, stringA) -> );
	}

}
