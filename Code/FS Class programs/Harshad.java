import java.util.*;
class Harshad
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println("Sum is "+sum);
        if(n%sum==0)
        {
            System.out.println("Harshad");
        }
        else
        {
            System.out.println("Not Harshad");
        }
        s.close();
    }
}