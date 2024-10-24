package aggregation;

public class AggregationEx1 
{
	int roll;
	String city;
	AggregationEx ref;//aggregation (refer)
	public static void main(String[] args)
	{
		AggregationEx obj=new AggregationEx("Aswany", 2);
		AggregationEx1 obj1=new AggregationEx1(22 ,"TVM",obj);
		obj1.display();
	}
public AggregationEx1(int roll,String city,AggregationEx ref)
{
	this.roll=roll;
	this.city=city;
	this.ref=ref;
}
public void display()
{
	System.out.println(ref.name + ref.age);
	System.out.println(roll + city);
}
}
