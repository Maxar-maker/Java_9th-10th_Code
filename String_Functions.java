import java.util.*;
public class String_Functions
{
    public static void main()
    {
        Scanner scr=new Scanner(System.in);
        String s= scr.nextLine();
        s=s.trim();
        int cc=0;
        String l="";
        for(int i=0;i<s.length();i++)
        {
            l=s.substring(i,i+1);
            if(l.equals(""))
            {
                cc++;
            }
        }
        cc++;
        cc++;
        System.out.println(cc);
    }
}