/*
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