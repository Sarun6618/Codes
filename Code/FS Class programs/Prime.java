//Given a number identify the next highest prime palindrome number
import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int m=r.nextInt();
        for(int k=n;k<=m;k++)
        {
            int flag=0;
            for(int i=2;i<=k/2;i++)
            {
                if(k%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(k);
        }
        r.close();
    }
}