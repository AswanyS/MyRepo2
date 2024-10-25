package exceptionhandling;

public class ThrowEx 
{

	public static void main(String[] args)
	{
		//int age=16;
		int age =20;
		if(age>=18)
		{
System.out.println("Eligible for voting");
		}
else
{
	throw new ArithmeticException("Age under 18");
		}

	}
}
