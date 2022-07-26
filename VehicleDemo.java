/*
5. Write a java program in which you will declare an abstract class Vehicle inherits this class from two classes car 
and truck using the method engine in both display “car has good engine” and “truck has bad engine”
*/
abstract class Vehicle
{
    abstract void engine();
}

class car extends Vehicle
{
    public void engine()
    {
        System.out.println("car has good engine");
    }
}

class truck extends Vehicle
{
    public void engine()
    {
        System.out.println("truck has bad engine");
    }
}
 
public class VehicleDemo
{
    public static void main(String[] args) 
    {
        Vehicle n= new car(); 
        n.engine();
        Vehicle t=new truck();
        t.engine();
    };
        
}

