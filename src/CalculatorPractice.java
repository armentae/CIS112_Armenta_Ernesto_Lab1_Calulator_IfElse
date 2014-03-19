import java.util.Scanner;

public class CalculatorPractice
{

	    public static void main(String[] args) 
	    {
	    	
	    	Scanner input = new Scanner(System.in);
	
	        int x;
	        int y;
	        
	        System.out.println("Please enter your first number");
	        x = input.nextInt();
	        System.out.println("Please enter your second number");
	        y = input.nextInt();
	        int sum, div, sub, mul;
	       

	        System.out.println("Please enter add, subtract, divide, multiply");
	        String function = input.next();
	        if (function.equals("add"))
	        {
	        	 sum = x+y;
	            System.out.printf("your answer is %d", sum );
	        }
	        else  if  (function.equals("subtract") )
	        {
	        	sub = x-y; 
	            System.out.printf("your answer is %d", sub);
	        }

	        else if (function.equals("divide") )
	        {
	        	div = x/y;
	            System.out.printf("your answer is %d", div);
	        }
	        else if (function.equals("multiply") )
	        {
	        	mul = x*y;
	            System.out.printf("your answer is %d", mul);
	         }
	    }
	}