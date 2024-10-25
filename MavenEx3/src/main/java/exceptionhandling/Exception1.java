package exceptionhandling;

public class Exception1 {

	public static void main(String[] args) {
		int a=1;
		int b=0;
		System.out.println("Hello");
		int c=a/b; //exception can't divide by 0
		System.out.println(c);
	}

}
