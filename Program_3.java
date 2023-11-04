import java.util.*;
public class Program_3
{
    public static void main()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter is distance");
        double dis=a.nextDouble();
        if (dis<=5)
        {
            System.out.println("$100");
        }
        else if(dis<=15)
        {
            System.out.println("$"+(dis*10));
        }
        else if (dis<= 25)
        {
            System.out.println("$"+(dis*8));
        }
        else
        {
            System.out.println("$"+dis*5);
        }
    }
}