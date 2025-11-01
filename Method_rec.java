import java.util.*;
public class Method_rec
{
    private int a;
    private int b;
    //private double area;
    public void display()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(calculate());
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        int lenght=in.nextInt();
        int breath=in.nextInt();
        a=lenght;
        b=breath;
    }
    public double calculate()
    {
        return a*b;
    }
    public static void main()
    {
       Method_rec ob1=new Method_rec(); 
       Method_rec ob2=new Method_rec();
       ob1.input();
       ob1.display();
       ob2.input();
       ob2.display();
    }
}