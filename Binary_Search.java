import java.util.*;
public class Binary_Search
{
    public static int bin(int[]a)
    {
        int l=a.length ;
        int f=0;
        int mid=0;
        int found=0;
        int find=2006;
        while(f!=l)
        {
            mid=(int)(l+f)/2;
            if(a[mid]>find)
            {
                l=mid;
            }
            else if(a[mid]<find)
            {
                f=mid;
            }
            else if(a[mid]==find)
            {
                found=mid;
                return found;
            }
            else
            {
                continue;
            }
        }
        return 0;
    }
    public static void main()
    {
        int a[]= new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 10 sorted years " );
        for(int i=0;i<10;i++)
        {
            a[i]=acr.nextInt();
        }
        if(bin(a)!=0)
        {
           System.out.println((bin(a)+1)); 
        }
        else
        {
             System.out.println(" Not there" ); 
        }
    }
}
