
//3. Write java program to print Biggest of 3 Numbers using Logical Operators\
import java.util.*;
class BiggestOfThree
{
	public static void main(String args[])
	{
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=sc.nextInt();
		System.out.println("Enter the second number:");
		b=sc.nextInt();
		System.out.println("Enter the third number:");
		c=sc.nextInt();
		max=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("The Biggest of the three numbers is "+max);
	}	
}
