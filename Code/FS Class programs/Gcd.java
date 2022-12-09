import java.util.*;
class Gcd
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b values a<b");
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();
        int r;
        //logic
        while(a!=0)
        {
            r=b%a;
            b=a;
            a=r;
        }
        System.out.println("Gcd is "+b);
    }
}