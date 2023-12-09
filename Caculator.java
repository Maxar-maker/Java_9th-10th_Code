import java.util.*;
public class Caculator
{
    Scanner scr=new Scanner(System.in);
    public void add()
    {
        System.out.println("enter 2 num" );
        int a=scr.nextInt();
        int b=scr.nextInt();
        System.out.println(" Add:" + (a+b));
    }
    public void sub()
    {
        System.out.println("enter 2 num" );
        int a=scr.nextInt();
        int b=scr.nextInt();
        System.out.println(" Add:" + (a-b));
    }
    public void multi()
    {
        System.out.println("enter 2 num" );
        int a=scr.nextInt();
        int b=scr.nextInt();
        System.out.println(" Add:" + (a*b));
    }
    public void divide()
    {
        System.out.println("enter 2 num" );
        int a=scr.nextInt();
        int b=scr.nextInt();
        if(b==0)
        {
            System.out.println(" 0" );
        }
        else
        {
         System.out.println(" Add:" + (a/b));   
        }
        
    }
    public static void main()
    {
        Caculator ob=new Caculator();
        Scanner in=new Scanner(System.in);
        System.out.println("choose your op: 1.add\n2.sub\n3.multi\n.4divide\n5.stop");
        int ch=in.nextInt();
        switch(ch)
        {
            case 1:
                ob.add();
                ob.main();
            case 2:
                ob.sub();
                ob.main();
            case 3:
                ob.multi();
                ob.main();
            case 4:
                ob.divide();
                ob.main();
            case 5:
                System.exit(0);
            default:
                System.out.println(" try agin" );
                ob.main();
        }
    }
}