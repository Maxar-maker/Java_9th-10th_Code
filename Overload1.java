import java.util.*;
public class Overload1
{
    public void polygon(int a,char b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(b);
            }
            System.out.println();
        }
    }
    public void polygon(int a, int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public void polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Overload1 ob=new Overload1();
        ob.polygon(41,'O'); 
    }
}