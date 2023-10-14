import java.util.*;
public class Overload
{
    public void compare(int a,int b)
    {
        if(a>b)
        {
            System.out.println("The larger one is:"+a);
        }
        else if(a<b)
        {
            System.out.println("The larger one is:"+b);
        }
        else
        {
            System.out.println("they are equal" );
        }
    }
    public void compare(char a,char b)
    {
        if((int)a>(int)b)
        {
            System.out.println("The larger one is:"+a);
        }
        else if((int)a<(int)b)
        {
            System.out.println("The larger one is:"+b);
        }
        else
        {
            System.out.println("they are equal" );
        }
    }
    public void compare(String a,String b)
    {
        if(a.length()>b.length())
        {
            System.out.println("The larger one is:"+a);
        }
        else if(a.length()<b.length())
        {
            System.out.println("The larger one is:"+b);
        }
        else
        {
            System.out.println("they are equal" );
        }
    }
    public static void main()
    {
        Overload ob=new Overload();
        ob.compare(15,190); 
    }
}