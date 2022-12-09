/*
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
import java.util.*;
class LengthOfLongestSubstring 
{
    public static int lengthoflongestsubstring(String s)
    {
        if(s==null || s.equals(" "))
        {
            return 1;
        }
        int st=0,e=0,max=0;
        Set<Character>c=new HashSet<>();
        while(e<s.length())
        {
            if(c.add(s.charAt(e)))
            {
                e++;
                max=Math.max(max,c.size());
            }
            else
            {
                c.remove(s.charAt(st));
                st++;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        String s=r.next();
        System.out.println(lengthoflongestsubstring(s));
        r.close();
    }   
}
