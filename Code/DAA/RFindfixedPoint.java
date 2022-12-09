import java.util.*;
class RFindfixedpoint 
{ 
    static int fixedpoint(int a[], int low, int high)
    {
        //logic
        /* Return -1 if there is no Fixed Point */
        if(low<=high)
        {
            int mid=(low+high)/2;
            if(mid>a[mid])
               return fixedpoint(a,mid+1,high);
            if(mid<a[mid])
               return fixedpoint(a,low,mid-1);
            if(mid==a[mid])
               return mid;
        }
        return -1;
    }
    // main function
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter array size");
       int n = sc.nextInt(); 
       int a[]=new int[n];
       System.out.println("enter the elements of array ");
       for(int i=0;i<n;i++)
       {
          a[i] =sc.nextInt();
       }
       Arrays.sort(a);
       sc.close();
  
        // Printing the array after sorting
        System.out.println("sorted array[]:"+ Arrays.toString(a));
        System.out.println("Fixed Point is "+ fixedpoint(a, 0, a.length-1));
    }
}
