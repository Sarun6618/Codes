import java.util.*;
class Happy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt(),r,sum=n;
        //logic
        while(sum>9)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+(r*r);
                n/=10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("Happy");
        else
            System.out.println("Not Happy");
        s.close();
    }
}
