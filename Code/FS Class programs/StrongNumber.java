import java.util.*;
class StrongNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),x=n,sum=0;
        s.close();
        while(n>0)
        {
            int r=n%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum+=f;
            n/=10;
        }
        if(sum==x)
        {
            System.out.println(1);
        }
        else
        System.out.println(0);
    }
}