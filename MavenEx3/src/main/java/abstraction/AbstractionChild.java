package abstraction;

public class AbstractionChild extends AbstractionEx1{

	public static void main(String[] args) {
		AbstractionChild z=new AbstractionChild();
		z.add();
		z.display();
		z.display2();

	}
	public void display2()
	{
		System.out.println("Child Abstraction");
	}

	@Override
	public void add() {
		int c=2+3;
		System.out.println("the sum is " +c);
		
	}

}
