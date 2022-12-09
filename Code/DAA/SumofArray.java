import java.util.*;
class SumofArray 
{
    static int sum(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=a[i];
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Sum is "+sum(a,n));
    }
}
