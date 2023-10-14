import java.util.*;
public class Array_2D
{
    public static void main()
    {
        int arr[][]=new int[4][4];
        Scanner scr=new Scanner(System.in);
        int min=arr[0][0];
        int max=arr[0][0];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=scr.nextInt();
                
            }
        }
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
                if(min>arr[i][j])
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("min"+min);
        System.out.println("max"+max);
        int r1=0, c1=0;
        int r2=0, c2=0;
        int r3=0, c3=0;
        int r4=0, c4=0;
        int arr1[][]=new int[4][4]; 
        
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                
                System.out.print(arr[i][j]+"  " );
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr1[j][i]=arr[i][j];
                System.out.print(arr1[j][i]+"  " );
            }
            System.out.println();
        }
        System.out.println();        
        for(int i=0;i<4;i++)
        {
            r1+=arr[0][i];
            c1+=arr[i][0];
        }
        for(int i=0;i<4;i++)
        {
            r2+=arr[1][i];
            c2+=arr[i][1];
        }
        for(int i=0;i<4;i++)
        {
            r3+=arr[2][i];
            c3+=arr[i][2];
        }
        for(int i=0;i<4;i++)
        {
            r4+=arr[3][i];
            c4+=arr[i][3];
        }
        System.out.println("row 1:"+r1);
        System.out.println("row 2:"+r2);
        System.out.println("row 3:"+r3);
        System.out.println("row 4:"+r4);
        System.out.println("col 1:"+c1);
        System.out.println("col 2:"+c2);
        System.out.println("col 3:"+c3);
        System.out.println("col 4:"+c4);
    }
}