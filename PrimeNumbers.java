

//7. Write a java program to print primes up to the given prime number
import java.util.Scanner;
class PrimeNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int num=0;
		String primeNo=" ";
		System.out.println("Enter the value for n:");
		int n =sc.nextInt();
		for (i=1;i<=n;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num ==0)
				{
					count+=1;	
				}
			}
			if(count==2)
			{
				primeNo=primeNo + i + " ";
			}

		}
		System.out.println("The Prime Numbers upto "+ n +" are:");
		System.out.println(primeNo);
		
	}

}