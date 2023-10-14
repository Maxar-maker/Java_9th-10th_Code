/*This is the program in page 118 q1.I am Arjun Doss and I am from 9th grade*/
import java.util.*;
public class PG_118_Q1
{
    public static void main()//This is used to find the timeperiod of the simple pendulum
    {
        Scanner a=new Scanner(System.in);// creating a scanner class
        double pi=22/7;
        System.out.println("Enter the length of the string");
        double l=a.nextDouble();//length value from the user
        System.out.println("Enter the gravity of accleration ");
        double g=a.nextDouble();//gravity value from the user
        double T=2*Math.PI*Math.sqrt(l/g);//finding the timeperiod 
        System.out.println("The timeperiod =" +T);//Displaying the timeperiod
    }
}