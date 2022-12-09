import java.util.*;
class BinarySearch {
    public static int search(int[] nums,int t)
    {
        int l=0,u=nums.length-1,mid;
        while(l<=u)
        {
            mid=(l+u)/2;
            if(t>nums[mid])
                l=mid+1;
            else if(t<nums[mid])
                u=mid-1;
            else
                return mid;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=r.nextInt();
        }
        int t=r.nextInt();
        System.out.println(search(nums,t));
        r.close();
    }
}
