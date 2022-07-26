

//2. Write a program to swap two values using object reference. Your program should have a swap method
class A
{
	int a,b;
	public A()
	{
		a=0;
		b=1;
	}
	public A(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void swap(A ob)
	{
		int temp;
		temp=ob.a;
		ob.a=ob.b;
		ob.b=temp;
	}
	public void printdata()
	{
		System.out.println(a);
		System.out.println(b);

	}
}
class Swapdemo
{
	public static void main(String args[])
	{
		A ob1=new A(12,76);
		ob1.swap(ob1);
		ob1.printdata();
	}
}