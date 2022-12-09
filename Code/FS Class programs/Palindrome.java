import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        int rev=0,r,m=n;
        while(n>0)
        {
            r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        System.out.println("Reverse is "+rev);
        if(rev==m)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        s.close();
    }
}
