import java.util.*;
class Disarium
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        s.close();
        int rev=0,r,m=n;
        //logic
        while(m>0)
        {
            r=m%10;
            rev=(rev*10)+r;
            m/=10;
        }
        int i=1,sum=0;
        System.out.println("Reverse is "+rev);
        //logic
        int p=rev;
        while(p>0)
        {
            r=p%10;
            sum+=Math.pow(r,i++);
            p/=10;
        }
        System.out.println("Sum is "+sum);
        if(sum==n)
            System.out.println("Disarium");
        else
            System.out.println("Not Disarium");
    }
}