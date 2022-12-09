import java.util.*;
class CubePoint
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
        System.out.println(cubepoint(a,n));
    }
    static int cubepoint(int []a,int n)
    {
        int l=0,u=n-1;
        while(l<u)
        {
            int mid=(l+u)/2;
            if(mid>a[mid])
            {
                l=mid+1;
            }
            else
            {
                u=mid;
            }                 
        }
        return l==a[l]?l:-1;
    }
}