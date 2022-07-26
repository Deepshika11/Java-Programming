 /*2.WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and 
obj2 passed two arguments so that this constructor gets invoked after creation of obj1 and obj2 */
class PConstructor 
{
    PConstructor(int id, String name)
    {
        int idNO=id;
        String Name=name;
        System.out.println("ID : "+idNO);
        System.out.println("Nmae : "+Name);
    }
    public static void main(String[] args)
    {
      PConstructor obj1=new PConstructor(001,"Abc");
      PConstructor obj2=new PConstructor(002,"Bcd");

        
    }
}