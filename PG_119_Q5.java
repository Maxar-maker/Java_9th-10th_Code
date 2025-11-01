/*This is the program in page 119 q5.I am Arjun Doss and I am from 9th grade*/
import java.util.*;
public class PG_119_Q5
{
    public static void main()//This is used to find the timeperiod of the simple pendulum
    {
        Scanner a=new Scanner(System.in);// creating a scanner class
        System.out.println("Enter amount");
        double Amount=a.nextDouble();
        int Rate=5;
        double I1=(Amount*1*Rate)/100;
        double amt1=Amount+I1;
        double I2=(amt1*1*Rate)/100;
        double amt2=amt1+I1;
        double I3=(amt2*1*Rate)/100;
        double amt3=amt2+I1;
        System.out.println("1st year");
        System.out.println(amt1);
        System.out.println("2nd year");
        System.out.println(amt2);
        System.out.println("3rd year");
        System.out.println(amt3);
    }
}