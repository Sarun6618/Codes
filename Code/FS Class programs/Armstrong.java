import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        int sum=0,r,m=n;
        while(m!=0)
        {
            r=m%10;
            sum+=Math.pow(r,3);
            m/=10;
        }
        System.out.println("Sum is "+sum);
        if(sum==n)
        System.out.println("Neon");
        else
        System.out.println("Not Neon");
        s.close();
    }
}