

class add
{
	void display(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum of "+ a +" & "+ b +" is " + c);
	}
	void display(double a,double b)
	{
		double c=a+b;
System.out.println("The sum of "+ a +" & "+ b +" is " + c);
	}
}

class add_demo
{
	public static void main (String arg[])
	{
		add obj=new add();
		obj.display(10,12);
		obj.display(10.2,20.2);
	}
}