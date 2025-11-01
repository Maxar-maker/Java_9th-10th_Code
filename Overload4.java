import java.util.*;
public class Overload4
{
    public void display()
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void display(int s)
    {
        int mod;
        
        while(s>0)
        {
            mod=s%10;
            s=s/10;
            System.out.println(Math.sqrt(mod));
        }
    }
    public static void main()
    {
        Overload4 of=new Overload4();
        of.display(4329);
    }
}