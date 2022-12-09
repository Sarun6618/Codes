import java.util.*;
class FixedPoint 
{
    public int fixedPoint(int[] A) 
    {
        int l = 0, r = A.length - 1;
        //logic
        while(l<r)
        {
            int mid=(l+r)/2;
            if(mid>A[mid])
               l=mid+1;
            else
               r=mid;
        }
        if(l==A[l])
           return l;
        else
           return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sc.close();
        System.out.println(new FixedPoint().fixedPoint(arr));
    }
}