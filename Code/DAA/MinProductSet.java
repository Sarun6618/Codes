import java.util.*; 
class MinProductSet
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        int nm=Integer.MIN_VALUE;
        int pm=Integer.MAX_VALUE;
        int cn=0,cz=0,p=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                cz++;
                continue;
            }
            if(a[i]<0)
            cn++;
            {
                if(nm<a[i])
                nm=a[i];
            }
            if(a[i]>0)
            {
                if(pm>a[i])
                pm=a[i];
            }
            p=p*a[i];
        }
        if(cz==n)
        System.out.println("0");
        if(cn==0 && cz>0)
        System.out.println("0");
        if(cn==0)
        System.out.println("0");
        if(cn==0 && cz==0)
        System.out.println(pm);
        if(cn>0)
        {
            if(cn%2==0)
            System.out.println(p/nm);
            else
            System.out.println(p);
        }
    }
}