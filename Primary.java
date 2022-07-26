/*
//6. Write a Java program that creates a Class, namely Student.
i.Ensure that Age instance variable of the Class is never accessed directly, and its value is never less than 4 and 
greater than 40 for any Object of the Class (use methods to validate and assign the value).
 ii.Ensure that the constructor always assigns a unique value to Enrollment_No instance variable for every Object 
of the Class (use a static class variable for counting objects, say Object_Counter).
 iii.Ensure that when an Object is removed, the Object_Counter is automatically decremented (use finalize()), and 
whenever required the variable can only be accessed using a method even without an Object reference (make the 
counter private and use a static method to access it)
*/
import java.util.Scanner;
class Student
{
    protected int age;
    private static int Object_Counter=0;
    Student()
    {
        Object_Counter+=1;
        int Enrollment_No=Object_Counter;
        System.out.println("Number of Object Created: "+Enrollment_No);
    }
    void validate(int a)
    {
        if(a>=4 && a<=40)
        {
            System.out.println("Value Assigned Succesfully.");
            age=a;
        }
        else
        {
            System.out.println("Error:Enter age between 4-40");
        }
    }
    protected void finalize()
    {
        Object_Counter-=1;
    }
    public static void Display()
    {
        System.out.println("After Calling finalize() number of objects:");
        System.out.println(Object_Counter);
    }
}
public class Primary extends Student
{
    public static void main(String[] args)
    {
        int n;
        Student ob1 = new Student();
        Student ob2 = new Student();
        Student ob3 = new Student();
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        ob1.validate(n);
        ob3.finalize();
        Display();
        sc.close();
    }
}