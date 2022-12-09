import java.util.*; 
class BinarySearch 
{
    static int bsearch(int a[],int x)
    {
        //logic
        int l=0,u=a.length-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(x>a[mid])
            {
                l=mid+1;
            }
            else if(x<a[mid])
            {
                u=mid-1;
            }
            else
            {
                return mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println("Enter element to search");
        int x=s.nextInt();
        int p=bsearch(a,x);
        s.close();
        if(p==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position "+p);
    }
}