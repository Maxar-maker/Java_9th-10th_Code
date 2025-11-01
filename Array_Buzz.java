import java.util.*;
public class Array_Buzz
{
    public static boolean buzz(int num)
    {
        boolean y=true;
        int n2=7;
        int n1=num;
        int mod=num%10;
        if(mod!=n2||n1%7==0)
        {
            y=false;
        }
        return y;
    }
    public static boolean perfect(int num)
    {
        int n1=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                n1+=i;
            }
        }
        if(n1==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(int n)
    {
        int a[]= new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 10 numbers " );
        
        for(int i=0;i<10;i++)
        {
            a[i]=acr.nextInt();
        }
        
        switch(n)
        {
            case 1:
                for(int c=0;c<10;c++)
            {
                if(buzz(a[c]))
                {
                System.out.print(a[c]+",");
                }
            }
            
            case 2:
                for(int c=0;c<10;c++)
            {
                if(perfect(a[c]))
                {  
                System.out.print(a[c]+",");
                }
            }
        }
        
        
        
        
    }
}