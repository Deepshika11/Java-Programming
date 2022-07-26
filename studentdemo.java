

import java.lang.*;

class student
{
	String name; 
	int marks1,marks2,marks3,regno;

	//null constructor 
	student()
	{
		name="raju";
		regno=12345;
		marks1=56;
		marks2=47;
		marks3=78;
	}
	//parameterised constructor
	student(String n,int r,int m1,int m2,int m3)
	{
		name=n;
		regno=r;
		marks1=m1;
		marks2=m2;
		marks3=m3;
	}
	//copy constructor 
	student(student s)
	{
		name=s.name;
		regno=s.regno;
		marks1=s.marks1;
		marks2=s.marks2;
		marks3=s.marks3;
	}
	void display()
	{
		System.out.println(name+"\t"+regno+"\t"+marks1+"\t"+marks2+"\t"+marks3+"\t");
	}
}

class studentdemo
{
	public static void main(String arg[])
	{
		
		student s1=new student();
		student s2=new student("john",34266,58,96,84); 
		student s3=new student(s1);
		s1.display();
		s2.display();
		s3.display();
	}
}