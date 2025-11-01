import java.util.*;
public class PG_240_Q4
{
    public static boolean prime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main()
    {
        int a[]= new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 10 numbers " );
        for(int i=0;i<10;i++)
        {
            a[i]=acr.nextInt();
        }
        
        for(int c=0;c<10;c++)
        {
            if(prime(a[c]))
            {
                System.out.print(a[c]+",");
            }
        }
        
        
        
    }
}