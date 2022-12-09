import java.util.*;

class LCS 
{
  public int findLongestCommonSubSequence(String word1, String word2) 
  {
    //logic
    int t[][]=new int[word1.length()+1][word2.length()+1];
    int re=0;
    for(int i=1;i<=word1.length();i++)
    {
        for(int j=1;j<=word2.length();j++)
        {
            if(word1.charAt(i-1)==word2.charAt(j-1))
            {
                t[i][j]=t[i-1][j-1]+1;
            }
            else
            {
                t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
            }
            re=Math.max(t[i][j],re);
        }
    }
    return re;
  }
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
    sc.close();
	System.out.println(new LCS().findLongestCommonSubSequence(s1,s2));
   }
}
