import java.util.*;
public class PG_242_12
{
    public static void main()
    {
        int P[]= new int [6];
        int Q[]= new int [4];
        int R[]=new int [10];
        Scanner acr=new Scanner(System.in);
        System.out.println("Enter 6 numbers " );
        int count=0;
        for(int i=0;i<6;i++)
        {
            P[i]=acr.nextInt();
            R[count]=P[i];
            count++;
        }
        System.out.println("Enter 4 numbers " );
        for(int i=0;i<4;i++)
        {
            Q[i]=acr.nextInt();
            R[count]=Q[i];
            count++;
        }
        
        
        for(int c=0;c<10;c++)
        {
            System.out.println(R[c]);
        }
        
        
        
    }
}