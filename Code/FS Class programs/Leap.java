/*Rohit was given a task by his mathematics teacher to check whether a given year is a leap year or not. Write a program to help him check whether the year is leap or not */
import java.util.*;
class Leap
{
    public static void main(String[] args)
    {
        //create Scanner object
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a year");
        //read year
        int y=s.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
        s.close();
    }
}