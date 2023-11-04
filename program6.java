import java.util.*;
public class program6
{
    public static void main()
    {
        int count=0,sum=0;
        Scanner scr=new Scanner(System.in);
        System.out.println(" Enter no of terms wanted" );
        int no_Term=scr.nextInt();
        double c=0;
        while(c<400)
        {
            count++;
            c=Math.pow(count,2);
            System.out.println(c);
            sum+=c;
        }
        System.out.println(sum);
    }
}