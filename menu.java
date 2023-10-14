import java.util.*;
public class menu
{
    public static void main()
    {
        System.out.println(" Menu\n 1.Add\n 2.Sub\n 3.Multiply\n 4.Exit" );
        Scanner scr=new Scanner(System.in);
        System.out.println("enter your choice" ); 
        int choice=scr.nextInt();
        do
        {
        
        switch(choice)
        {
            case 1:
                System.out.println("enter a and b" );
                int a=scr.nextInt();
                int b =scr.nextInt();
                System.out.println( a+b );
                break;
            case 2:
                System.out.println("enter a and b" );
                int c =scr.nextInt();
                int d =scr.nextInt();
                System.out.println(c-d);
                break;
            case 3:
                System.out.println("enter a and b" );
                int e =scr.nextInt();
                int f =scr.nextInt();
                System.out.println(e*f);
                break;
            case 4:
                System.exit(0);
            default :
                System.out.println("Invalid" );
        }
    }while(true);
}   
}