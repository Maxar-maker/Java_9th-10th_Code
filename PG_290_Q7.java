import java.util.*;
public class PG_290_Q7
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        String s= scr.nextLine();
        s=s.trim();
        String c="";
        String l="";
        for(int i=0;i<s.length();i++)
        {
            l=s.substring(i,i+1);
            char b=s.charAt(i);
            if(l.equals("A")||l.equals("E")||l.equals("I")||l.equals("O")||l.equals("U"))
            {
                c+="*";
            }
            else
            {
                c+=l;
            }
        }
        System.out.println(c);
        System.out.println(s);
    }
}