/* 1. Write a program to create a class Student2 along with two method getData(),printData() to get the value 
through argument and display the data in printData. Create the two objects s1 ,s2 to declare and access the 
values from class STtest.*/

class Student2
{
    String Name;
    int RollNo;
     void getData(String n,i nt a)
    {
         Name = n;
         RollNo = a;
    }
    void printData()
    {
        System.out.println("Name : "+Name);
        System.out.println("Roll No : "+RollNo);
    }
}
class STest
{
    public static void main(String[] args) 
    {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.getData("Deepshika",15);
        s2.getData("Prerna",24);
        s2.printData();
        s1.printData();
        
    }

}