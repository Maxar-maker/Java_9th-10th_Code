import java.util.*;
public class Overload3
{
    public void joystring(String s,char ch1,char ch2)
    {
        for(int i=0;i<s.length();i++)
        {
            int a=0;
            if((int)s.charAt(i)==(int)(ch1))
            {
                ch2=s.charAt(i);
            }
            a++;
        }
    }
    public void joystring(String s)
    {
        char a=' ';
        for(int i=0;i<s.length();i++)
        {
            if((int)a==(int)s.charAt(i))
            {
                System.out.println(i);
                break;
            }
        }
        for(int j=s.length();j<0;j--)
        {
            if((int)a==(int)s.charAt(j))
            {
                System.out.println(j);
                break;
            }
        }
    }
    public void joystring(String s1,String s2)
    {
        System.out.println(s1+" " +s2);
    }
    public static void main()
    {
        Overload3 ob=new Overload3();
        ob.joystring("I have a name"); 
    }
}