//8. Write a java program to print sum of n terms in the series 1/1! +1/2!+1/3!.....
import java.util.Scanner;
public class SumOfSeries
{
    public static void main(String[] args) {
        double sum=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int n=in.nextInt();
        SumOfSeries obj=new SumOfSeries();
        for (int i=1;i<=n;i++)
        {
            sum=sum+(double)i/(obj.fact(i));
        }       
        System.out.println("The sum of the Series is: "+sum);
    }
    int fact(int x)
    {
        int m=1;
        while(x>0)
        {
            m=m*x;
            x--;
        }
        return m;
    }


}