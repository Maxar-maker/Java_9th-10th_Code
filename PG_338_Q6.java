import java.util.*;
public class PG_338_Q6
{
    
    public static void area(double r)
    {
        System.out.println("Circle "+((22.0/7)*r*r));
        
    }
    public static void area(int side)
    {
        
        System.out.println("Square "+(side*side));
        
    }
    public static void area(int l,int b)
    {
        
        System.out.println("Rec "+(l*b));
    }
    public static void main()
    {
        Scanner acr=new Scanner(System.in);
        double r=acr.nextDouble();
        int side=acr.nextInt();
        int l=acr.nextInt();
        int b=acr.nextInt();
        int ch=acr.nextInt();
        switch(ch)
        {
            case 1:
                area(r);
                break;
            case 2:
                area(side);
                break;
            case 3:
                area(l,b);
                break;
            default:
                System.out.println(" Try again");
        }
    }
}
