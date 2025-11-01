import java.util.*;
public class PG_337_Q1
{
    static int price;
    public static int discount(int a)
    {
        int fp=(price*(100-a))/100;
        return fp;
    }
    public static int discount(int a,int b)
    {
        int fp1=(price*(100-a))/100;
        int fp=(fp1*(100-b))/100;
        return fp;
    }
    public static int discount(int a,int b,int c)
    {
        int fp2=(price*(100-a))/100;
        int fp1=(fp2*(100-b))/100;
        int fp=(fp1*(100-c))/100;
        return fp;
    }
    public static void main()
    {
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter sp");
        price=acr.nextInt();
        System.out.println(discount(10));
    }
}
