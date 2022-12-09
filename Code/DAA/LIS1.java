import java.util.*;

class LIS1 
{
    public int lengthOfLIS(int[] nums)
    {
         //logic
         if(nums.length==0)
         return 0;
         TreeSet<Integer>ts=new TreeSet<>();
         for(int x:nums)
         {
             Integer hore=ts.ceiling(x);
             if(hore==null)
             {
                 ts.add(x);
             }
             else
             {
                 ts.remove(hore);
                 ts.add(x);
             }
         }
         return ts.size();
         
	}
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();     
   		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
        sc.close();
       System.out.println(new LIS1().lengthOfLIS(ar));
    }
}
                