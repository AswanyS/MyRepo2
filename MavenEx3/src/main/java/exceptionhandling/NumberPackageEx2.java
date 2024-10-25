package exceptionhandling;

public class NumberPackageEx2 
{
	    private static final String num = "123.33";   
	      
	    public static void main(String[] args)
	    {  
	        try {  
	                 int a = Integer.parseInt(num);  
	        }catch(NumberFormatException ex){  
	            System.out.println("Invalid string in argumment");  
	            //request for well-formatted string  
	        }  
	            }  
	}  