
class Fiboseries
{
	public static void main(String args[])
	{
		int i,fibo,a=0, b=1;
		System.out.println("The first 10 numbers in fibonacci series are:");
		System.out.println(""+a);
		System.out.println(""+b);
		for(i=3;i<=10;i++)
		{
			fibo=a+b;
			a=b;
			b=fibo;
			System.out.println(""+fibo);
		}
			

	}


}