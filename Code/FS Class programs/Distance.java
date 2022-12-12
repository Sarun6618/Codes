/*
On networks where data streams are delivered for single-bit mistakes we are sending numbers from one end to another end. If the same number that is passed from one end if received at the other end there is no problem. But if a different number is received at the other end, we must find the number of bits that are differing from the sending end and receiving end. Write a java program to count the number of differing bits between the sender and receiver numbers
input =4 6
output =1
input =15 68
output =4
*/
import java.util.*;
class Distance
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int ct=0;
        for(int i=0;i<32;i++)
        {
            if(((a>>i)&1)!=((b>>i)&1))
            {
                ct++;
            }
        }
        System.out.println(ct);
        s.close();
    }
}