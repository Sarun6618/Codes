/*Write a program to check if a given number is COMPLETE NUMBER or NOT

     A Number is said to be COMPLETE NUMBER if the individual digits of the number are all even
     if the individual digits of the number are not even then print NOT COMPLETE NUMBER

     Assume 0 as a Even Number

     input = 486
    output = COMPLETE NUMBER

    input = 135
    output = NOT COMPLETE NUMBER

    input = 100
    output = NOT COMPLETE NUMBER

    */
import java.util.*;
class CompleteNo
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
            int r=n%10;
            if(r%2==1)
            {
                System.out.println("NOT COMPLETE NUMBER");
                System.exit(0);
            }
            else
            n/=10;
        }
        System.out.println("COMPLETE NUMBER");
        s.close();
    }
}