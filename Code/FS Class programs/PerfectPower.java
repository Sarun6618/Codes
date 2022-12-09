/* Write a java program to find given number is perfect power or not
Given a positive integer which fits in a 32 bit signed integer,
find if it can be expressed as A^P where 10 > P > 1 and A > 0.
A and P both should be integers.
Sample input/output
input=125
output=True
explanation
as 5^3 = 125.
input=5
output=False
*/
import java.util.*;
class PerfectPower
{
    static boolean perfect(int n)
    {
        for(int i=2;i<10;i++)
        {
            for(int j=2;j<10;j++)
            {
                if((int)Math.pow(i,j)==n)
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(perfect(n))
        System.out.println("True");
        else
        System.out.println("False");
        s.close();
    }
}