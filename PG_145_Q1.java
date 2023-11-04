/*This is the program in page 119 q5.I am Arjun Doss and I am from 9th grade*/
import java.util.*;
public class PG_145_Q1
{
    public static void main()//This is used to find the timeperiod of the simple pendulum
    {
        Scanner a=new Scanner(System.in);// creating a scanner class
        System.out.println("Enter amount");
        double num1=a.nextDouble();
        double num2=a.nextDouble();
        double num3=a.nextDouble();
        double greatest=Math.max(Math.max(num1,num2),num3);
        double smallest=Math.min(Math.min(num1,num2),num3);
        System.out.println(greatest);
        System.out.println(smallest);
    }
}