package a123;

public class sample7
{
	public static void main(String[] args) 
	{
		try
		{
			validate(11);
		}
		catch(InvalidAgeException t)
		{
			System.out.println(t.getMessage());
		}
		
	}
	
	public static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not fit for voting");
		}
		else
		{
			System.out.println("valid for voting");
		}
		
	}

}
