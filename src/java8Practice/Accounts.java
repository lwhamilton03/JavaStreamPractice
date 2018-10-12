package java8Practice;

public class Accounts {

	public int division(int a, int b) throws MyExceptions
	{
		if(b>123)
		{
			MyExceptions except = new MyExceptions();
			throw except; 
		}
		
		int c = a/b; 
		return c; 
	}
}
