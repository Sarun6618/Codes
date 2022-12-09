import java.util.*;
class Neon
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        int sum=0,r,m;
        r=n*n;
        while(r!=0)
        {
            m=r%10;
            sum=sum+m;
            r=r/10;
        }
        System.out.println("Sum is "+sum);
        if(sum==n)
        System.out.println("Neon");
        else
        System.out.println("Not Neon");
        s.close();
    }
}