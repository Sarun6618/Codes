import java.util.*;
public class LRS 
{
  public int longestRepeatingSubstring(String s) {
    int n = s.length();
    int[][] dp = new int[n + 1][n + 1];
    int l = 0;

    //logic
    for(int i=1;i<=n;i++)
    {
        for(int j=i+1;j<=n;j++)
        {
            if(s.charAt(i-1)==s.charAt(j-1))
            {
                dp[i][j]=dp[i-1][j-1]+1;
                l=Math.max(l,dp[i][j]);
            }
        }
    }
    return l;
  }

  public static void main(String[] args) 
  {
	  Scanner s=new Scanner(System.in);
	  LRS lrs = new LRS();
	  System.out.println("Enter a string");
	  String ss=s.next();
      s.close();
	  System.out.println("The longest repeating substring is "+lrs.longestRepeatingSubstring(ss));
  }
}
