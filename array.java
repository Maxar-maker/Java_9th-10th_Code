import java.util.*;
public class array
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
        max=a[0];
        for(int j=0;j<10;j++)
        {
            sum+=a[j];
            System.out.println(a[j]);
        }
        
        for(int c=0;c<10;c++)
        {
            if(max<=a[c])
            {
                max=a[c];
            }
            
        }
        System.out.println("The max num is :"+max);
        System.out.println("The total sum is :"+sum);
    }
}