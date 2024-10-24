package inheritance;

public class SingleChild extends SingleParent {

	public static void main(String[] args) 
	{
		SingleChild obj=new SingleChild();;
		obj.display1();
		obj.display2();
	}
	public void display2()
	{
		System.out.println("Single Inheritance Child class");

	}

}
