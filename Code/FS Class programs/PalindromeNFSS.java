/*
Mr. Parandamayya is working with Strings.
He is given a String S. He has to find the palindromes in S,
A palindrome can be a substring of S (Strictly substrings only, not subsequences).
Your task is to find the count the number of palindromes can be formed from S.
NOTE: Count each occurence of palindromes if duplicate substrings found.
Input Format:
-------------
A string S
Output Format:
--------------
Print an integer, number of palindromes.
Sample Input-1:
---------------
divider
Sample Output-1:
----------------
9
Explanation:PalindromeNFSS
-------------
Palindromes are d, i, v, i, d, e, r, ivi, divid
Sample Input-2:
---------------
abcdef
Sample Output-2:
----------------
6
Explanation:
-------------
Palindromes are a, b, c, d, e, f.
==== testcases ====
case =1
input =radarracecar
output =19
case =2
input =tattarrattat
output =24
case =3
input =nolemonnomelon
output =21
case =4
input =wasitcatisawinmygymmadam
output =29
case =5
input =wasitcatisawinmygymmadammadamitsaradarborroworrob
output =74
*/
import java.util.*;
class PalindromeNFSS
{
    static int dp[][]=new int[1001][1001];
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        System.out.println(countSubstrings(st));
        s.close();
    }
    public static int countSubstrings(String st)
    {
        for(int[] row:dp)
        Arrays.fill(row,-1);
        int n=st.length();
        int ct=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPal(st,i,j)!=0)
                ct++;
            }
        }
        return (ct+st.length());
    }
    public static int isPal(String st,int i,int j)
    {
        if(i>j)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(st.charAt(i)!=st.charAt(j))
        return dp[i][j]=0;
        return dp[i][j]=isPal(st,i+1,j-1);
    }
}
