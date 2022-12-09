//Bob was given a set of values by his maths teacher and asked to find out the maximum digit of every value. Help him in finding the maximum digit in a number
import java.util.*;
class MOD
{
    public static void main(String args[])
    {
        //logic
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),r,l=0;
        s.close();
        while(n!=0)
        {
            r=n%10;
            l=Math.max(r,l);
            n/=10;
        }
        System.out.println(l);
    }
}
/*
     input=125364
     output=6

     input=943517
     output=9

*/