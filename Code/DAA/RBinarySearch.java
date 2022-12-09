import java.util.*;
class RBinaarySearch  
{
    static int rbsearch(int a[],int l,int u,int x)
    {
        //logic
        int mid=(l+u)/2;
        if(a[mid]==x){
            return mid+1;
        }
        else if(a[mid]>x){
            return rbsearch(a,l,mid-1,x);
        }
        else{
            return rbsearch(a,mid+1,u,x);
           
        }
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
        int p=rbsearch(a,0,a.length-1,x);
        s.close();
        if(p==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position "+p);
    }
}