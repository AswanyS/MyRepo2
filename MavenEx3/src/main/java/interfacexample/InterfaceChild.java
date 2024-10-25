package interfacexample;

public class InterfaceChild implements InterfaceProgram {

	public static void main(String[] args)
	{
		
		InterfaceChild obj=new InterfaceChild();
		obj.display();
	}

	public void display() {
		System.out.println("Interface Program");
		
	}

}
