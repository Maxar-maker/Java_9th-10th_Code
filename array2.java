import java.util.*;
public class array2
{
    public static void main()
    {
        int a[]= new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 10 total marks in 5 sub " );
        int sum;
        int a1=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        for(int i=0;i<10;i++)
        {
            a[i]=acr.nextInt();
        }
        
        
        
        for(int h=0;h<10;h++)
        {
            if((a[h]/5)>90)
            {
                a1++;
            }
            else if((a[h]/5)>80)
            {
                b++;
            }
            else if((a[h]/5)>70)
            {
                c++;
            }
            else if((a[h]/5)>60)
            {
                d++;
            }
            else if ((a[h]/5)>50)
            {
                e++;
            }
            else
            {
                f++;
            }
                        
        }
        
        System.out.println("No. of students who got A:"+a1 );
        System.out.println("No. of students who got B:"+b );
        System.out.println("No. of students who got C:"+c);
        System.out.println("No. of students who got D:"+d );
        System.out.println("No. of students who got E:"+e );
        System.out.println("No. of students who got F:"+f );
        
    }
}