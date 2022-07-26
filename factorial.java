
//1. Write a Java program that calculates factorial of a number (inputted via keyboard) recursively.
import java.util.*;
class factorial
{
	static int factorial(int n)
	{
		if (n==0)
			return 1;	
		else
			return(n*factorial(n-1));
	}
	public static void main(String[] args)
	{
		System.out.print("Enter any number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		fact=factorial(num);
		System.out.println("Factorial of  " +num+ " is "+fact);
	}

}
