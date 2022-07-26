/*
4. Write a java program in which you will declare two interface sum and
 Add. Inherits these interface through class A1 and display their content.
*/
interface sum
{
    int sum=50;
    void suma();
}
interface add
{
    int add=25;
    void adda();
}

class Interface implements add,sum
{
    public void suma()
    {
        System.out.println(+sum);
    }

    public void adda()
    {
        System.out.println(+add);
    }

    public static void main(String[] args) {
        Interface n = new Interface();
        n.adda();
        n.suma();
    }
}

