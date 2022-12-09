import java.util.*;
class PrimeAlter
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int m=r.nextInt(),ct=0;
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
            {
                ct++;
                if(ct%2==0)
                {
                    System.out.println(k);
                }
            }
        }
        r.close();
    }
}