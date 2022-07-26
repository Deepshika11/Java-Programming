
class outer
{
	int m=10;
	class inner
	{
		int n=20;
		class innermost
		{
			int i=30;
			void display()
			{
				System.out.println("m = "+m);
				System.out.println("n = "+n);
				System.out.println("i = "+i);
			}
		}
	}
}

class nesteddemo
{
	public static void main(String arg[])
	{
		outer outobj=new outer();
		outer.inner inobj=outobj.new inner();
		outer.inner.innermost innobj=inobj.new innermost();
		innobj.display();
	}
}