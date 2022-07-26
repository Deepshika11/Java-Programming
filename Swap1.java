

//6. Write a java Program for swapping two numbers
import java.util.Scanner;
class Swap1
{
	public static void main(String args[])
	{
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Your numbers are "+x+" and "+y);
		t=x;
		x=y;
		y=t;
		System.out.println("Numbers after swapping: "+x+" and "+y);
	
	}
}
