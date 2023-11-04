import java.util.*;
public class Q16_pg389
{
    private int vno;
    private int hours;
    private double bill;
    
    public void display()
    {
        System.out.println(vno);
        System.out.println(hours);
        System.out.println(calculate());
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        int vin=in.nextInt();
        int hour=in.nextInt();
        vno=vin;
        hours=hour;
    }
    public double calculate()
    {
        int t_bill=3;
        double h_bill=(hours-1)*1.5;
        return t_bill+h_bill;
    }
    public static void main()
    {
        Q16_pg389 ob1=new Q16_pg389(); 
       Q16_pg389 ob2=new Q16_pg389 ();      
       ob1.input();
       ob1.display();
       ob2.input();
       ob2.display();
    }
}