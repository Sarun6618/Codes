/*Anik, a student of mathematics is doing a research for his PhD degree.
He thinks if he can complete his work, it will help mankind a lot.
But the problem is as part of his research he needs to check sum of two numbers in a special way.
The numbers themselves will be big enough plus the sum needs to be done in a reversed way.
For example, if two numbers were 24 and 13, we have to first reverse these numbers to make them
42 and 31 and then we have to do the addition so the sum will be 42 + 31 = 73.
Afterwards he needs to output the result as reversed again, so the output will be 37 actually.
One advantage he has is that the input numbers will never have leading zero.
But the resulted sum if has any leading zeroes need to be removed.
For example,
if we have two numbers such as 911 and 199, then the reversed numbers will be 119 and 991
and the sum will be 119 + 991 = 1110.
So, if we reverse, the output should be 0111, but actually we have to consider 111 as output because
we should remove all leading zeroes in final output.
As it is hard for Anik, so he wants to hire a freelancer who can write a small program to help him.
Sample:
input=
199
911
output=
111
input=19
22
output=311
Note: To reverse a number create a new class and method (reverse)
*/
import java.util.*;
class Reverse
{
    public int reverse(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n/=10;
        }
        return sum;
    }
}
class SumReverse
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        Reverse r=new Reverse();
        int c=r.reverse(a);
        int d=r.reverse(b);
        int t=c+d;
        int x=r.reverse(t);
        System.out.println(x);
        s.close();
    }
}