public class OverloadF
{
public static void print()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println(" " );
        }
    }
    public static void print(int num)
    {
        int e=0;
        int o=0;
        int mod=0;
        while(num>0)
        {
            mod=num%10;
            num/=10;
            if(mod%2==0)
            {
                e+=mod;
            }
            else
            {
               o+=mod; 
        }
    }
    if(o==e)
    {
        System.out.println("lead no");
    }
    else
    {
        System.out.println("not a lead no");
    }
}
public static void main()
{
    print();
    print(3669);
}
}