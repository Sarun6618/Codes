import java.util.*;

class MinCostClimbingStairs 
{
	public int minCostClimbingStairs(int[] cost) 
	{
		//logic
		int n=cost.length;
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    if(i<2)
		    dp[i]=cost[i];
		    else
		    dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
		}
		return Math.min(dp[n-1],dp[n-2]);
	}
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();     
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
        sc.close();
    System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(ar));
    }
}