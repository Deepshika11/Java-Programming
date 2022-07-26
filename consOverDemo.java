//8. Write a JAVA Program to demonstrate Constructor overloading and Method overloading.
class rect
{
    double l,b;
    rect()
    {
        l=b=0;
        System.out.println("Non-parameter constructor");
    }
    rect(double l1)
    {
        l=b=l1;
        b=b1;
        System.out.println("Two parameter");
    }
    void area()
    {
        System.out.println("Area"+l +b);
    }
}
class consOverDemo
{
    public static void main(String[] args)
    {
        rect ob1= new rect(5.1);
        rect ob2= new rect();
        rect ob3= new rect(5,2);
        ob1.area();
        ob2.area();
        ob3.area();
        rect(rect.ob4)
        {
            this.l=ob4.l;
            this.l=ob4.b;
            
        }
    }
}