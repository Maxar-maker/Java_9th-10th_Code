import java.util.*;
public class Overload2
{
    public double area(double a,double b,double c)
    {
        double s=(a+b+c)/2;
        return(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
    public double area(int a, int b,int height)
    {
        return(1/2)*height*(a+b);
    }
    public double area(double d1,double d2)
    {
        return(1.0/2)*(d1*d2);
    }
    public static void main()
    {
        Overload2 ob=new Overload2();
        System.out.println(ob.area(23.44,23.232)); 
    }
}