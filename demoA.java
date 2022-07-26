/*
3. Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for 
class B and display the text “call me from B” 
*/

abstract class A 
{
    abstract void display();

}
class B extends A
{
    void display()
    {
        System.out.println("call me from B");

    }
}

class demoA
{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();  
    }
   
}