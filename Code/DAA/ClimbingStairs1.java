import java.util.*;
class ClimbingStairs1 
{
	public int climbStairs(int n) 
    {
       //logic
       int dp[]=new int[n+1];
       dp[1]=1;
       dp[2]=2;
       for(int i=3;i<=n;i++)
       {
           dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
   
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        sc.close();
		System.out.println(new ClimbingStairs1().climbStairs(n));
    }
}
