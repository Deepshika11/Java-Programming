/*7. Write a Java program that creates a Class namely A that has a private instance variable and method, a protected 
instance variable and method, a default instance variable and method, and a public instance variable and method. 
Create another Class say B that inherits from A.
*/
import java.lang.*;
class A 
{
    private int a;
    protected int b;
    int c;
    public int d;
    public void show_a()
    {
        System.out.println("Value of printable variable a: "+a);
    }
    protected void show_b()
    {
        System.out.println("Value of protected variable b: "+b);
    } 
    void show_c()
    {
        System.out.println("Value of default variable c: "+c);
    }
    public void show_d()
    {
        System.out.println("Value of public variable d: "+d);
    }
}
class B extends A
{
    void update_b()
    {
        b=b+10;
        System.out.println("Updated value of b: "+b);
    }
    void update_c()
    {
        c=c+10;
        System.out.println("Updated value of c: "+c);
    }
    void update_d()
    {
        d=b+c;
        System.out.println("Updated value of d: "+d);
    }
 public static void main(String[] args) 
 {
    B obj= new B();
    //obj.show_a();
    obj.show_b();
    obj.show_c();
    obj.show_d();
    obj.update_b();
    obj.update_c();
    obj.update_d();

 }
} 