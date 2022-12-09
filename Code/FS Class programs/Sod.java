import java.util.*;
class Sod
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        int sum=0,r;
        while(n!=0)
        {
            r=n%10;
            sum=sum+r;
            n/=10;
        }
        System.out.println("Reverse is "+sum);
        s.close();
    }
}
