import java.util.*;

class MaxSubArray1
{
	public int maxSubArray(int[] A) 
	{
        
        //dp[i] means the maximum subarray ending with A[i];
        //logic
        int max=Integer.MIN_VALUE;
        int n=A.length;
        int dp[]=new int[n];
        dp[0]=A[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=A[i]+(dp[i-1]>0?dp[i-1]:0);
            max=Math.max(max,dp[i]);
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
	System.out.println(new MaxSubArray1(). maxSubArray(ar));
	}
}
