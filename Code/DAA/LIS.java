import java.util.*;
class LIS
{
    public int lengthOfLIS(int[] nums)
    {
         //logic
         int max=0;
         int dp[]=new int[nums.length];
         Arrays.fill(dp,1);
         for(int i=1;i<nums.length;i++)
         {
             for(int j=0;j<i;j++)
             {
                 if(nums[i]>nums[j])
                 {
                     dp[i]=Math.max(dp[i],dp[j]+1);
                 }
                 max=Math.max(dp[i],max);
             }
         }
         return max;
         
	}
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();     
   		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
        sc.close();
       System.out.println(new LIS().lengthOfLIS(ar));
    }
}
                