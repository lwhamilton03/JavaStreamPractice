package java8Practice;

import java.util.Arrays;
import java.util.List;

public class Alphabet {

	public String checkDigit(String word)
	{
		switch(word)
			{
				case "0": 
				{
					word = "zero"; 
					break;
				}
				
				case "1": 
				{
					word = "one";
					break;
				}
				
				case "2": 
				{
					word = "two";
					break;
				}
				
				case "3": 
				{
					word = "three"; 
					break;
				}
				case "4": 
				{
					word = "four"; 
					break;
				}
				case "5": 
				{
					word = "five"; 
					break;
				}
				case "6": 
				{
					word = "six"; 
					break;
				}
				case "7": 
				{
					word = "seven"; 
					break;
				}
				case "8": 
				{
					word = "eight"; 
					break;
				}
				case "9": 
				{
					word = "nine"; 
					break;
				}
				
			}
		return word;
	}
	
	public String checkFirstDig(String in, String sec)
	{
		String word = in; 
		switch(in)
		{
			
		case "1": 
		{
			switch(sec)
			{
				case "0": 
				{
					word = "ten"; 
					break;
				}
				
				case "1": 
				{
					word = "eleven";
					break;
				}
				
				case "2": 
				{
					word = "twelve";
					break;
				}
				
				case "3": 
				{
					word = "thirteen"; 
					break;
				}
				case "4": 
				{
					word = "fourteen"; 
					break;
				}
				case "5": 
				{
					word = "fifteen"; 
					break;
				}
				case "6": 
				{
					word = "sixteen"; 
					break;
				}
				case "7": 
				{
					word = "seventeen"; 
					break;
				}
				case "8": 
				{
					word = "eighteen"; 
					break;
				}
				case "9": 
				{
					word = "nineteen"; 
					break;
				}
				
			}
			//word = "one";
			break;
		}
		
		case "2": 
		{
			word = "twenty";
			if(sec == "0")
			{
				return "twenty"; 
			}
			break;
		}
		
		case "3": 
		{
			word = "thirty"; 
			break;
		}
		case "4": 
		{
			word = "fourty"; 
			break;
		}
		case "5": 
		{
			word = "fifty"; 
			break;
		}
		case "6": 
		{
			word = "sixty"; 
			break;
		}
		case "7": 
		{
			word = "seventy"; 
			break;
		}
		case "8": 
		{
			word = "eighty"; 
			break;
		}
		case "9": 
		{
			word = "ninety"; 
			break;
		}
		
	}
return word;
		
	}
	
	
	public void organise(Integer [] input)
	{
		List<Integer> inputStrings = Arrays.asList(input);
		
		inputStrings.stream().map((num) -> 
									{
										String word = String.valueOf(num);
										//System.out.println(word);
										if(word.length() == 1)
										{ 
											String endResult = checkDigit(word);
											return endResult;
											//System.out.println(checkDigit(word));
										}
										if(word.length() == 2)
										{
											String firstDig = String.valueOf(word.charAt(0)); 
											if(firstDig.equals("1"))
												{
												return checkFirstDig(firstDig, (String.valueOf(word.charAt(1))));
												}
											if(String.valueOf(word.charAt(1)).equals("0"))
											{
												return checkFirstDig(firstDig,(String.valueOf(word.charAt(1))));
											}
											else {
											String endResult = checkFirstDig(firstDig, (String.valueOf(word.charAt(1)))) + checkDigit(String.valueOf(word.charAt(1)));
											return endResult; }
										}
										return word; 
									}
								).map((num) ->
										{
											String firstLetter = String.valueOf(num.charAt(0));
											String body = num.substring(1);
											return firstLetter.toUpperCase() + body;//return firstLetter::toUpperCase;
										}
									).sorted().forEach(System.out::println);;
	}
}
