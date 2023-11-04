import java.util.*;
public class PG_240_Q3
{
    public static void main()
    {
        int a[]= new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 10 numbers " );
        int max;
        int sum=0;
        for(int i=0;i<10;i++)
        {
            a[i]=acr.nextInt();
        }
        
        for(int c=0;c<10;c++)
        {
            if(a[c]<0)
            {
                System.out.print(a[c]+"  ");
            }
            
        }
        for(int c=0;c<10;c++)
        {
            if(a[c]==0)
            {
                System.out.print(a[c]+"  ");
            }
            
        }
        for(int c=0;c<10;c++)
        {
            if(a[c]>0)
            {
                System.out.print(a[c]+"  ");
            }
            
        }
        
        
    }
}