

//5. Write a java program to print Factorial of a given number
import java.util.*;
class Factnum
{
	public static void main(String args[])
	{
		int i,a,fact=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number: ");
		a=input.nextInt();
		
		for(i=1;i<=a;i++)
		{
			fact=fact*i;	
		}
		System.out.println("The factorial of "+a+" is "+fact);
	}
}