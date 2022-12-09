import java.util.*;
class Palindrome_Number
{
    public static boolean isPalindrome(int x)
    {
        int o=x,r=0;
        while(x>0)
        {
            r=x%10+r*10;
            x=x/10;
        }
        return r==o?true:false;
    }
    public static void main(String argss[])
    {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        System.out.println(isPalindrome(num));
        r.close();
    }
}