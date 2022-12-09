import java.util.*;
class LongestIncreasingSubString
{
    public static int lengthOfLIS(int[] nums) 
    {
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return 1;
        int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        int m=0;
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                    dp[i]=Math.max(dp[i],dp[j]+1);
            }
            m=Math.max(m,dp[i]);
        }
        return m;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        System.out.println(lengthOfLIS(nums));
        s.close();
    }
}