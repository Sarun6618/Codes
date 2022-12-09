import java.util.*;
class Gapfull
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int a=sc.nextInt();
        sc.close();
        System.out.print("Nearst gapful number:"+gapful(a));
    }
    public static int gapful(int n)
    {
        for(int i=0;n-i>100;i++)
        {
            boolean low = isGapful(n-i);
            boolean high = isGapful(n+i);
            if(low||high)
            {
                return low?n-i:n+i;
            }
        }
        return 100;
    }
    private static Boolean isGapful(int n)
    {
        String s=""+n;
        int div=Integer.parseInt(""+s.charAt(0)+s.charAt(s.length()-1));
        return n%div==0;
    }
}