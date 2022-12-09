import java.util.*;
class palindromeString
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        String a=r.next();
        a=a.toLowerCase();
        int j=a.length()-1;
        String s="";
        r.close();
        for(int i=j;i>=0;i--)
        {
            s+=a.charAt(i);
        }
        if(a.equals(s))
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
    }
}