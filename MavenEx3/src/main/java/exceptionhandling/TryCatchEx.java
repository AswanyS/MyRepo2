package exceptionhandling;

public class TryCatchEx
{

		public static void main(String[] args) {
			int a=10;
			int b=0;
			try
			{
			int c=a/b; //exception can't divide by 0
			}
			catch(ArithmeticException d)
			{
				b=5;
				int e=a/b;
				System.out.println(e);
				System.out.println(d);
		}
			/*finally
			{
				System.out.println("End of the program");
			}*/
			}

	}