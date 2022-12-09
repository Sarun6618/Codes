import java.util.*;
class XP
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=s.nextInt();
        n=Math.abs(n);
        int sed=0,smd=0,r;
        //logic
        r=n;
        while(r!=0)
        {
            if(r==n||r<10)
            {
                sed+=r%10;
            }
            else
            {
                smd+=r%10;
            }
            r=r/10;
        }
        if(sed==smd)
            System.out.println("Xylem");
        else
            System.out.println("Phloem");
        s.close();
    }
}