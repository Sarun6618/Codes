import java.util.*;
class Spy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        s.close();
        int sum=0,r,prod=1;
        //logic
        while(n>0)
        {
            r=n%10;
            sum+=r;
            prod*=r;
            n/=10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+prod);
        if(sum==prod)
            System.out.println("Spy");
        else
            System.out.println("Not a Spy");
    }
}
