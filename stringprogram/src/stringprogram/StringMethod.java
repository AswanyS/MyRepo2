package stringprogram;

public class StringMethod
{
	public static void main(String[] args)
	{
		String a="Hello";
		String c="World";
		String d="I am Aswany";
        char b=a.charAt(1);
        System.out.println(b);
        System.out.println(a.length());
        System.out.println(a.concat(c));
        System.out.println(d.contains("Name"));
        System.out.println(a.compareTo(c));
	}

}
